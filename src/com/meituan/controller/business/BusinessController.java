package com.meituan.controller.business;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.meituan.pojo.Business;
import com.meituan.pojo.Goods;
import com.meituan.service.business.BusinessService;

import sun.misc.BASE64Decoder;

@Controller
@RequestMapping("/business")
public class BusinessController {

	@Resource(name = "BusinessService")
	private BusinessService businessService;
	

	
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String Update(HttpServletRequest request,String bId,String bShopname,String sStatetype,String sResponsible,String sTelephone,String sAddress,String sHours) {

		Business b=businessService.findBusiness(bId);

		b.setbShopname(bShopname);
		b.setsStatetype(sStatetype);
		b.setsResponsible(sResponsible);
		b.setsTelephone(sTelephone);
		b.setsAddress(sAddress);
		b.setsHours(sHours);
		
		businessService.updateBussiness(b);
		return "business";
	}

	/**
	 * 查找还有多少条未认证
	 * 
	 * @return
	 */
	@RequestMapping(value = "/count")
	@ResponseBody
	public int count() {

		return businessService.count();
	}

	/**
	 * 拒绝认证
	 * 
	 * @return
	 */
	@RequestMapping("/reject")
	public String reject(String regectBId,String sNotreason) {
		businessService.reject(regectBId,sNotreason);
		return "identification";
	}

	/**
	 * 接受认证
	 * 
	 * @return
	 */
	@RequestMapping("/accept")
	public String accept(String bId) {
		businessService.accept(bId);
		return "identification";
	}

	/**
	 * 找到未认证的一条记录
	 * 
	 * @return
	 */
	@RequestMapping("/findBusinessWithoutIdentify")
	@ResponseBody
	public Business findBusinessWithoutIdentify() {
		return businessService.findBussinessWithoutIdentify();
	}

	/**
	 * 找到所有的用户记录，一次返回，由前端进行分页
	 * 
	 * @param model
	 * @return
	 */

	@RequestMapping("/delBusiness")
	public String delUser(Model model, String bId) {
		businessService.delBusiness(bId);
		return "business";
	}

	/**
	 * 找到所有的用户记录，一次返回，由前端进行分页
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Business> findAll(Model model) {
		List<Business> result = businessService.findAllBussiness();
		return result;
	}
	
	//--------------商家端代码------------
	/**
	 * 添加商品
	 * @param request
	 * @param shopName
	 * @param describe
	 * @param type
	 * @param price
	 * @param inventory
	 * @param putaway
	 * @param file
	 * @return
	 */
	@RequestMapping(value="/addmerchandise", method = RequestMethod.POST)
	public String addMerchandise(HttpServletRequest request, String shopName, String describe , String type ,Double price,
			Integer inventory,String putaway,@RequestParam("imgA") MultipartFile file) {
		if(shopName==null||price==null||inventory==null){
			request.setAttribute("msg", "请将信息填写完整");
		}else{
		Goods goods = new Goods();
		String bId= "b1";
		goods.setbId(bId);
		String gId = UUID.randomUUID().toString().replace("-", "");//生成随机id号
		goods.setgId(gId);
		goods.setgName(shopName);
		goods.setgDetail(describe);
		goods.setgType(type);
		goods.setgPrice(price);
		goods.setgStock(inventory);
		goods.setgAdd(new Date());
		
		String picture = savePhoto(request, file,"goods", gId);//转存图片
		goods.setgPicture(picture);
		if("".equals(putaway)){
			goods.setgSale(0);
		}else{
			goods.setgSale(1);
		}
		businessService.insertGoods(goods);
		request.setAttribute("msg", "添加成功");
		}
		return "/business/addMerchandise";
		
	}
	
	/**
	 * 注册并上传资料
	 * @param request
	 * @param business
	 * @param file
	 * @return
	 */
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request,Business business,@RequestParam("imgA1") MultipartFile file1,
			@RequestParam("imgA2") MultipartFile file2,@RequestParam("imgA3") MultipartFile file3,
			@RequestParam("imgA4") MultipartFile file4,@RequestParam("imgA5") MultipartFile file5){
		String id = business.getsRphone();
		business.setbId(id);//联系人手机号当做验证码

		business.setbShoplogo(savePhoto(request, file1, "logo", id));
		business.setsLicense(savePhoto(request, file2, "license", id));
		business.setsIdcardpos(savePhoto(request, file3,"pos", id));
		business.setsIdcardback(savePhoto(request, file4, "back", id));
		business.setsHygiene(savePhoto(request, file5, "hygiene", id));
		business.setbIsban(0);
		business.setsStatetype("未认证");
		business.setsApply(new Date());
		businessService.insertSelective(business);
		return "business/registerSuccess";
		
	}
	/**
	 * 验证要注册的手机号是否已经注册过了，（将手机号作为bId）
	 * @param bId
	 * @return
	 */
	@RequestMapping("/verifyBId")
	@ResponseBody
	public Boolean verifyBId(String bId){
		Business b = businessService.selectByPrimaryKey(bId);
		if(b!=null){
			return false;//存在说明已经注册过了
		}else{
			return true;
		}
	}
	public String savePhoto(HttpServletRequest request,MultipartFile file,String url,String id){
		String picture="default.jpg";
		if (!file.isEmpty()) {
			try {

				String filePath = request.getSession().getServletContext().getRealPath("/") + "business/" +url+"/" + id + "_"
						+ file.getOriginalFilename();
				picture=id+"_"+file.getOriginalFilename();
				// 转存文件
				file.transferTo(new File(filePath));
				System.out.println(filePath);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return picture;
	}
	
	/**
	 * 登录验证
	 * @param request
	 * @param sRphone
	 * @param bAccountpassword
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpServletRequest request,String bId,String bAccountpassword){
		
		if(bId==""){
			return "请输入账号";
		}else{
			Business b = businessService.selectByPrimaryKey(bId);
			System.out.println(b);
			if(b==null){
				return "账户不存在";
			}else{
				if(!bAccountpassword.equals(b.getbAccountpassword())){
					return "账户或密码错误";
				}else if("未认证".equals(b.getsStatetype())){
					return "管理员尚未认证，请等待";
				}else{
					request.getSession().setAttribute("businessName", bId);;
					return "登录成功";
				}
			}
		}
	}
	
	@RequestMapping("/identification")
	public String identification(HttpServletRequest request){
		
		String bId = (String) request.getSession().getAttribute("businessName");
		Business b = businessService.selectByPrimaryKey(bId);
		
		System.out.println("23"+b.getbNotice());
		if((b.getbNotice()==null)&&("休息中".equals(b.getsStatetype()))){//当认证完成变成休息中状态，和其他信息为空时，说明是第一次登录
			return "business/perfectInformation";
		}else {
		return "business/index";
		}
	}
	
	/**
	 * 显示单个商家信息
	 * @param request
	 * @return
	 */
	@RequestMapping("/printInfo")
	@ResponseBody
	public Business printInfo(Model model,HttpServletRequest request){
		
		String bId = (String) request.getSession().getAttribute("businessName");
		Business b = businessService.selectByPrimaryKey(bId);
		return b;
	}
	
	/**
	 * 完善商家信息
	 * @param request
	 * @param business
	 * @param sHoursa
	 * @param sHoursb
	 * @return
	 */
	@RequestMapping("/perfectInfo")
	public String perfectInfo(HttpServletRequest request,Business business,String sHoursa,String sHoursb){
		System.out.println(sHoursa);
		String bId = (String) request.getSession().getAttribute("businessName");
		business.setbId(bId);
		if(business.getsTelephone()==""||business.getbNotice()==""||business.getsResponsible()==""){
			request.setAttribute("msg", "请填写完整信息");
		}else{
			String time = sHoursa + "-"+sHoursb;
			business.setsHours(time);
			businessService.updateByPrimaryKeySelective(business);
			request.setAttribute("msg", "信息添加完成");
		}
		return "business/perfectInformation";
	}
	/**
	 * 退出账号
	 * @param request
	 * @return
	 */
	@RequestMapping("/quit")
	public String quit(HttpServletRequest request){
		request.getSession().removeAttribute("businessName");
		return "business/register";
	}

	/**
	 * 修改商家信息
	 * @param model
	 * @param b
	 * @return
	 */
	@RequestMapping("/modify")
	public String modify(Model model,HttpServletRequest request,Business business,String sHoursa,String sHoursb){
		String bId = (String) request.getSession().getAttribute("businessName");	
		business.setbId(bId);
		String time = sHoursa + "-"+sHoursb;
			System.out.println(time);
			business.setsHours(time);
			businessService.updateByPrimaryKeySelective(business);
		return "business/account";
	}
	
	/**
	 * 查找上架的商品
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/findSellMer")
	@ResponseBody
	public List<Goods> findSellMer(Model model,HttpServletRequest request,int i){
		String bId = (String) request.getSession().getAttribute("businessName");
		List<Goods> list = businessService.selectByExample(bId,i);
		return list;
	}
}
