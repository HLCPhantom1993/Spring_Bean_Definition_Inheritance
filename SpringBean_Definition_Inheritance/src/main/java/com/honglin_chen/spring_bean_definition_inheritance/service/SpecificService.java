package com.honglin_chen.spring_bean_definition_inheritance.service;

public class SpecificService {
	private String welcomeMessage; 
	private String customerName; 
	private String serviceName; 
	
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
 
	public String getServiceName() {
		return this.serviceName;
	}
 
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
 
	public String sayHello() {
		return "客户欢迎标语: " + this.welcomeMessage + " " + this.customerName + ". 这是: " + this.serviceName;
	}
 
	public String sayWelcome() {
		return "服务欢迎标语: " + this.welcomeMessage + this.serviceName;
	}
}
