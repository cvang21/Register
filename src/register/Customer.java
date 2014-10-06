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

    public Customer(String customerLastName, String customerFirstName, String customerPhone, String customerCreditCard) {
        this.customerLastName = customerLastName;
        this.customerFirstName = customerFirstName;
        this.customerPhone = customerPhone;
        this.customerCreditCard = customerCreditCard;
    }


    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        if(customerLastName == null || customerLastName.length() == 0){
        throw new IllegalArgumentException();}
        this.customerLastName = customerLastName;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        if (customerFirstName == null || customerFirstName.length() == 0){
        throw new IllegalArgumentException();}
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        if (customerPhone == null || customerPhone.length() == 0){
        throw new IllegalArgumentException();}
        this.customerPhone = customerPhone;
    }

    public String getCustomerCreditCard() {
        return customerCreditCard;
    }

    public void setCustomerCreditCard(String customerCreditCard) {
        if (customerCreditCard == null || customerCreditCard.length() == 0){
        throw new IllegalArgumentException();}
        this.customerCreditCard = customerCreditCard;
    }

}
