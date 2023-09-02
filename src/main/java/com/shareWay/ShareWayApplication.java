package com.shareWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShareWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareWayApplication.class, args);
		ShareWayApplication.run();
	}

	public static void run() {
		System.out.println("Hello");
	}

}
