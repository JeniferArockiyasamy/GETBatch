package com.Ta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages=("com.Ta"))
public class GetBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetBatchApplication.class, args);
	}

}
