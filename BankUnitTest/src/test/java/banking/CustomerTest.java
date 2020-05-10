/**
 * 
 */
package banking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.util.SortedSet;

import org.junit.jupiter.api.Test;

/**
 * @author A.Chavan
 *
 */
class CustomerTest {

	// test addSavingsAccount
	@Test
	public void testAddSavingsAccount() {
		// Creates and returns new savings account, with the specified initial balance and account description
		System.out.println("addSavingsAccount");
        Customer instance = null;
        double initBal = 0.0;
        String desc = "";
     
        double expBal = 0.0;
        String expDesc = "";
        
        //Check entered balance 
        assertEquals(initBal, expBal, 0);
        
        //Check description 
        assertEquals(desc, expDesc);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("Error--This is a testing code.");
	       
	}
	
	//test getAccount
	@Test
	public void testGetAccount() {
		// Returns an Account with the given account ID, or null if no such account
		System.out.println("getAccount");
		Customer instance = null;
		String accountID = "";
        Customer expResult = null;
        Account result = instance.getAccount(accountID);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("Error--This is a testing code.");
	    
	      
	}
	

	//test removeAccount
	@Test
	public void testRemoveAccount() {
		// Removes an Account with the given account ID; in a real program, you don't delete info, just mark it deleted.
		System.out.println("removeAccount");
		
		Customer instance = null;
		String accountID = "";
        instance.removeAccount(accountID);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("Error--This is a testing code.");
	    
	      
	}
	




}
