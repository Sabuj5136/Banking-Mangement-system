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
 * @author l2pc208m
 */
public class ReportDao {
      
     public void pdf() {
         FindNewTransactionId fni=new FindNewTransactionId();
        int uv=fni.doIncrement("5000");
        
        
        try {
            System.out.println("Start ....");

            String jrxmlFileName = "D:/New Folder/withdraw.jrxml";
            String jasperFileName = "D:/New Folder/withdraw.jasper";
           String pdfFileName = "D:/New Folder/"+uv+".pdf";

            JasperCompileManager.compileReportToFile(jrxmlFileName, jasperFileName);

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankasia", "root", "apcl123456");
            HashMap hm = null;
            // Create arguments
            // Map params = new HashMap();
           
            
             hm = new HashMap();
             hm.put("p1", uv);
            
             
             

            // Generate jasper print
            JasperPrint jprint = (JasperPrint) JasperFillManager.fillReport(jasperFileName, hm, conn);

            // Export pdf file
            JasperExportManager.exportReportToPdfFile(jprint, pdfFileName);

            JOptionPane.showMessageDialog(null, "Done");
            System.out.println(uv);

        } catch (Exception e) {
            System.out.print("Exception" + e);
        }
            
    
     }
}
