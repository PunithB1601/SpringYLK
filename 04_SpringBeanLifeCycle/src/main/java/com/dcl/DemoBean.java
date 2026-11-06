package com.dcl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class DemoBean{
	
	public void demo() {
		System.out.println("demo() executed");
	}
	
	@PostConstruct
	public void preProduction() {
		System.out.println("init() called");
	}
	
	@PreDestroy
	public void postProduction() {
		System.out.println("destroy() called");
	}

}
