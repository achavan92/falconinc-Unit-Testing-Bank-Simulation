/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banking;

import org.junit.jupiter.api.BeforeEach;
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
        //ToDo: finish
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
            //stub
        }
        
        @Test
        @DisplayName("Name is null")
        void BankConstructorTestNullName(String name){
            //stub;
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
        @DisplayName("This should pass")
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
        @DisplayName("This should pass")
        void TestGetName(){
            //stub
        }
        
        @Test
        @DisplayName("Name cannot be null")
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
        @DisplayName("This should pass")
        void testAddAccountWizard() {
            //stub         
        }
        
        @Test
        @DisplayName("No Bank object")
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
        @DisplayName("This should pass")
        void testGetAllAccounts(){
            //stub
        }
        
        @Test
        @DisplayName("Bank object is null")
        void testGetAllAccountsNoBankObject(){
            //stub
        }
        
        @Test
        @DisplayName("expected results is null")
        void testGetAllAccountsNullEptResult(){
            //stub
        }
              
        @Test
        @DisplayName("Bank object is null and expected results is null")
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
        @DisplayName("This should pass")
        void testAddCustomerWizard(){
            //stub
        }
        
        @Test
        @DisplayName("No Bank object")
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
        @DisplayName("This should pass")
        void testAddCustomer() {
            //stub
        }
        
        @Test
        @DisplayName("FirstName is null")
        void testAddCustomerNullFirstName() {
            //stub
        }
        
        
        @Test
        @DisplayName("LastName is null")
        void testAddCustomerNullLastName() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object and no firstName")
        void testAddCustomerNoBankObject() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object and no firstName")
        void testAddCustomerNoBankObjectAndNoFirstName() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object and no lastName")
        void testAddCustomerNoBankObjectAndNoLastName() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object, no lastName, and no firstName")
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
        @DisplayName("This should pass")
        void testRemoveCustomer() {
            //stub
        }
        
        
        
        @Test
        @DisplayName("No customer ID")
        void testRemoveCustomerNullCustomerId() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object passed ")
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
        @DisplayName("This should pass")
        void testGetAllCustomers() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object")
        void testGetAllCustomersNoBankObject() {
            //stub
        }
        
        @Test
        @DisplayName("No Expected Result")
        void testGetAllCustomerNullExpResult() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object and no Expected Result")
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
        @DisplayName("This should pass")
        void testGetCustomer_String() {
            //stub
        }
        
        @Test
        @DisplayName("Customer ID number is empty")
        void testGetCustomer_StringBlankId() {
            //stub
        }
        
        @Test
        @DisplayName("No Bank Object")
        void testGetCustomer_StringNoBankObjct() {
            //stub
        }
        
        @Test
        @DisplayName("expResult is null")
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