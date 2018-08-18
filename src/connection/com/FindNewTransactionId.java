/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class FindNewTransactionId {
    
     public int doIncrement(String n1){
          int n3=0;
        try{
         
        ConnectionDatabase cd=new ConnectionDatabase();
        Connection con=cd.doConnect();
        PreparedStatement pstmt=con.prepareStatement("SELECT MAX(withdraw_id) FROM withdraw");
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()){
            String n2=rs.getString(1);
            if(n2==null){
                n2=n1;
            }else{
                n2=rs.getString("MAX(withdraw_id)");
            }
             n3=Integer.parseInt(n2);
             
        }
        }catch(Exception e){
            e.printStackTrace();
        }
         return n3;
    }
    
}
