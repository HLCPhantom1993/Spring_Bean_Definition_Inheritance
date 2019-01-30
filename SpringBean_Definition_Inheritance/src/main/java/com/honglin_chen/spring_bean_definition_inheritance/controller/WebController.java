package com.honglin_chen.spring_bean_definition_inheritance.controller;
 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.honglin_chen.spring_bean_definition_inheritance.service.CustomerService;
import com.honglin_chen.spring_bean_definition_inheritance.service.SpecificService;

@RestController
public class WebController {
	/* 创建应用文本 */
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml"); 
	/* 创建一个客户服务实例 */
	CustomerService customerService = (CustomerService) context.getBean("customerService"); 
	/* 因为customerService bean的子bean是anotherCustomerService bean, 且共享一个客户服务实例
	 * 所以anotherService的property实现的必须是Customer里的实例变量而不能创建属于其自己的实例变量
	 */ 
	CustomerService anotherService = (CustomerService) context.getBean("anotherCustomerService");
	SpecificService telephoneService = (SpecificService) context.getBean("telephoneService");
	/* consultanceService bean继承抽象模版bean, 通过SpecificService实例来实现继承
	 * 因为consultationService继承的抽象模版通过另一个实例实现, 所以它可以创建属于实例
	 * 类的成员变量
	 */ 
	SpecificService consultationService = (SpecificService) context.getBean("consultationService");
	
	@RequestMapping("/service")
	public String service() {
		return customerService.sayHello(); 
	}
	
	@RequestMapping("/anotherService")
	public String anotherService() {
		/* 我们在xml构造文件中并没有显性定义anotherCustomerService的customerName property
		 * 因为anotherCustomerService bean是CustomerService的子bean且共享一个类实例, 当我
		 * 们在前面定义且初始化了customerName的property, 该property被当前bean继续使用
		 */
		return anotherService.sayHello();
	}
	
	@RequestMapping("/telephoneService")
	public String telephoneService() {
		return telephoneService.sayHello(); 
	}
	
	@RequestMapping("/consultationService")
	public String consultservice() {
		return consultationService.sayWelcome(); 
	}
}
