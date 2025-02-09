package com.ritika.SpringBootP03.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class Paytm implements Partners{

    Paytm(){
        System.out.println("Paytm constructor...");
    }

    @Override
    public void payment(String amount) {
        System.out.println("Payment done for "+amount+" via paytm");
    }
}
