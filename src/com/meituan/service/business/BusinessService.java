package com.meituan.service.business;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.meituan.pojo.Business;
import com.meituan.pojo.BusinessExample;
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
	
	int insertSelective(Business record);//商家注册
	
	Business selectByPrimaryKey(String bId);//通过bid查找商家
	
	int updateByPrimaryKeySelective(Business record);//修改商家
	
	List<Goods> selectByExample(String bId,int i);//查找商品
}
