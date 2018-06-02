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
		u.setuIsban(1);//逻辑假删
		return userMapper.updateByPrimaryKey(u);
	}
	
	
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
		// 分页处理
		PageHelper.startPage(curPage, pageSize);
		List<User> list = userMapper.selectByExample(ue);
		// 创建一个返回值对象
		// 设置返回结果
		// 设置返回的总记录数
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


}
