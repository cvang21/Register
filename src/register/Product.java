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
public class Product {
    
    private String prodID;
    private String description;
    private double unitPrice;
    
    private DiscountStrategy discountType;   //Consider using discountStrategy

    public String getProdID() {
        return prodID;
    }

    /**
     * Sets the id.  This method is not yet validated (Any warnings)
     * @param prodID 
     * 
     */
    public final void setProdID(final String prodID) {
        if(prodID == null || prodID.length()<2){
            throw new IllegalArgumentException();
        }
        this.prodID = prodID;
    }

    /**
     * Gets a description
     * @return a description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public DiscountStrategy getDiscountType() {
        return discountType;
    }

    public void setDiscountType(DiscountStrategy discountType) {
        this.discountType = discountType;
    }
    
    
}
