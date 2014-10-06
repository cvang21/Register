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
public class RegisterService {

   Receipt receipt = new Receipt();
     
   RegisterInput registerCustomerInfo = new RegisterCustomerInfo();
   RegisterOutput registerGenerateSale = new RegisterGenerateSale(registerCustomerInfo);
      
        //POSRegister register1 = new POSRegister();
        String creditCardUsedForPurchase = "3423-1122-1221-2311";
        String storeNumber = "1111";
        
        
        register1.startNewSale(customerNo, storeNo);
        register1.addItemToSale("0100", 3);
        register1.addItemToSale("0101", 1);
        register1.addItemToSale("0102", 6);
        register1.finalizeSale();
   
}
