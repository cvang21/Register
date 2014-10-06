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
public class DiscountWeekendSale implements DiscountStrategy{

    private double discountRate = 0.20;  //This is the basic weekend discount

    
    public DiscountWeekendSale() {
        setDiscountRate(discountRate);
    }

    
    @Override
    public final double getDiscount() {
        return discountRate;
    }

    @Override
    public final double getDiscountRate(double unitPrice, int qty) {
        if (unitPrice == 0 || qty == 0){
         throw new IllegalArgumentException();
        }
        return unitPrice * qty * discountRate;
    }

    @Override
    public final void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}
