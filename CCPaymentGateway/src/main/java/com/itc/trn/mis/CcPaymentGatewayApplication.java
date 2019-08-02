package com.itc.trn.mis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CcPaymentGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcPaymentGatewayApplication.class, args);
	}

}
