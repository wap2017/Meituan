package com.meituan.service.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.meituan.mapper.AdminMapper;
import com.meituan.pojo.Admin;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;

	@Override
	public Admin findBusiness(String aId) {
		return adminMapper.selectByPrimaryKey(aId);
	}


}
