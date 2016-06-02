/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmit;

import java.util.HashMap;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author vamshi
 */
@WebService(serviceName = "CurrencyWS")
public class CurrencyWS {

    /**
     * This is a sample web service operation
     */
    
    HashMap<String,Integer> hm=new HashMap<String,Integer>();
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    public CurrencyWS() {
        hm.put("Dollar2Rupee",47);
        hm.put("DM2Rupee",30);
        hm.put("Pound2Rupee",73);
        hm.put("Euro2Rupee",55);
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "exchange")
    public int exchange(@WebParam(name = "source") String source, @WebParam(name = "destination") String destination, @WebParam(name = "amount") int amount) {
        //TODO write your implementation code here:
        String key=source+"2"+destination;
        int value=hm.get(key);
        
        return value*amount;
    }
}
