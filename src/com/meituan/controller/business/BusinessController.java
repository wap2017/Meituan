package com.meituan.controller.business;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
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
	 * 
	 * @param model
	 * @return
	 * 
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
		String picture="default.jpg";
		if (!file.isEmpty()) {
			try {

				String filePath = request.getSession().getServletContext().getRealPath("/") + "business/goods/" + gId + "_"
						+ file.getOriginalFilename();
				picture=gId+"_"+file.getOriginalFilename();
				// 转存文件
				file.transferTo(new File(filePath));
				System.out.println(filePath);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
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


}
