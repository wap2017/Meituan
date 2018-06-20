package com.meituan.service.business;
import java.util.List;
import com.meituan.pojo.Business;
import com.meituan.pojo.Goods;
import com.meituan.pojo.GoodsExample;

public interface  BusinessService {

	
	
	Business findBusiness(String bId);
	
	
    int delBusiness(String  bId);
    
    int accept(String bId);
    
    int reject(String bId,String notReason);
    
    
    int count();
		
	List<Business> findAllBussiness();

	Business findBussinessWithoutIdentify();
	
	int updateBussiness(Business business);
	
	
	//--------商家端-------------
	int insertGoods(Goods record);//添加商品

}
