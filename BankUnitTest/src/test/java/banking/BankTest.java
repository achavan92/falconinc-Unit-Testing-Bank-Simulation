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
    Bank bank1;
    Bank bank2;
    
    // test fixtures 
    @BeforeEach
    void setUp(){
        //ToDo: finish
        custName = "Name";
        insufficientFundsPenalty = 10.00;
        bank1 = new Bank(custName);
        bank2 = new Bank(custName);
    }
    
    //constructor
    /**
     * Test Constructor of class Bank.
     */
    @Nested
    class ConstructorTest{
        //ToDo: finish
        // NOTE: Tests below are not being executed when tests are ran.
        @Test
        @DisplayName("This should pass")
        void BankConstructorTest(String name){
            custName = "";
            assertDoesNotThrow( () -> bank1 = new Bank(custName), "Will it be read???");//No!
        }
        
        @Test
        @DisplayName("Name is null")
        void BankConstructorTestNullName(String name){
            custName = null;
            assertThrows( IllegalArgumentException.class, () -> bank2 = new Bank(custName), "Will it be read???");//No!
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
        @DisplayName("getInsufficientFundsPenalty should pass")
        void testGetInsufficientFundsPenalty(){
            //stub
        }
        
        @Test
        @DisplayName("Negative amount for insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyNegativeAmount(){
            //stub
        }
        
        @Test
        @DisplayName("Amount over insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyOverAmount(){
           //stub
        }
        
        @Test
        @DisplayName("Amount under insufficientFundsPenalty")
        void testGetInsufficientFundsPenaltyUnderAmount(){
            //stub
        }
        
    }
    
    /**
     * Test of setInsufficientFundsPenalty method, of class Bank.
     */
    @Nested
    class TestSetInsufficientFundsPenalty{
        //ToDo: finish
        @Test
        @DisplayName("setInsufficientFundsPenalty should pass")
        void testSetInsufficientFundsPenalty(double insufficientFunds){
            //stub
        }
        
        @Test
        @DisplayName("Wrong type for insufficientFunds")
        void testSetInsufficientFundsPenaltyWrongType(double insufficientFunds){
            //stub
        }
    }

    /**
     * Test of getNAME method, of class Bank.
     */
    @Nested
    class TestGetName{
        //ToDo: redo
        @Test
        @DisplayName("getName should pass")
        void TestGetName(){
            //stub
        }
        
        @Test
        @DisplayName("Name cannot be null in getName")
        void TestGetNameNull(){
            //stub
        }

    }

    /**
     * Test of addAccountWizard method, of class Bank.
     */
    @Nested
    class TestAddAcountWizard {
       //ToDo: redo 
        @Test
        @DisplayName("addAcountWizard should pass")
        void testAddAccountWizard() {
            //stub         
        }
        
        @Test
        @DisplayName("No Bank object for addAccountWizard")
        void testAddAccountWizardNullBank() {
            //stub 
        }
        
    }

    /**
     * Test of getAllAccounts method, of class Bank.
     */
    @Nested
    class TestGetAllAccounts{
        //ToDo: finish methods
        @Test
        @DisplayName("testGetAllAccounts should pass")
        void testGetAllAccounts(){
            //stub
        }
        
        @Test
        @DisplayName("Bank object is null for testGetAllAccounts")
        void testGetAllAccountsNoBankObject(){
            //stub
        }
        
        @Test
        @DisplayName("expected results is null for testGetAllAccounts")
        void testGetAllAccountsNullEptResult(){
            //stub
        }
              
        @Test
        @DisplayName("Bank object is null and expected results is null for testGetAllAccounts")
        void testGetAllAccountsNoBankObjectAndNullEptResult(){
            //stub
        }
    }

    /**
     * Test of addCustomerWizard method, of class Bank.
     */
    @Nested
    class TestAddCustomerWizard{
        //ToDo: finish
        @Test
        @DisplayName("addCustomerWizard should pass")
        void testAddCustomerWizard(){
            //stub
        }
        
        @Test
        @DisplayName("No Bank object for addCustomerWizard")
        void testAddCustomerWizardNoBankObject(){
            //stub
        }
        
    }

    /**
     * Test of addCustomer method, of class Bank.
     */
    @Nested
    class TestAddCustomer{
        //ToDo: finish 
        @Test
        @DisplayName("addCustomer should pass")
        void testAddCustomer() {
            //stub
        }
        
        @Test
        @DisplayName("FirstName is null for addCustomer")
        void testAddCustomerNullFirstName() {
            //stub
        }
        
        
        @Test
        @DisplayName("LastName is null for addCustomer")
        void testAddCustomerNullLastName() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object and no firstName for addCustomer")
        void testAddCustomerNoBankObject() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object and no firstName for addCustomer")
        void testAddCustomerNoBankObjectAndNoFirstName() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object and no lastName for addCustomer")
        void testAddCustomerNoBankObjectAndNoLastName() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object, no lastName, and no firstName for addCustomer")
        void testAddCustomerNoBankObjectNoLastNameAndNoFirstName() {
            //stub
        }
    }

    /**
     * Test of removeCustomer method, of class Bank.
     */
    @Nested
    class TestRemoveCustomer{
        //ToDo: finish 
        @Test
        @DisplayName("removeCustomer should pass")
        void testRemoveCustomer() {
            //stub
        }
          
        @Test
        @DisplayName("No customer ID for removeCustomer")
        void testRemoveCustomerNullCustomerId() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object passed for removeCustomer")
        void testRemoveCustomerNoBankObject() {
            //stub
        }
    }

    /**
     * Test of getAllCustomers method, of class Bank.
     */
    @Nested
    class TestGetAllCustomers{
        //ToDo: finish
        @Test
        @DisplayName("getAllCustomers should pass")
        void testGetAllCustomers() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object for getAllCustomers")
        void testGetAllCustomersNoBankObject() {
            //stub
        }
        
        @Test
        @DisplayName("No Expected Result for getAllCustomers")
        void testGetAllCustomerNullExpResult() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object and no Expected Result for getAllCustomers")
        void testGetAllCustomersNoBankObjectAndNullExpResult() {
            //stub
        }
     
    }

    /**
     * Test of getCustomer method, of class Bank.
     */
    @Nested
    class TestGetCustomer_String{
        //ToDo: finish
        @Test
        @DisplayName("getCustomer(String customerId) should pass")
        void testGetCustomer_String() {
            //stub
        }
        
        @Test
        @DisplayName("Customer ID number is empty for getCustomer(String customerId)")
        void testGetCustomer_StringBlankId() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object for getCustomer(String customerId)")
        void testGetCustomer_StringNoBankObjct() {
            //stub
        }
        
        @Test
        @DisplayName("expResult is null for getCustomer(String customerId)")
        void testGetCustomer_StringNoCustomerObjct() {
            //stub
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
            //stub
        }
        
        @Test
        @DisplayName("FirstName is an Empty String")
        void testGetCustomer_String_StringNoFirstName() {
            //stub
        }
        
        @Test
        @DisplayName("LastName is an empty String")
        void testGetCustomer_String_StringNoLastName() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank object passed")
        void testGetCustomer_String_StringNoBankObjct() {
            //stub
        }
        
        @Test
        @DisplayName("Expected Result is null")
        void testGetCustomer_String_StringNUllExpResult() {
            //stub
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
            //stub
        }
        
        @Test
        @DisplayName("No Customer ID number")
        void testGetCustomersAccountsNoID() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object Passed")
        void testGetCustomersAccountsNoBankObjct() {
            //stub
        }
        
        @Test
        @DisplayName("No expected result")
        void testGetCustomersAccountsNoexpRessult() {
            //stub
        }
    }
    
}
