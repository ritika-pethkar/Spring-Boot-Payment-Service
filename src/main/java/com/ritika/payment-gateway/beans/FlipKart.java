package com.ritika.SpringBootP03.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FlipKart {

    FlipKart(){
        System.out.println("Flipkart constructor...");
    }

    @Autowired
    Partners partners;

    @Value("${jdbc.url}")
    private String url;

    public void paymentGateway(String amount){
        System.out.println(url);
        partners.payment(amount);
    }
}
