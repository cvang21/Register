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
public class DiscountBulk implements DiscountStrategy{
    private int bulkQty;
    private double discountRate = .30;
    
    @Override
    public double getDiscount() {
        return discountRate;
    }

    @Override
    public double getDiscountRate(double unitPrice, int qty) {
         if (unitPrice == 0 || qty == 0){
         throw new IllegalArgumentException();
        }
         if (qty < bulkQty){
         throw new IllegalArgumentException();}  //Does not qualify for qty disc
         
        return unitPrice * qty * discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }


}
