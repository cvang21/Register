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
    
    /**
     * Sets the discount level
     * @param discount
     * @return the discount
     */
    public abstract void setDiscount(double discount);
    /**
     * This method receives the discount input. This method does not validate input data.
     * @param disc - The discount amount
     */
    public abstract double getDiscount();
      
    
}
