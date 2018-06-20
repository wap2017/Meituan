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
	 * 
	 * @param model
	 * @return
	 * 
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
		String picture="default.jpg";
		if (!file.isEmpty()) {
			try {

				String filePath = request.getSession().getServletContext().getRealPath("/") + "business/goods/" + gId + "_"
						+ file.getOriginalFilename();
				picture=gId+"_"+file.getOriginalFilename();
				// ת���ļ�
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
		request.setAttribute("msg", "��ӳɹ�");
		}
		return "/business/addMerchandise";
		
	}


}
