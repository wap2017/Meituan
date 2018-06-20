package com.meituan.service.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meituan.mapper.BusinessMapper;
import com.meituan.mapper.GoodsMapper;
import com.meituan.pojo.Business;
import com.meituan.pojo.BusinessExample;
import com.meituan.pojo.BusinessExample.Criteria;
import com.meituan.pojo.Goods;

@Service("BusinessService")
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	private BusinessMapper businessMapper;
	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public int delBusiness(String bId) {
		Business b=businessMapper.selectByPrimaryKey(bId);
		b.setbIsban(1);
		return businessMapper.updateByPrimaryKey(b);
	}

	@Override
	public List<Business> findAllBussiness() {
		BusinessExample example=new BusinessExample();
		Criteria cr = example.createCriteria();
		cr.andBIsbanEqualTo(0);
		return businessMapper.selectByExample(example);
	}

	@Override
	public Business findBussinessWithoutIdentify() {
		
		BusinessExample example=new BusinessExample();
		Criteria cr = example.createCriteria();
		cr.andSStatetypeEqualTo("未认证");
		List<Business> list=businessMapper.selectByExample(example);
		return (list.size()!=0)?list.get(0):null;
	}

	@Override
	public int accept(String bId) {
		System.out.println("abc,bId="+bId);
		Business b=businessMapper.selectByPrimaryKey(bId);
		b.setsStatetype("休息中");
		return businessMapper.updateByPrimaryKey(b);
	}

	@Override
	public int reject(String bId,String notReson) {
		Business b=businessMapper.selectByPrimaryKey(bId);
		b.setsStatetype("已拒绝");
		b.setsNotreason(notReson);
		return businessMapper.updateByPrimaryKey(b);
	}

	@Override
	public int count() {
		BusinessExample example=new BusinessExample();
		Criteria cr = example.createCriteria();
		cr.andSStatetypeEqualTo("未认证");
		List<Business> list=businessMapper.selectByExample(example);
		return list==null?0:list.size();
	}

	@Override
	public int updateBussiness(Business business) {
		BusinessExample example=new BusinessExample();
		Criteria cc = example.createCriteria();
		cc.andBIdEqualTo(business.getbId());
		return businessMapper.updateByExample(business, example);
	}

	@Override
	public Business findBusiness(String bId) {
		return businessMapper.selectByPrimaryKey(bId);
	}
	
	//--------商家端-----------------------

	@Override
	public int insertGoods(Goods record) {
		int i = goodsMapper.insertSelective(record);
		return i;
	}

	

}
