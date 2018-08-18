/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package information.com;

/**
 *
 * @author User
 */
public class bank_account {
    private int accno;
    private String accName;
    private int pinNo;
    
    public bank_account(){
        
        
}
    
    public int getAccno(){
        return accno;
    }
    
    public void setAccno(int accno){
        this.accno=accno;
    }
    
    public String getAccName(){
        return accName;
    }
    
    public void setAccName(String accName){
        this.accName=accName;
    }
    
    public int getPinNo(){
        return pinNo;
    }
    public void setPinNo(int pinNo){
        this.pinNo=pinNo;
    }
    
    
}

