package com.meituan.service.user;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.meituan.pojo.User;

public interface UserService {

	// �����û�id��ѯĬ�ϵ�ַ
	User findUserById(String id);

	PageInfo<User> findUsers(int curPage,int pageSize);
	
	List<User> findAllUsers();

	int registerUser(User user);
	

}
