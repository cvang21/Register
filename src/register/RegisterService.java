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
public class RegisterService {
 
   Customer customer = new Customer();
   Receipt receipt = new Receipt();
     
   RegisterCustomerInfo registerCustomerInfo = new RegisterCustomerInfo();
   RegisterGenerateSale registerGenerateSale = new RegisterGenerateSale(registerCustomerInfo);
   
   
   
}
