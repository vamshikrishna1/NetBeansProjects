/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vamshi
 */
public class ChatServer {
    
    public static void main(String []args) throws ClassNotFoundException{
    
    Class.forName("oracle.jdbc.driver.OracleDriver");
        try {
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","vamshi");
            Statement stmt=con.createStatement();
            ServerSocket ss=new ServerSocket(6789);
            while(true){
            Socket csocket=ss.accept();
            BufferedReader br=new BufferedReader(new InputStreamReader(csocket.getInputStream()));
            String serverInput=br.readLine().toLowerCase();
            String query="select reply from chat where message like"+"'%"+serverInput+"%'";
            ResultSet rs=stmt.executeQuery(query);
            String reply=null;
            if(rs.next()){
            reply=rs.getString(1);
            
            
            }
            
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(csocket.getOutputStream()));
            bw.write(reply);
            bw.newLine();
            bw.flush();
            
            
            }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
}
