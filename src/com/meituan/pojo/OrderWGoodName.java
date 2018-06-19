package com.meituan.pojo;


import java.util.Map;

public class OrderWGoodName {

	private Orders orders;
	private Address address;
	private Map<String, Integer> goods;
	public Orders getOrders() {
		return orders;
	}
	public Address getAddress() {
		return address;
	}
	public Map<String, Integer> getGoods() {
		return goods;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setGoods(Map<String, Integer> goods) {
		this.goods = goods;
	}
	@Override
	public String toString() {
		return "OrderWGoodName [orders=" + orders + ", address=" + address + ", goods=" + goods + "]";
	}
	
}
