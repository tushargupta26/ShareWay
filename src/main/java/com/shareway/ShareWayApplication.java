package com.shareway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ShareWayApplication {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(ShareWayApplication.class, args);
		//displayAllBeans();
//		UserDataService userDataService = new UserDataService();
//		System.out.println(userDataService.getUser(1).get().getName());
	}

	private static void displayAllBeans() {
		String[] beansList = applicationContext.getBeanDefinitionNames();
		for(String beanName : beansList) {
			System.out.println(beanName);
		}
	}

}
