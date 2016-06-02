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
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author vamshi
 */
public class ResultsServer {
    
    public static void main(String []args) throws ClassNotFoundException, IOException{
    
    Class.forName("oracle.jdbc.OracleDriver");
        try {
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","vamshi");
            Statement stmt=con.createStatement();      
            ServerSocket ss=new ServerSocket(6789);
            while(true){
            Socket connectionSocket=ss.accept();
            System.out.println("CLient connected to server");
            BufferedReader br=new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

            
            System.out.println("after while loop");
            String shtno= br.readLine();
            
//            String query="select maths,physics,chemistry from results where htno= "+shtno;
//            ResultSet rs=stmt.executeQuery(query);
//            String res=null;
//            if(rs.next()){
//            int maths=rs.getInt(1);
//            int phy=rs.getInt(2);
//            int che=rs.getInt(3);
//            res=""+maths+","+phy+","+che;
//            }
//            else res="vamshi";

String res="Hello"+shtno;
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(connectionSocket.getOutputStream()));
            bw.write(res+"\n");
            bw.newLine();
            bw.flush();
            connectionSocket.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ResultsServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    
}
