package com.meituan.service.business;
import java.util.List;
import com.meituan.pojo.Business;

public interface  BusinessService {

	
	
	Business findBusiness(String bId);
	
	
    int delBusiness(String  bId);
    
    int accept(String bId);
    
    int reject(String bId);
    
    
    int count();
		
	List<Business> findAllBussiness();

	Business findBussinessWithoutIdentify();
	
	int updateBussiness(Business business);
	
	
	
	

}
