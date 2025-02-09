package com.ritika.SpringBootP03.beans;

import org.springframework.stereotype.Component;

@Component
public class RozerPay implements Partners{

    RozerPay(){
        System.out.println("RozerPay constructor...");
    }

    @Override
    public void payment(String amount) {
        System.out.println("Payment done for "+amount+" via RozerPay");
    }
}
