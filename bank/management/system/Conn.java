
package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
   public Conn(){
       try{
          
           c = DriverManager.getConnection("jdbc:mysql://localhost:3305/bankmanagementsystem","root","Mishu2000#");
           s = c.createStatement();
       }
       catch(Exception e){
           System.out.println(e);
       }
   } 
    /*public static void main(String[] args) {
        new Conn();
    }*/
}
