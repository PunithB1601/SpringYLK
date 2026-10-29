package com.dcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//Start the IoC container
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		BillGenerator bg1=context.getBean(BillGenerator.class);
		bg1.generateBill();
		
	}

}
