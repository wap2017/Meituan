package com.meituan.service.user;


import com.github.pagehelper.PageInfo;
import com.meituan.pojo.EUDataGridResult;
import com.meituan.pojo.User;

public interface UserService {

	// �����û�id��ѯĬ�ϵ�ַ
	User findUserById(String id);

	PageInfo<User> findUsers(int curPage,int pageSize);

	int registerUser(User user);
	

}
