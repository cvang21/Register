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
public interface DiscountType {
    
    /**
     * Sets the discount level
     */
    public abstract void setDiscount();
    /**
     * This method receives the discount input. This method does not validate input data.
     * @param disc - The discount amount
     * @return the description
     */
    public abstract double getDiscount(double disc);
      
    
}
