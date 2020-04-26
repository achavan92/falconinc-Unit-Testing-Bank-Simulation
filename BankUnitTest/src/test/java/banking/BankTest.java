/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banking;

import java.util.List;
import java.util.SortedSet;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Robert (Alex) Spangler
 */
public class BankTest {
    
    String custName;
    double insufficientFundsPenalty;  
    Bank bank;

    
    // test fixtures 
    @BeforeEach
    void setUp(){
        //NOTE: may need to be fixed
        custName = "Name";
        insufficientFundsPenalty = 10.00;
        bank = new Bank(custName);
    }
    
    // NOTE: Tests below are not being executed when tests are ran.
    
    /**
     * Test Constructor of class Bank.
     */
    @Nested
    class ConstructorTest{
        @Test
        @DisplayName("This should pass")
        void BankConstructorTest(String name){
            custName = "";
            assertDoesNotThrow( () -> bank = new Bank(custName),
                    "Bank Constructor threw an exception when it shouldnt have.");
        }
        
        @Test
        @DisplayName("Name is null")
        void BankConstructorTestNullName(String name){
            custName = null;
            assertThrows( IllegalArgumentException.class,
                    () -> bank = new Bank(custName),
                    "Bank constructor took a null name");
        }
    }
    
    /**
     * NOTE: I didn't believe it to be necessary to have
     * test cases for main method, of class Bank. This is
     * due to there being no initialization tasks in this project. 
     */

    /**
     * Test of getInsufficientFundsPenalty method, of class Bank.
     */
    @Nested
    class TestGetInsufficientFundsPenalty{
        @Test
        @DisplayName("getInsufficientFundsPenalty should pass")
        void testGetInsufficientFundsPenalty(){
            //stub
            double insufficientFundsPenalty = 10.00;
            assertDoesNotThrow( ()-> bank.setInsufficientFundsPenalty(insufficientFundsPenalty) , 
                    "getInsufficientFundsPenalty() threw an exception when it shouldnt have.");
          }
        
        @Test
        @DisplayName("Negative amount for insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyNegativeAmount(){
            double insufficientFundsPenalty = -10.00;            
            assertThrows( IllegalArgumentException.class,
                    () -> bank.setInsufficientFundsPenalty(insufficientFundsPenalty),
                    "insufficientFundsPenalty took a negative double");
        }
        
        @Test
        @DisplayName("Amount over insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyOverAmount(){
           double insufficientFundsPenalty = 10.01;
           assertThrows( IllegalArgumentException.class,
                   () -> bank.setInsufficientFundsPenalty(insufficientFundsPenalty),
                   "insufficientFundsPenalty took double over 10.00");
        }
        
        @Test
        @DisplayName("Amount under insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyUnderAmount(){
            double insufficientFundsPenalty = 9.99;
            assertThrows( IllegalArgumentException.class,
                   () -> bank.setInsufficientFundsPenalty(insufficientFundsPenalty),
                   "insufficientFundsPenalty took double under 10.00");
        }
        
    }
    
    /**
     * Test of setInsufficientFundsPenalty method, of class Bank.
     */
    @Nested
    class TestSetInsufficientFundsPenalty{
        @Test
        @DisplayName("setInsufficientFundsPenalty should pass")
        void testSetInsufficientFundsPenalty(double insufficientFunds){
            double result = 0.0 + insufficientFundsPenalty;
            assertDoesNotThrow( () -> bank.setInsufficientFundsPenalty(result),
                    "setInsufficientFundsPenalty threw an exception when it shouldnt have.");
        }
        
        @Test
        @DisplayName("Wrong type for setInsufficientFunds")
        void testSetInsufficientFundsPenaltyWrongType(double insufficientFunds){
            int result = 0 + 10;
            assertThrows( IllegalArgumentException.class, 
                    () -> bank.setInsufficientFundsPenalty(result),
                    "setInsufficientFunds took an int instead of double");
        }
    }

    /**
     * Test of getNAME method, of class Bank.
     */
    @Nested
    class TestGetName{
        @Test
        @DisplayName("getName should pass")
        void TestGetName(){
            Bank instance = bank;
            String expResult = "";
            String result = instance.getNAME();
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("Name cannot be null in getName")
        void TestGetNameNull(){
            Bank instance = null;
            String expResult = "";
            String result = instance.getNAME();
            assertEquals(expResult, result);
        }

    }

    /**
     * Test of addAccountWizard method, of class Bank.
     */
    @Nested
    class TestAddAcountWizard {
        @Test
        @DisplayName("addAcountWizard should pass")
        void testAddAccountWizard() {
            Bank instance = bank;
            assertDoesNotThrow( () -> instance.addAccountWizard(),
                    "addAcountWizard threw an exception when it shouldnt have.");
        }
        
        @Test
        @DisplayName("No Bank object for addAccountWizard")
        void testAddAccountWizardNullBank() {
            Bank instance = null; 
            assertThrows( IllegalArgumentException.class,
                   () -> instance.addAccountWizard(), "addAccountWizard passed a null bank object");
        }
        
    }

    /**
     * Test of getAllAccounts method, of class Bank.
     */
    @Nested
    class TestGetAllAccounts{
        @Test
        @DisplayName("testGetAllAccounts should pass")
        void testGetAllAccounts(){
            Bank instance = bank;
            SortedSet<Account> expResult = instance.getAllAccounts();
            SortedSet<Account> result = instance.getAllAccounts();
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("Bank object is null for testGetAllAccounts")
        void testGetAllAccountsNoBankObject(){
            Bank instance = null;
            SortedSet<Account> expResult = instance.getAllAccounts();
            SortedSet<Account> result = instance.getAllAccounts();
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("expected results is null for testGetAllAccounts")
        void testGetAllAccountsNullEptResult(){
            Bank instance = bank;
            SortedSet<Account> expResult = null;
            SortedSet<Account> result = instance.getAllAccounts();
            assertEquals(expResult, result);
        }
              
        @Test
        @DisplayName("Bank object is null and expected results is null for testGetAllAccounts")
        void testGetAllAccountsNoBankObjectAndNullEptResult(){
            Bank instance = null;
            SortedSet<Account> expResult = null;
            SortedSet<Account> result = instance.getAllAccounts();
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of addCustomerWizard method, of class Bank.
     */
    @Nested
    class TestAddCustomerWizard{
        @Test
        @DisplayName("addCustomerWizard should pass")
        void testAddCustomerWizard(){
            Bank instance = bank;
            assertDoesNotThrow( () ->instance.addCustomerWizard(),
                    "addCustomerWizard threw an exception when it shouldnt have.");
        }
        
        @Test
        @DisplayName("No Bank object for addCustomerWizard")
        void testAddCustomerWizardNoBankObject(){
            Bank instance = null;
             assertThrows( IllegalArgumentException.class,
                   () -> instance.addCustomerWizard(), "addCustomerWizard passed a null bank object");
        }
        
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Nested
    class TestAddCustomer{
        @Test
        @DisplayName("addCustomer should pass")
        void testAddCustomer() {
            String lastName = "Doe";
            String firstName = "John";
            Bank instance = bank;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("FirstName is null for addCustomer")
        void testAddCustomerNullFirstName() {
            String lastName = "Doe";
            String firstName = null;
            Bank instance = bank;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        
        @Test
        @DisplayName("LastName is null for addCustomer")
        void testAddCustomerNullLastName() {
            String lastName = null;
            String firstName = "John";
            Bank instance = bank;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Bank Object and no firstName for addCustomer")
        void testAddCustomerNoBankObject() {
            String lastName = "Doe";
            String firstName = null;
            Bank instance = null;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        
        @Test
        @DisplayName("No Bank Object and no lastName for addCustomer")
        void testAddCustomerNoBankObjectAndNoLastName() {
            String lastName = null;
            String firstName = "John";
            Bank instance = null;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Bank Object, no lastName, and no firstName for addCustomer")
        void testAddCustomerNoBankObjectNoLastNameAndNoFirstName() {
            String lastName = null;
            String firstName = null;
            Bank instance = null;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of removeCustomer method, of class Bank.
     */
    @Nested
    class TestRemoveCustomer{
        @Test
        @DisplayName("removeCustomer should pass")
        void testRemoveCustomer() {
            String customerId = "0";
            Bank instance = bank;
            assertDoesNotThrow(() -> instance.removeCustomer(customerId),
                    "removeCustomer threw an exception when it shouldnt have.");
        }
          
        @Test
        @DisplayName("No customer ID for removeCustomer")    
        void testRemoveCustomerNullCustomerId() {
            String customerId = null;
            Bank instance = bank;
            assertThrows( IllegalArgumentException.class,
                   () -> instance.removeCustomer(customerId),
                   "removeCustomer took null customerId");
            
        }
        
        @Test
        @DisplayName("No Bank Object passed for removeCustomer")
        void testRemoveCustomerNoBankObject() {
            String customerId = "0";
            Bank instance = null;
            assertThrows( IllegalArgumentException.class,
                   () -> instance.removeCustomer(customerId),
                   "removeCustomer took null bank object");
        }
        
        @Test
        @DisplayName("No Bank Object passed and no customer ID for removeCustomer")
        void testRemoveCustomerNoBankObjectOrCustomerId() {
            String customerId = null;
            Bank instance = null;
            assertThrows( IllegalArgumentException.class,
                   () -> instance.removeCustomer(customerId),
                   "removeCustomer took no customer ID and null bank object");
        }
    }

    /**
     * NOTE: There are no tests for the getAllCustomers method of class Bank
     * due to it not taking any arguments.
     */
    
    /**
     * Test of getCustomer method, of class Bank.
     */
    @Nested
    class TestGetCustomer_String{
        @Test
        @DisplayName("getCustomer(String customerId) should pass")
        void testGetCustomer_String() {
            String customerId = "0";
            Bank instance = bank;
            Customer expResult = instance.getCustomer(customerId);
            Customer result = instance.getCustomer(customerId);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("Customer ID number is empty for getCustomer(String customerId)")
        void testGetCustomer_StringBlankId() {
            String customerId = null;
            Bank instance = bank;
            Customer expResult = instance.getCustomer(customerId);
            Customer result = instance.getCustomer(customerId);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Bank Object for getCustomer(String customerId)")
        void testGetCustomer_StringNoBankObjct() {
            String customerId = "0";
            Bank instance = null;
            Customer expResult = instance.getCustomer(customerId);
            Customer result = instance.getCustomer(customerId);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("expResult is null for getCustomer(String customerId)")
        void testGetCustomer_StringNoCustomerObjct() {
            String customerId = "0";
            Bank instance = bank;
            Customer expResult = null;
            Customer result = instance.getCustomer(customerId);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("Customer ID number should not be a letter(s) in getCustomer(String customerId) " +
                "(Only Positive numbers!!")
        void testGetCustomer_StringLetterAsID() {
            String customerId = "a";
            Bank instance = bank;
            Customer expResult = instance.getCustomer(customerId);
            Customer result = instance.getCustomer(customerId);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("Customer ID number should not be a negative number in getCustomer(String customerId) "+
                "(Only Positive numbers!!")
        void testGetCustomer_StringNegativeNumbAsID() {
            String customerId = "-1";
            Bank instance = bank;
            Customer expResult = instance.getCustomer(customerId);
            Customer result = instance.getCustomer(customerId);
            assertEquals(expResult, result);
        }
        
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Nested
    class TestGetCustomer_String_String{
        @Test
        @DisplayName("getCustomer(String lastName, String firstName) should pass")
        void testGetCustomer_String_String() {
            String lastName = "Doe";
            String firstName = "John";
            Bank instance = bank;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("FirstName is an Empty String for getCustomer(String lastName, String firstName)")
        void testGetCustomer_String_StringNoFirstName() {
            String lastName = "Doe";
            String firstName = null;
            Bank instance = bank;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("LastName is an empty String for getCustomer(String lastName, String firstName)")
        void testGetCustomer_String_StringNoLastName() {
            String lastName = null;
            String firstName = "John";
            Bank instance = bank;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Bank object passed for getCustomer(String lastName, String firstName)")
        void testGetCustomer_String_StringNoBankObjct() {
            String lastName = "Doe";
            String firstName = "John";
            Bank instance = null;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("Expected Result is null for getCustomer(String lastName, String firstName)")
        void testGetCustomer_String_StringNUllExpResult() {
            String lastName = "Doe";
            String firstName = "John";
            Bank instance = bank;
            List<Customer> expResult = null;
            List<Customer> result = instance.getCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("LastName cannot have numbers in getCustomer(String lastName, String firstName)")
        void testGetCustomer_String_StringNumbersInLastName() {
            String lastName = "123";
            String firstName = "John";
            Bank instance = bank;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("FirstName cannot have numbers in getCustomer(String lastName, String firstName)")
        void testGetCustomer_String_StringNumbersInFirstName() {
            String lastName = "Doe";
            String firstName = "123";
            Bank instance = bank;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
    }

    /**
     * Test of getCustomersAccounts method, of class Bank.
     */
    @Nested
    class TestGetCusomersAccounts{
        
        @Test
        @DisplayName("getCustomersAccounts should pass")
        void testGetCustomersAccounts() {
            String customerId = "0";
            Bank instance = bank;
            List<Account> expResult = instance.getCustomersAccounts(customerId);
            List<Account> result = instance.getCustomersAccounts(customerId);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Customer ID number for getCustomersAccounts")
        void testGetCustomersAccountsNoID() {
            String customerId = null;
            Bank instance = bank;
            List<Account> expResult = instance.getCustomersAccounts(customerId);
            List<Account> result = instance.getCustomersAccounts(customerId);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Bank Object Passed for getCustomersAccounts")
        void testGetCustomersAccountsNoBankObjct() {
            String customerId = "0";
            Bank instance = null;
            List<Account> expResult = instance.getCustomersAccounts(customerId);
            List<Account> result = instance.getCustomersAccounts(customerId);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No expected result for getCustomersAccounts")
        void testGetCustomersAccountsNoexpRessult() {
            String customerId = "0";
            Bank instance = bank;
            List<Account> expResult = null;
            List<Account> result = instance.getCustomersAccounts(customerId);
            assertEquals(expResult, result);
        }
    }
    
}
