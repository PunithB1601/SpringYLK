package com.dcl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DemoBean implements InitializingBean, DisposableBean{
	
	public void demo() {
		System.out.println("demo() executed");
	}
	
	public void preProduction() {
		System.out.println("init() called");
	}
	
	public void postProduction() {
		System.out.println("destroy() called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init() called");
	}
}
