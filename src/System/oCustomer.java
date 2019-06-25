package System;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class oCustomer {
    
    //Data Member
    
    private String CustomerID;
    private String Firstname;
    private String Surname;
    private String Address;
    private String Postcode;
    private String Town;
    private String ProveofID;
    private Double DownPayment;
    private Double Deposit;
    
    //Accesor Function

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }

    public String getProveofID() {
        return ProveofID;
    }

    public void setProveofID(String ProveofID) {
        this.ProveofID = ProveofID;
    }

    public Double getDownPayment() {
        return DownPayment;
    }

    public void setDownPayment(Double DownPayment) {
        this.DownPayment = DownPayment;
    }

    public Double getDeposit() {
        return Deposit;
    }

    public void setDeposit(Double Deposit) {
        this.Deposit = Deposit;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Car Dealer Management System", 
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
 
    }
    
//    public void Reset(){
//        frame1 = new JFrame("Reset");
//        
//        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Car Dealer Management System", 
//                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
//            System.exit(0);
//        }
//    }
//    
}
