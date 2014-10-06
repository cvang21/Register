/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

/**
 *
 * @author Owner
 */
public interface DiscountStrategy {
    
    public abstract double getDiscount();
    public abstract double getDiscountRate(double unitPrice, int qty);
    public abstract void setDiscountRate(double discountRate);  
    
}
