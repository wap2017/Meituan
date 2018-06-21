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
	
	
	//--------�̼Ҷ�-------------
	int insertGoods(Goods record);//�����Ʒ
	
	int insertSelective(Business record);//�̼�ע��
	
	Business selectByPrimaryKey(String bId);//ͨ��bid�����̼�
	
	int updateByPrimaryKeySelective(Business record);//�޸��̼�
	
	List<Goods> selectByExample(String bId,int i);//������Ʒ
}
