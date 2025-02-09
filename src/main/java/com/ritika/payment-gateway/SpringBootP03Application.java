package com.ritika.SpringBootP03;

import com.ritika.SpringBootP03.beans.FlipKart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootP03Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootP03Application.class, args);
		FlipKart bean = context.getBean(FlipKart.class);
		bean.paymentGateway("1000");
	}

}
