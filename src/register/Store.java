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
public class Store {
    
    private String storeNum;
    private String storeName;
    private String storeStreetAddress;
    private String storeCity;
    private String storeState;
    private String storeZip;
    private String storePhone;

    public Store(String storeNum, String storeName, String storeStreetAddress, String storeCity, String storeState, String storeZip, String storePhone) {
        this.storeNum = storeNum;
        this.storeName = storeName;
        this.storeStreetAddress = storeStreetAddress;
        this.storeCity = storeCity;
        this.storeState = storeState;
        this.storeZip = storeZip;
        this.storePhone = storePhone;
    }
    

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
        if (storeName == null || storeName.length() < 1){       
             throw new IllegalArgumentException();
        }
        this.storeName = storeName;
    }

    public String getStoreStreetAddress() {
        return storeStreetAddress;
    }

    public void setStoreStreetAddress(String storeStreetAddress) {
        if (storeStreetAddress == null || storeStreetAddress.length() < 1){
        throw new IllegalArgumentException();
        }
        this.storeStreetAddress = storeStreetAddress;
    }

    public String getStoreCity() {
        return storeCity;
    }

    public void setStoreCity(String storeCity) {
        if (storeCity == null || storeCity.length() < 1){
        throw new IllegalArgumentException();
        }
        this.storeCity = storeCity;
    }

    public String getStoreState() {
        return storeState;
    }

    public void setStoreState(String storeState) {
        if (storeState == null || storeState.length() < 1){
        throw new IllegalArgumentException();
        }
        this.storeState = storeState;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        if (storePhone == null || storePhone.length() < 1){
        throw new IllegalArgumentException();
        }
        this.storePhone = storePhone;
    }
    
    
    
}
