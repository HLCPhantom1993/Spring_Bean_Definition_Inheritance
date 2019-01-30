package com.honglin_chen.spring_bean_definition_inheritance.service;

/* customerService bean 的类实例 */
public class CustomerService {
	private String welcomeMessage; 
	private String customerName; 
	
	public String getWelcomeMessage() {
		return this.welcomeMessage;
	}
	
	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage; 
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName; 
	}
	
	/* 客户服务提供输出欢迎信息方法 */ 
	public String sayHello() {
		return this.welcomeMessage + " " + this.customerName; 
	}
}
