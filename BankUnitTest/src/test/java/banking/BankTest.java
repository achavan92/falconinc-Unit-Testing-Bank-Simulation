/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.List;
import java.util.SortedSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robert (Alex) Spangler
 */
public class BankTest {
    
    public BankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Bank.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bank.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInsufficientFundsPenalty method, of class Bank.
     */
    @Test
    public void testGetInsufficientFundsPenalty() {
        System.out.println("getInsufficientFundsPenalty");
        Bank instance = null;
        double expResult = 0.0;
        double result = instance.getInsufficientFundsPenalty();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsufficientFundsPenalty method, of class Bank.
     */
    @Test
    public void testSetInsufficientFundsPenalty() {
        System.out.println("setInsufficientFundsPenalty");
        double insufficientFundsPenalty = 0.0;
        Bank instance = null;
        instance.setInsufficientFundsPenalty(insufficientFundsPenalty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNAME method, of class Bank.
     */
    @Test
    public void testGetNAME() {
        System.out.println("getNAME");
        Bank instance = null;
        String expResult = "";
        String result = instance.getNAME();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAccountWizard method, of class Bank.
     */
    @Test
    public void testAddAccountWizard() {
        System.out.println("addAccountWizard");
        Bank instance = null;
        instance.addAccountWizard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAccounts method, of class Bank.
     */
    @Test
    public void testGetAllAccounts() {
        System.out.println("getAllAccounts");
        Bank instance = null;
        SortedSet<Account> expResult = null;
        SortedSet<Account> result = instance.getAllAccounts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomerWizard method, of class Bank.
     */
    @Test
    public void testAddCustomerWizard() {
        System.out.println("addCustomerWizard");
        Bank instance = null;
        instance.addCustomerWizard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String lastName = "";
        String firstName = "";
        Bank instance = null;
        String expResult = "";
        String result = instance.addCustomer(lastName, firstName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCustomer method, of class Bank.
     */
    @Test
    public void testRemoveCustomer() {
        System.out.println("removeCustomer");
        String customerId = "";
        Bank instance = null;
        instance.removeCustomer(customerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomers method, of class Bank.
     */
    @Test
    public void testGetAllCustomers() {
        System.out.println("getAllCustomers");
        Bank instance = null;
        SortedSet<Customer> expResult = null;
        SortedSet<Customer> result = instance.getAllCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    public void testGetCustomer_String() {
        System.out.println("getCustomer");
        String customerId = "";
        Bank instance = null;
        Customer expResult = null;
        Customer result = instance.getCustomer(customerId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Test
    public void testGetCustomer_String_String() {
        System.out.println("getCustomer");
        String lastName = "";
        String firstName = "";
        Bank instance = null;
        List<Customer> expResult = null;
        List<Customer> result = instance.getCustomer(lastName, firstName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomersAccounts method, of class Bank.
     */
    @Test
    public void testGetCustomersAccounts() {
        System.out.println("getCustomersAccounts");
        String customerId = "";
        Bank instance = null;
        List<Account> expResult = null;
        List<Account> result = instance.getCustomersAccounts(customerId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
