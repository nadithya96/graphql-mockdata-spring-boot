package com.data.apollographql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ApollographqlMain {

	public static void main(String[] args) {
		SpringApplication.run(ApollographqlMain.class, args);
		System.out.println("Spring Data App running...");
	}

}
