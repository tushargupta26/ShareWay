package com.shareWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2
@SpringBootApplication
@ComponentScan
public class ShareWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareWayApplication.class, args);
		ShareWayApplication.run();
	}

	public static void run() {
		System.out.println("Hello");
	}

}
