package com.meituan.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meituan.mapper.UserMapper;
import com.meituan.pojo.User;
import com.meituan.pojo.UserExample;
import com.meituan.pojo.UserExample.Criteria;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	
	@Override
	public int delUser(String  uId) {
		User u=userMapper.selectByPrimaryKey(uId);
		u.setuIsban(1);//�߼���ɾ
		return userMapper.updateByPrimaryKey(u);
	}
	
	/**
	 * ע���û�������Աע����Ҫ����Ϣ�Ƚ϶࣬�û���ע��ʱֻ��Ҫ�˺ź����룩
	 * @param user
	 * @return
	 */
	@Override
	public int registerUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public User findUserById(String id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	public PageInfo<User> findUsers(int curPage, int pageSize) {
		// return users;

		UserExample ue = new UserExample();
		// ��ҳ����
		PageHelper.startPage(curPage, pageSize);
		List<User> list = userMapper.selectByExample(ue);
		// ����һ������ֵ����
		// ���÷��ؽ��
		// ���÷��ص��ܼ�¼��
		PageInfo<User> pageInfo = new PageInfo<>(list);
		return pageInfo;

	}

	@Override
	public List<User> findAllUsers() {
		UserExample ue = new UserExample();
		Criteria cr = ue.createCriteria();
		cr.andUIsbanEqualTo(0);
		List<User> list = userMapper.selectByExample(ue);
		return list;
	}


	@Override
	public User findUser(String uId) {
		return userMapper.selectByPrimaryKey(uId);
	}


	@Override
	public int updateUser(User user) {
		UserExample example=new UserExample();
		Criteria cr = example.createCriteria();
		cr.andUIdEqualTo(user.getuId());
		return userMapper.updateByExample(user, example);
	}
	
	/**
	 * ����ע��ʱ�û����˺�����ѯ���˺��Ƿ��Ѿ���ע��
	 * @param uNickname
	 * @return
	 */
	@Override
	public int findUserByUNickname(String uNickname) {
		UserExample example = new UserExample();
		Criteria cr = example.createCriteria();
		cr.andUNicknameEqualTo(uNickname);
		List<User> list = userMapper.selectByExample(example);
		System.out.println(list.isEmpty()||list==null);
		if(list.isEmpty()||list==null) {
			return 0;
		}
		return 1;
	}


}
