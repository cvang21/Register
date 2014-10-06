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
public class DatabaseSimulator {

    private DiscountStrategy bulkSale = new DiscountBulk();
    private DiscountStrategy weekendSale = new DiscountWeekendSale();

    private Product[] products = {
        new Product("1111", "Liz Clabourne Jeans", 25.99, weekendSale),
        new Product("2222", "Hanes Underwear", 5.99, bulkSale)};

    private Customer[] customers = {
        new Customer("Mouse", "Mickey", "414-555-1212", "3423-1122-1221-2311"),
        new Customer("Presley", "Elvis", "414-717-1313", "3033-3333-1111-1111")};

    private Store[] stores = {
        new Store("5221", "Oak Creek Kohls", "9035 S Howell Ave","Oak Creek", "WI","53154", "414-764-7200"),
        new Store("5331", "Franklin Kohls", "3737 S 27th St", "Milwaukee", "WI", "53221", "414-282-3460")
        };

    /**
     * Finds out if the product number given matches a product number within the database
     * 
     * @param prodID - identifier for the product number
     * @return - returns a product information
     */
    
    public final Product findProduct(String prodID){
        Product productFound = null;
        for(int i = 0; i < products.length; i++){
            if (prodID.equals(products[i].getProdID())){
                productFound = products[i];
                break;
            }
        }
        if(productFound == null) {
            throw new IllegalArgumentException();
        }
        return productFound;
    }
    
    /**
     * Finds out if the store number given matches a store number within the database
     * 
     * @param storeNum - identifier for the store number
     * @return - returns every information about the store 
     */
    public final Store findStore(String storeNum){
        Store storeFound = null;
        for(int i = 0; i < stores.length; i++){
            if (storeNum.equals(stores[i].getStoreNum())){
                storeFound = stores[i];
                break;
            }
        }
        if(storeFound == null) {
            throw new IllegalArgumentException();
        }
        return storeFound;
    }
    
    /**
     * Searches for customer based on credit card number 
     * 
     * @param customerCreditCard - Looks up based on Credit Card
     * @return - returns a customer information after Credit Card used for transaction it is found
     */
    public final Customer findCustomer(String customerCreditCard){
        Customer custFound = null;
        for(int i = 0; i < customers.length; i++){
            if (customerCreditCard.equals(customers[i].getCustomerCreditCard())){
                custFound = customers[i];
                break;
            }
        }
        if(custFound == null) {
            throw new IllegalArgumentException();
        }
        return custFound;
    }
    

    
}
