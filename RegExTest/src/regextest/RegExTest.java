/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regextest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vamshi
 */
public class RegExTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String patt1="[a-zA-Z0-9%.]*";
    String patt2="[a-zA-Z0-9_]*xps\\b";
    String input="absxps";
    Pattern p=Pattern.compile(patt2);
    Matcher m=p.matcher(input);
   Boolean b=m.matches();
           System.out.println(b);


//    while(m.find()){
//    System.out.println("Start"+m.start());
//    System.out.println("End"+m.end());
//    
//    }
//    
//    System.out.println(m.lookingAt());
//    System.out.println(m.matches());
//    
    }
    
}
