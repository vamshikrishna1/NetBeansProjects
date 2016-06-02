/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intramessagingsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vamshi
 */
public class IntraMessagingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            // TODO code application logic here
 try{
 ServerSocket ss=new ServerSocket(6789);
 while(true){
 Socket cs=ss.accept();
 BufferedReader br=new BufferedReader(new InputStreamReader (cs.getInputStream()));
 
 
 }
 
 
 
 
 }catch(Exception e){e.printStackTrace();}           
            
            
}
}