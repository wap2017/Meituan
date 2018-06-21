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
	 * ���һ��ж�����δ��֤
	 * 
	 * @return
	 */
	@RequestMapping(value = "/count")
	@ResponseBody
	public int count() {

		return businessService.count();
	}

	/**
	 * �ܾ���֤
	 * 
	 * @return
	 */
	@RequestMapping("/reject")
	public String reject(String regectBId,String sNotreason) {
		businessService.reject(regectBId,sNotreason);
		return "identification";
	}

	/**
	 * ������֤
	 * 
	 * @return
	 */
	@RequestMapping("/accept")
	public String accept(String bId) {
		businessService.accept(bId);
		return "identification";
	}

	/**
	 * �ҵ�δ��֤��һ����¼
	 * 
	 * @return
	 */
	@RequestMapping("/findBusinessWithoutIdentify")
	@ResponseBody
	public Business findBusinessWithoutIdentify() {
		return businessService.findBussinessWithoutIdentify();
	}

	/**
	 * �ҵ����е��û���¼��һ�η��أ���ǰ�˽��з�ҳ
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
	 * �ҵ����е��û���¼��һ�η��أ���ǰ�˽��з�ҳ
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
	
	//--------------�̼Ҷ˴���------------
	/**
	 * �����Ʒ
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
			request.setAttribute("msg", "�뽫��Ϣ��д����");
		}else{
		Goods goods = new Goods();
		String bId= "b1";
		goods.setbId(bId);
		String gId = UUID.randomUUID().toString().replace("-", "");//�������id��
		goods.setgId(gId);
		goods.setgName(shopName);
		goods.setgDetail(describe);
		goods.setgType(type);
		goods.setgPrice(price);
		goods.setgStock(inventory);
		goods.setgAdd(new Date());
		
		String picture = savePhoto(request, file,"goods", gId);//ת��ͼƬ
		goods.setgPicture(picture);
		if("".equals(putaway)){
			goods.setgSale(0);
		}else{
			goods.setgSale(1);
		}
		businessService.insertGoods(goods);
		request.setAttribute("msg", "��ӳɹ�");
		}
		return "/business/addMerchandise";
		
	}
	
	/**
	 * ע�Ტ�ϴ�����
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
		business.setbId(id);//��ϵ���ֻ��ŵ�����֤��

		business.setbShoplogo(savePhoto(request, file1, "logo", id));
		business.setsLicense(savePhoto(request, file2, "license", id));
		business.setsIdcardpos(savePhoto(request, file3,"pos", id));
		business.setsIdcardback(savePhoto(request, file4, "back", id));
		business.setsHygiene(savePhoto(request, file5, "hygiene", id));
		business.setbIsban(0);
		business.setsStatetype("δ��֤");
		business.setsApply(new Date());
		businessService.insertSelective(business);
		return "business/registerSuccess";
		
	}
	/**
	 * ��֤Ҫע����ֻ����Ƿ��Ѿ�ע����ˣ������ֻ�����ΪbId��
	 * @param bId
	 * @return
	 */
	@RequestMapping("/verifyBId")
	@ResponseBody
	public Boolean verifyBId(String bId){
		Business b = businessService.selectByPrimaryKey(bId);
		if(b!=null){
			return false;//����˵���Ѿ�ע�����
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
				// ת���ļ�
				file.transferTo(new File(filePath));
				System.out.println(filePath);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return picture;
	}
	
	/**
	 * ��¼��֤
	 * @param request
	 * @param sRphone
	 * @param bAccountpassword
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpServletRequest request,String bId,String bAccountpassword){
		
		if(bId==""){
			return "�������˺�";
		}else{
			Business b = businessService.selectByPrimaryKey(bId);
			System.out.println(b);
			if(b==null){
				return "�˻�������";
			}else{
				if(!bAccountpassword.equals(b.getbAccountpassword())){
					return "�˻����������";
				}else if("δ��֤".equals(b.getsStatetype())){
					return "����Ա��δ��֤����ȴ�";
				}else{
					request.getSession().setAttribute("businessName", bId);;
					return "��¼�ɹ�";
				}
			}
		}
	}
	
	@RequestMapping("/identification")
	public String identification(HttpServletRequest request){
		
		String bId = (String) request.getSession().getAttribute("businessName");
		Business b = businessService.selectByPrimaryKey(bId);
		
		System.out.println("23"+b.getbNotice());
		if((b.getbNotice()==null)&&("��Ϣ��".equals(b.getsStatetype()))){//����֤��ɱ����Ϣ��״̬����������ϢΪ��ʱ��˵���ǵ�һ�ε�¼
			return "business/perfectInformation";
		}else {
		return "business/index";
		}
	}
	
	/**
	 * ��ʾ�����̼���Ϣ
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
	 * �����̼���Ϣ
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
			request.setAttribute("msg", "����д������Ϣ");
		}else{
			String time = sHoursa + "-"+sHoursb;
			business.setsHours(time);
			businessService.updateByPrimaryKeySelective(business);
			request.setAttribute("msg", "��Ϣ������");
		}
		return "business/perfectInformation";
	}
	/**
	 * �˳��˺�
	 * @param request
	 * @return
	 */
	@RequestMapping("/quit")
	public String quit(HttpServletRequest request){
		request.getSession().removeAttribute("businessName");
		return "business/register";
	}

	/**
	 * �޸��̼���Ϣ
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
	 * �����ϼܵ���Ʒ
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
