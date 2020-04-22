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
    
    Bank bank = new Bank("bank");
    String Name = "name";
    double insufficientFundsPenalty = 10.00;  // Default, in dollars
    String description;
    Bank account1;
    Bank account2;

    // initailiser
    @BeforeEach
    void init(){
        //ToDo: finish initailiser
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
            name = "Name";
        }
        
        @Test
        @DisplayName("Name is null")
        void BankConstructorTestNullName(String name){
            name = null;
        }
        
        @Test
        @DisplayName("Name is blank")
        void BankConstructorTestBlankName(String name){
            name = "";
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
        double testGetInsufficientFundsPenalty(){
            return insufficientFundsPenalty = 10.00;
        }
        
        @Test
        @DisplayName("Negative amount for insufficientFundsPenalty")
        double testGetInsufficientFundsPenaltyNegativeAmount(){
            return insufficientFundsPenalty = -10.00;
        }
        
        @Test
        @DisplayName("Amount over insufficientFundsPenalty")
        double testGetInsufficientFundsPenaltyOverAmount(){
            return insufficientFundsPenalty = 10.01;
        }
        
        @Test
        @DisplayName("Amount under insufficientFundsPenalty")
        double testGetInsufficientFundsPenaltyUnderAmount(){
            return insufficientFundsPenalty = 9.99;
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
        //ToDo: finish
        @Test
        @DisplayName("THis should pass")
        String TestGetName(){
            return Name;
        }
        
        @Test
        @DisplayName("Name cannot be null")
        String TestGetNameNull(){
            return Name = null;
        }
        
        @Test
        @DisplayName("Name cannot be an empty String")
        String TestGetNameEmptyString(){
            return Name = "";
        }
        
    }

    /**
     * Test of addAccountWizard method, of class Bank.
     */
    @Nested
    class TestAddAcountWizard {
       //ToDo: finish 
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
        //ToDo: finish
        @Test
        @DisplayName("This should pass")
        SortedSet<Account> testGetAllAccounts(){
            Bank instance = bank;
            SortedSet<Account> expResult = null; // remove null value
            SortedSet<Account> result = instance.getAllAccounts();
            return result;
        }
        
        @Test
        @DisplayName("Bank object is null")
        SortedSet<Account> testGetAllAccountsNoBankObject(){
            Bank instance = null;
            SortedSet<Account> expResult = null; // remove null value
            SortedSet<Account> result = instance.getAllAccounts();
            return result;
        }
        
        @Test
        @DisplayName("expected results is null")
        SortedSet<Account> testGetAllAccountsNullEptResult(){
            Bank instance = bank;
            SortedSet<Account> expResult = null; 
            SortedSet<Account> result = instance.getAllAccounts();
            return result;
        }
              
        @Test
        @DisplayName("Bank object is null and expected results is null")
        SortedSet<Account> testGetAllAccountsNoBankObjectAndNullEptResult(){
            Bank instance = null;
            SortedSet<Account> expResult = null;
            SortedSet<Account> result = instance.getAllAccounts();
            return result;
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
        public void testAddCustomer() {
        String lastName = "FirstName";
        String firstName = "LastName";
        Bank instance = bank;
        String result = instance.addCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("FirstName is null")
        public void testAddCustomerNullFirstName() {
        String lastName = null;
        String firstName = "LastName";
        Bank instance = bank;
        String result = instance.addCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("FirstName is an empty String")
        public void testAddCustomerBlankFirstName() {
        String lastName = "";
        String firstName = "LastName";
        Bank instance = bank;
        String result = instance.addCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("LastName is null")
        public void testAddCustomerNullLastName() {
        String lastName = "FirstName";
        String firstName = null;
        Bank instance = bank;
        String result = instance.addCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("LastName is empty String")
        public void testAddCustomerBlankLastName() {
        String lastName = "FirstName";
        String firstName = "";
        Bank instance = bank;
        String result = instance.addCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("No Bank Object")
        public void testAddCustomerNoBankObject() {
        String lastName = "FirstName";
        String firstName = null;
        Bank instance = null;
        String result = instance.addCustomer(lastName, firstName);
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
        public void testRemoveCustomer() {
            String customerId = "1";
            Bank instance = bank;
            instance.removeCustomer(customerId);
        }
        
        @Test
        @DisplayName("Customer ID is blank")
        public void testRemoveCustomerNoCustomerId() {
            String customerId = "";
            Bank instance = bank;
            instance.removeCustomer(customerId);
        }
        
        @Test
        @DisplayName("Customer ID is null")
        public void testRemoveCustomerNullCustomerId() {
            String customerId = null;
            Bank instance = bank;
            instance.removeCustomer(customerId);
        }
        
        @Test
        @DisplayName("No Bank Object")
        public void testRemoveCustomerNoBankObject() {
            String customerId = "1";
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
        public void testGetCustomer_String_String() {
            String lastName = "FirstName";
            String firstName = "LastName";
            Bank instance = bank;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("FirstName is an Empty String")
        public void testGetCustomer_String_StringNoFirstName() {
            String lastName = "";
            String firstName = "LastName";
            Bank instance = bank;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("LastName is an empty String")
        public void testGetCustomer_String_StringNoLastName() {
            String lastName = "FirstName";
            String firstName = "";
            Bank instance = bank;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("No Bank object passed")
        public void testGetCustomer_String_StringNoBankObjct() {
            String lastName = "FirstName";
            String firstName = "LastName";
            Bank instance = null;
            List<Customer> expResult = instance.getCustomer(lastName, firstName);
            List<Customer> result = instance.getCustomer(lastName, firstName);
        }
        
        @Test
        @DisplayName("Expected Result is null")
        public void testGetCustomer_String_StringNUllExpResult() {
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
        public void testGetCustomersAccounts() {
            String customerId = "1";
            Bank instance = bank;
            List<Account> expResult = instance.getCustomersAccounts(customerId);
            List<Account> result = instance.getCustomersAccounts(customerId);
        }
        
        @Test
        @DisplayName("No Customer ID number")
        public void testGetCustomersAccountsNoID() {
            String customerId = "";
            Bank instance = bank;
            List<Account> expResult = instance.getCustomersAccounts(customerId);
            List<Account> result = instance.getCustomersAccounts(customerId);
        }
        
        @Test
        @DisplayName("No Bank Object Passed")
        public void testGetCustomersAccountsNoBankObjct() {
            String customerId = "1";
            Bank instance = null;
            List<Account> expResult = instance.getCustomersAccounts(customerId);
            List<Account> result = instance.getCustomersAccounts(customerId);
        }
        
        @Test
        @DisplayName("No expected result")
        public void testGetCustomersAccountsNoexpRessult() {
            String customerId = "1";
            Bank instance = bank;
            List<Account> expResult = null;
            List<Account> result = instance.getCustomersAccounts(customerId);
        }
    }
    
}
