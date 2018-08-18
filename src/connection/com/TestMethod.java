/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author User
 */
public class TestMethod {
    public static void main(String[] args) {
        FindNewTransactionId dao=new FindNewTransactionId();
       int a= dao.doIncrement("1000");
        System.out.println(a);
        
        ReportDao rd=new ReportDao();
       // rd.pdf();
        
    }
    
    
    
   
}