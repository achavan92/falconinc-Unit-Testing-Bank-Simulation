/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    Map<String, Customer> customers;

    
    // test fixtures 
    @BeforeEach
    void setUp(){
        //NOTE: may need to be fixed
        custName = "Name";
        insufficientFundsPenalty = 10.00;
        bank = new Bank(custName);
        customers = new HashMap<>();

    }
    
    // NOTE: Tests below are not being executed when tests are ran.
    
    //constructor
    /**
     * Test Constructor of class Bank.
     */
    @Nested
    class ConstructorTest{
        @Test
        @DisplayName("This should pass")
        void BankConstructorTest(String name){
            custName = "";
            assertDoesNotThrow( () -> bank = new Bank(custName), "Will it be read???");//No!
        }
        
        @Test
        @DisplayName("Name is null")
        void BankConstructorTestNullName(String name){
            custName = null;
            assertThrows( IllegalArgumentException.class, () -> bank = new Bank(custName), "Will it be read???");//No!
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
            Bank instance = bank;
            instance.setInsufficientFundsPenalty(insufficientFundsPenalty);
          }
        
        @Test
        @DisplayName("Negative amount for insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyNegativeAmount(){
            //stub
            double insufficientFundsPenalty = -10.00;
            Bank instance = bank;
            instance.setInsufficientFundsPenalty(insufficientFundsPenalty);
        }
        
        @Test
        @DisplayName("Amount over insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyOverAmount(){
           //stub
           double insufficientFundsPenalty = 10.01;
            Bank instance = bank;
            instance.setInsufficientFundsPenalty(insufficientFundsPenalty);
        }
        
        @Test
        @DisplayName("Amount under insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyUnderAmount(){
            //stub
            double insufficientFundsPenalty = 9.99;
            Bank instance = bank;
            instance.setInsufficientFundsPenalty(insufficientFundsPenalty);
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
            assertDoesNotThrow( () -> bank.setInsufficientFundsPenalty(result), "Will it be read???");//No!
        }
        
        @Test
        @DisplayName("Wrong type for insufficientFunds")
        void testSetInsufficientFundsPenaltyWrongType(double insufficientFunds){
            int result = 0 + 10;
            assertThrows( IllegalArgumentException.class, () -> bank.setInsufficientFundsPenalty(result), "Will it be read???");//No!
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
            instance.addCustomerWizard(); 
        }
        
        @Test
        @DisplayName("No Bank object for addAccountWizard")
        void testAddAccountWizardNullBank() {
            Bank instance = null;
            instance.addCustomerWizard();  
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
        instance.addCustomerWizard();
        }
        
        @Test
        @DisplayName("No Bank object for addCustomerWizard")
        void testAddCustomerWizardNoBankObject(){
            Bank instance = null;
            instance.addCustomerWizard();
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
            //stub
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
            //stub
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
            //stub
            String customerId = "";
            Bank instance = bank;
            instance.removeCustomer(customerId);
        }
          
        @Test
        @DisplayName("No customer ID for removeCustomer")    
        void testRemoveCustomerNullCustomerId() {
            String customerId = null;
            Bank instance = bank;
            instance.removeCustomer(customerId);
        }
        
        @Test
        @DisplayName("No Bank Object passed for removeCustomer")
        void testRemoveCustomerNoBankObject() {
            String customerId = "";
            Bank instance = null;
            instance.removeCustomer(customerId);
        }
        
        @Test
        @DisplayName("No Bank Object passed and no customer ID for removeCustomer")
        void testRemoveCustomerNoBankObjectOrCustomerId() {
            String customerId = null;
            Bank instance = null;
            instance.removeCustomer(customerId);
        }
    }

    /**
     * Test of getAllCustomers method, of class Bank.
     */
    @Nested
    class TestGetAllCustomers{
        @Test
        @DisplayName("getAllCustomers should pass")
        void testGetAllCustomers() {
            Bank instance = bank;
            SortedSet<Customer> expResult = instance.getAllCustomers();
            SortedSet<Customer> result = instance.getAllCustomers();
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Bank Object for getAllCustomers")
        void testGetAllCustomersNoBankObject() {
            Bank instance = null;
            SortedSet<Customer> expResult = instance.getAllCustomers();
            SortedSet<Customer> result = instance.getAllCustomers();
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Expected Result for getAllCustomers")
        void testGetAllCustomerNullExpResult() {
            Bank instance = bank;
            SortedSet<Customer> expResult = null;
            SortedSet<Customer> result = instance.getAllCustomers();
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Bank Object and no Expected Result for getAllCustomers")
        void testGetAllCustomersNoBankObjectAndNullExpResult() {
            Bank instance = null;
            SortedSet<Customer> expResult = null;
            SortedSet<Customer> result = instance.getAllCustomers();
            assertEquals(expResult, result);
        }
     
    }

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
