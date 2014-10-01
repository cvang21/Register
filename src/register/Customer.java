/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

/**
 *
 * @author Ching Vang
 */
public class Customer {
    private String customerLastName;
    private String customerFirstName;
    private String customerPhone;
    private String customerCreditCard;
    private String customerAccountNum;

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerCreditCard() {
        return customerCreditCard;
    }

    public void setCustomerCreditCard(String customerCreditCard) {
        this.customerCreditCard = customerCreditCard;
    }

    public String getCustomerAccountNum() {
        return customerAccountNum;
    }

    public void setCustomerAccountNum(String customerAccountNum) {
        this.customerAccountNum = customerAccountNum;
    }
  
}
