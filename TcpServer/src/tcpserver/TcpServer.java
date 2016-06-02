/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

/**
 *
 * @author vamshi
 */
public class TcpServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket socket=new ServerSocket(6235);
        
        String s = null;
        while(true){
        Socket connectionsocket=socket.accept();
        System.out.println("connected to server");
        BufferedReader br=new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));
        System.out.println("after inout stream");
        
            System.out.println("stream is ready");
       s= br.readLine();
        System.out.println(s);
        br.close();
        s=s+" hello";
        System.out.println(s+"after server reading the clint data");
        DataOutputStream data=new DataOutputStream(connectionsocket.getOutputStream());
        System.out.println("I am in server");
        data.writeBytes(s);
        data.close();
        }
        
    }
    
}
