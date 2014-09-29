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
public class Store {
    
    private String storeNum;
    private String storeName;
    private String storeStreetAddress;
    private String storeCity;
    private String storeState;
    private String storePhone;

    public String getStoreNum() {
        return storeNum;
    }
/**
 * Sets the store number.  This method does not current method
 * @param storeNum 
 */
    public void setStoreNum(String storeNum) {
        if (storeNum == null || storeNum.length() < 1){
        throw new IllegalArgumentException();
        }
        this.storeNum = storeNum;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreStreetAddress() {
        return storeStreetAddress;
    }

    public void setStoreStreetAddress(String storeStreetAddress) {
        this.storeStreetAddress = storeStreetAddress;
    }

    public String getStoreCity() {
        return storeCity;
    }

    public void setStoreCity(String storeCity) {
        this.storeCity = storeCity;
    }

    public String getStoreState() {
        return storeState;
    }

    public void setStoreState(String storeState) {
        this.storeState = storeState;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }
    
    
    
}
