/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmit;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author vamshi
 */
@WebService(serviceName = "CalculatorWS")
public class CalculatorWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        //TODO write your implementation code here:
        
        return (i+j);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtract")
    public int subtract(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        //TODO write your implementation code here:
        return (i-j);
    }
}
