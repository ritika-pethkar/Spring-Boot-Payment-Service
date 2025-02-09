package com.ritika.SpringBootP03.beans;

import org.springframework.stereotype.Component;

@Component
public class JusPay implements Partners{

    JusPay(){
        System.out.println("JusPay constructor...");
    }

    @Override
    public void payment(String amount) {
        System.out.println("Payment done for "+amount+" via JusPay");
    }
}
