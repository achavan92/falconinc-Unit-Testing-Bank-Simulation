package banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {
	Bank bank = new Bank("bank");
	Customer cust = new Customer(bank, "First Name", "Last Name");
	String description;
	double initBal;
	SavingsAccount account1;
	SavingsAccount account2;
	
	@BeforeEach
	void init() {
		initBal = 100.50;
		description = "";
		account1 = new SavingsAccount(cust, initBal, description);
		account2 = new SavingsAccount(cust, initBal, description);
	}
	
	//Create a new savings account with the specified initial balance, for the specified customer, and with the given account description
	//Giving it 
	@Nested
	class ConstructorTest {
		@Test
		@DisplayName("Happy path Test")
		void SavingsAccountConstructorTest () {
			double initBal = 100.50;
			account1 = new SavingsAccount(cust, initBal, description);
			double balReturn = account1.getBalance();
			assertEquals(initBal, balReturn, "Balance shoud be " + initBal + " was " + balReturn);
		}
		
		@Test
		@DisplayName("Negative Balance Test")
		void SavingsAccountConstructorTestNegative () {
			double initBal = -100.50;
			assertThrows(IllegalArgumentException.class, () -> account2 = new SavingsAccount(cust, initBal, description), "Constructor dint throw Illegal argument");
		}
	}

	
	//Adds a transaction "INTEREST PAYMENT" based on this account's monthly interest rate.
	@Nested
	class InterestTest{
		@Test
		@DisplayName("Happy path Test")
		void addInterestTest () {
			double rate = 10.10;
			double newBalance = initBal + rate;
			double rateReturned;
			
			rateReturned = SavingsAccount.getDefaultInterestRate();
			
			assertEquals(rate, rateReturned,"Interest shoud be " + newBalance + " was " + rateReturned);
		}
		
		@Test
		@DisplayName("Add Negative interest Test")
		void addInterestTestNegative () {
			double rate = -0.01;
			assertThrows(IllegalArgumentException.class, () -> account1.addInterestTransaction(rate), "Add interest dint throw Illegal argument.");
		}
	}
	
	
	//Add money into account
	@Nested
	class DepositTest{
		@Test
		@DisplayName("Happy Path Test")
		void depositTest() {
			double amount = 100.56;
			double newBalance = initBal + amount;
			account1.deposit(amount);
			double balReturn = account1.getBalance();
			assertEquals(newBalance, balReturn, "Balance shoud be " + newBalance + " was " + balReturn);
			
		}
		
		@Test
		@DisplayName("Add negative Test")
		void depositTestNegative() {
			double amount = -100.56;
			assertThrows(IllegalArgumentException.class, () -> account1.deposit(amount), "Deposit tryed to add a negative.");
		}
		
		@Test
		@DisplayName("Not a unit of money Test")
		void depositTestNotMoney() {
			double amount = 100.056;
			assertThrows(IllegalArgumentException.class, () -> account1.deposit(amount), "Deposit acepted something thats not an amount money.");
		}
	}
	
	
	//remove money from account 
	@Nested
	class WithdrawTest{
		@Test
		@DisplayName("Happy path Test")
		void withdrawTest(){
			double amount = 20.10;
			double newBalance = initBal - amount;
			
			account1.withdraw(amount);
			 
			double balReturn = account1.getBalance();
			assertEquals(newBalance, balReturn, "Balance shoud be " + newBalance + " was " + balReturn);
		}
		
		@Test
		@DisplayName("add a negative Test")
		void withdrawTestNegative() {
			double amount = -100.56;
			assertThrows(IllegalArgumentException.class, () -> account1.withdraw(amount), "Withdraw tryed to add a negative.");
		}
		
		@Test
		@DisplayName("Not money Test")
		void withdrawTestNotMoney() {
			double amount = 100.056;
			assertThrows(IllegalArgumentException.class, () -> account1.withdraw(amount), "Withdraw acepted something thats not an amount money.");
		}
		
		@Test
		@DisplayName("You dont have enough money Test")
		void withdrawtNotEnoughMoneyTest() {
			double amount = 100000.56;
			assertThrows(IllegalArgumentException.class, () -> account1.withdraw(amount), "You withdrew more money then you had.");
		}
		
	}
	
	//Transfer funds between two accounts of a single customer.
	@Nested
	class TransferTest{
		@Test
		@DisplayName("Happy Path Test")
		void transferTest () {
			double amount  = 30.50;
			double account1Bal = initBal - amount;
			double account2Bal = initBal + amount;
			
			Account.transfer(account1, account2, amount);
			
			double account1Return = account1.getBalance();
			double account2Return = account2.getBalance();
			assertEquals(account1Bal, account1Return, "Balance shoud be " + account1Bal + " was " + account1Return);
			assertEquals(account2Bal, account2Return, "Balance shoud be " + account2Bal + " was " + account2Return);
		}
		
		@Test
		@DisplayName("Negative tramsfer Test")
		void transferTestNegative() {
			double amount = -100.56;
			assertThrows(IllegalArgumentException.class, () -> Account.transfer(account1, account2, amount), "Transfer tryed to add a negative.");
		}
		
		@Test
		@DisplayName("Not money Test")
		void TransferTestNotMoney() {
			double amount = 100.00056;
			assertThrows(IllegalArgumentException.class, () -> Account.transfer(account1, account2, amount), "Transfer acepted something thats not an amount money.");
		}
		
		@Test
		@DisplayName("Not enough money Test")
		void TransferNotEnoughMoneyTest() {
			double amount = 100000.56;
			assertThrows(IllegalArgumentException.class, () ->Account.transfer(account1, account2, amount), "You tansfered more money then you had.");
		}
	}
	
	@Nested
	class GetTransactionTest{
		//Returns a List of all transactions for this account. returns List<Transaction>
		@Test
		@Disabled //Takes no arguments and the object Transactions should be tested in its own class.
		@DisplayName("Get All Transaction Test")
		void getTransactionsTest (){}
		
		//Returns the specified transaction. returns Transaction
		@Test
		@DisplayName("Should Pass Test")
		void getTransactionTest () {
			int transactionId = 1;
			assertDoesNotThrow( () -> account1.getTransaction(transactionId), "Get Transaction throw a exception when it shouldnt have.");
		}
		
		@Test
		@DisplayName("Id 0 test")
		void getTransactionTestIdZero () {
			int transactionId = 0;
			assertThrows(IllegalArgumentException.class, () -> account1.getTransaction(transactionId), "Get Transaction took an invalid Id");
		}
		
		@Test
		@DisplayName("Negative id test")
		void getTransactionTestIdNegative () {
			int transactionId = -32;
			assertThrows(IllegalArgumentException.class, () -> account1.getTransaction(transactionId),"Get Transaction took a negative Id");
		}
	}

	}
