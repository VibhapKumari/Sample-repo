package com.pasinpore.flightserviceexample.utils;

import com.pasinpore.flightserviceexample.dto.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String,Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("acc1",12000.0);
        paymentMap.put("acc2",10000.0);
        paymentMap.put("acc3",5000.0);
        paymentMap.put("acc3",8000.0);

    }

    public static  boolean validateCredential(String accountNo,double paidAmount){
        if(paymentMap.get(accountNo)>=paidAmount){
            return true;
        }else{
            throw new InsufficientAmountException("Insufficient amount");
        }
    }
}
