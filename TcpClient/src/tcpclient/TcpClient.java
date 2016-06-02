/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpclient;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author vamshi
 */
public class TcpClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//    String input=br.readLine();
    String input="vamshi";
    System.out.println(input);
        
        Socket clientSocket=new Socket("localhost",6235);
    DataOutputStream dataout=new DataOutputStream(clientSocket.getOutputStream());
    
    dataout.writeBytes(input);
    dataout.close();
    System.out.println("after write bytes");
    BufferedReader br1=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    
        System.out.println(br1.readLine());
    
    br1.close();
    
    }
    
}
