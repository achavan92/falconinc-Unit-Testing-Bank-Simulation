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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Robert (Alex) Spangler
 */
public class BankTest {
    
    Bank bank;
    String NAME;
    double insufficientFundsPenalty;  

    // initailiser
    @BeforeEach
    void init(){
        NAME = "";
        bank = new Bank(NAME);
        insufficientFundsPenalty = 10.00;
    }
    
    //constructor
    /**
     * Test Constructor of class Bank.
     */
    @Nested
    class ConstructorTest{
        //ToDo: finish
        @Test
        @DisplayName("This should pass")
        void BankConstructorTest(String name){
            name = NAME;
            String expResult = "";
            assertEquals(name,expResult);
        }
        
        @Test
        @DisplayName("Name is null")
        void BankConstructorTestNullName(String name){
            name = null;
            String expResult = "";
            assertEquals(name,expResult);
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
        //ToDo: finish
        @Test
        @DisplayName("This should pass")
        void testGetInsufficientFundsPenalty(){
            Bank instance = bank;
            double expResult = 0.0;
            double result = instance.getInsufficientFundsPenalty();
            assertEquals(expResult, result, insufficientFundsPenalty);
        }
        
        // figure this out!!!
        @Test
        @DisplayName("Negative amount for insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyNegativeAmount(){
            Bank instance = bank;
            double expResult = 0.0;
            double result = instance.getInsufficientFundsPenalty();
             
            
        }
        
        @Test
        @DisplayName("Amount over insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyOverAmount(){
           //redo
        }
        
        @Test
        @DisplayName("Amount under insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyUnderAmount(){
            //redo
        }
        
    }
    
    /**
     * Test of setInsufficientFundsPenalty method, of class Bank.
     */
    @Nested
    class TestSetInsufficientFundsPenalty{
        //ToDo: finish
        @Test
        @DisplayName("This should pass")
        void testSetInsufficientFundsPenalty(double insufficientFunds){
            insufficientFunds = 10.00;
        }
        
        @Test
        @DisplayName("Wrong type for insufficientFunds")
        void testSetInsufficientFundsPenaltyWrongType(double insufficientFunds){
            insufficientFunds = 10;
        }
    }

    /**
     * Test of getNAME method, of class Bank.
     */
    @Nested
    class TestGetName{
        //ToDo: redo
        @Test
        @DisplayName("This should pass")
        void TestGetName(){
            NAME = "";
        }
        
        @Test
        @DisplayName("Name cannot be null")
        void TestGetNameNull(){
            NAME = null;
        }
        
        @Test
        @DisplayName("Name cannot be an empty String")
        void TestGetNameEmptyString(){
            NAME = "";
        }
        
    }

    /**
     * Test of addAccountWizard method, of class Bank.
     */
    @Nested
    class TestAddAcountWizard {
       //ToDo: redo 
        @Test
        @DisplayName("This should pass")
        void testAddAccountWizard() {
            Bank instance = bank;
            instance.addAccountWizard();          
        }
        
        @Test
        @DisplayName("No Bank object")
        void testAddAccountWizardNullBank() {
            Bank instance = null;
            instance.addAccountWizard(); 
        }
        
    }

    /**
     * Test of getAllAccounts method, of class Bank.
     */
    @Nested
    class TestGetAllAccounts{
        //ToDo: finish methods
        @Test
        @DisplayName("This should pass")
        void testGetAllAccounts(){
            
        }
        
        @Test
        @DisplayName("Bank object is null")
        void testGetAllAccountsNoBankObject(){
            
        }
        
        @Test
        @DisplayName("expected results is null")
        void testGetAllAccountsNullEptResult(){
            
        }
              
        @Test
        @DisplayName("Bank object is null and expected results is null")
        void testGetAllAccountsNoBankObjectAndNullEptResult(){
            
        }
    }

    /**
     * Test of addCustomerWizard method, of class Bank.
     */
    @Nested
    class TestAddCustomerWizard{
        //ToDo: finish
        @Test
        @DisplayName("This should pass")
        void testAddCustomerWizard(){
            Bank instance = bank;
            instance.addAccountWizard();
        }
        
        @Test
        @DisplayName("No Bank object")
        void testAddCustomerWizardNoBankObject(){
            Bank instance = null;
            instance.addAccountWizard();
        }
        
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Nested
    class TestAddCustomer{
        //ToDo: finish
        @Test
        @DisplayName("This should pass")
        void testAddCustomer() {
            String lastName = "";
            String firstName = "";
            Bank instance = bank;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("FirstName is null")
        void testAddCustomerNullFirstName() {
            String lastName = null;
            String firstName = "";
            Bank instance = bank;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        
        @Test
        @DisplayName("LastName is null")
        void testAddCustomerNullLastName() {
            String lastName = "";
            String firstName = null;
            Bank instance = bank;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Bank Object and no firstName")
        void testAddCustomerNoBankObject() {
            String lastName = "";
            String firstName = "";
            Bank instance = null;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Bank Object and no firstName")
        void testAddCustomerNoBankObjectAndNoFirstName() {
            String lastName = "";
            String firstName = null;
            Bank instance = null;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Bank Object and no lastName")
        void testAddCustomerNoBankObjectAndNoLastName() {
            String lastName = null;
            String firstName = "";
            Bank instance = null;
            String expResult = "";
            String result = instance.addCustomer(lastName, firstName);
            assertEquals(expResult, result);
        }
        
        @Test
        @DisplayName("No Bank Object, no lastName, and no firstName")
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
        //ToDo: finish
        @Test
        @DisplayName("This should pass")
        void testRemoveCustomer() {
            String customerId = "";
            Bank instance = bank;
            instance.removeCustomer(customerId);
        }
        
        
        
        @Test
        @DisplayName("No customer ID")
        void testRemoveCustomerNullCustomerId() {
            String customerId = null;
            Bank instance = bank;
            instance.removeCustomer(customerId);
        }
        
        @Test
        @DisplayName("No Bank Object passed ")
        void testRemoveCustomerNoBankObject() {
            String customerId = "";
            Bank instance = null;
            instance.removeCustomer(customerId);
        }
    }

    /**
     * Test of getAllCustomers method, of class Bank.
     */
    @Nested
    class TestGetAllCustomers{
        //ToDo: finish
        @Test
        @DisplayName("This should pass")
        void testGetAllCustomers() {
            Bank instance = bank;
            SortedSet<Customer> expResult = instance.getAllCustomers();
            SortedSet<Customer> result = instance.getAllCustomers();
        }
        
        @Test
        @DisplayName("No Bank Object")
        void testGetAllCustomersNoBankObject() {
            Bank instance = null;
            SortedSet<Customer> expResult = instance.getAllCustomers(); 
            SortedSet<Customer> result = instance.getAllCustomers();
        }
        
        @Test
        @DisplayName("No Expected Result")
        void testGetAllCustomerNullExpResult() {
            Bank instance = bank;
            SortedSet<Customer> expResult = null; 
            SortedSet<Customer> result = instance.getAllCustomers();
        }
        
        @Test
        @DisplayName("No Bank Object and no Expected Result")
        void testGetAllCustomersNoBankObjectAndNullExpResult() {
            Bank instance = null;
            SortedSet<Customer> expResult = null;
            SortedSet<Customer> result = instance.getAllCustomers();
        }
     
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Nested
    class TestGetCustomer_String{
        //ToDo: finish
        @Test
        @DisplayName("This should pass")
        void testGetCustomer_String() {
            String customerId = "1";
            Bank instance = bank;
            Customer expResult = instance.getCustomer(customerId);
            Customer result = instance.getCustomer(customerId);
        }
        
        @Test
        @DisplayName("Customer ID number is empty")
        void testGetCustomer_StringBlankId() {
            String customerId = "";
            Bank instance = bank;
            Customer expResult = instance.getCustomer(customerId);
            Customer result = instance.getCustomer(customerId);
        }
        
        @Test
        @DisplayName("No Bank Object")
        void testGetCustomer_StringNoBankObjct() {
            String customerId = "";
            Bank instance = null;
            Customer expResult = instance.getCustomer(customerId);
            Customer result = instance.getCustomer(customerId);
        }
        
        @Test
        @DisplayName("expResult is null")
        void testGetCustomer_StringNoCustomerObjct() {
            String customerId = "";
            Bank instance = bank;
            Customer expResult = instance.getCustomer(customerId);
            Customer result = instance.getCustomer(customerId);
        }
        
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Nested
    class TestGetCustomer_String_String{
        //ToDo: finish
        @Test
        @DisplayName("This should pass")
        void testGetCustomer_String_String() {
            String lastName = "FirstName";
            String firstName = "LastName";
            Bank instance = bank;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("FirstName is an Empty String")
        void testGetCustomer_String_StringNoFirstName() {
            String lastName = "";
            String firstName = "LastName";
            Bank instance = bank;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("LastName is an empty String")
        void testGetCustomer_String_StringNoLastName() {
            String lastName = "FirstName";
            String firstName = "";
            Bank instance = bank;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("No Bank object passed")
        void testGetCustomer_String_StringNoBankObjct() {
            String lastName = "FirstName";
            String firstName = "LastName";
            Bank instance = null;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("Expected Result is null")
        void testGetCustomer_String_StringNUllExpResult() {
            String lastName = "FirstName";
            String firstName = "LastName";
            Bank instance = bank;
            List<Customer> expResult = null;
            List<Customer> result = instance.getCustomer(lastName, firstName);
        }
        
    }

    /**
     * Test of getCustomersAccounts method, of class Bank.
     */
    @Nested
    class TestGetCusomersAccounts{
        
        @Test
        @DisplayName("This should pass")
        void testGetCustomersAccounts() {
            String customerId = "1";
            Bank instance = bank;
            List<Account> expResult = instance.getCustomersAccounts(customerId);
            List<Account> result = instance.getCustomersAccounts(customerId);
        }
        
        @Test
        @DisplayName("No Customer ID number")
        void testGetCustomersAccountsNoID() {
            String customerId = "";
            Bank instance = bank;
            List<Account> expResult = instance.getCustomersAccounts(customerId);
            List<Account> result = instance.getCustomersAccounts(customerId);
        }
        
        @Test
        @DisplayName("No Bank Object Passed")
        void testGetCustomersAccountsNoBankObjct() {
            String customerId = "1";
            Bank instance = null;
            List<Account> expResult = instance.getCustomersAccounts(customerId);
            List<Account> result = instance.getCustomersAccounts(customerId);
        }
        
        @Test
        @DisplayName("No expected result")
        void testGetCustomersAccountsNoexpRessult() {
            String customerId = "1";
            Bank instance = bank;
            List<Account> expResult = null;
            List<Account> result = instance.getCustomersAccounts(customerId);
        }
    }
    
}
