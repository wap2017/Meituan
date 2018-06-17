package com.meituan.service.user;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.meituan.pojo.User;

public interface UserService {

	
	int updateUser(User user);
	
	User findUser(String uId);
	
    int delUser(String  uId);
		
	List<User> findAllUsers();
	
	/**
	 * ע���û�������Աע����Ҫ����Ϣ�Ƚ϶࣬�û���ע��ʱֻ��Ҫ�˺ź����룩
	 * @param user
	 * @return
	 */
	int registerUser(User user);
	
	
	
	
	// �����û�id��ѯĬ�ϵ�ַ
	User findUserById(String id);

	PageInfo<User> findUsers(int curPage,int pageSize);
	
	/**
	 * ����ע��ʱ�û����˺�����ѯ���˺��Ƿ��Ѿ���ע��
	 * @param uNickname
	 * @return
	 */
	int findUserByUNickname(String uNickname);
	
	
}
