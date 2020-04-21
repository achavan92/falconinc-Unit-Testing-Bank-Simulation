package banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SavingsAccountTest {
	Bank bank = new Bank("bank");
	Customer cust = new Customer(bank, "First Name", "Last Name");
	String description;
	SavingsAccount account1;
	SavingsAccount account2;
	
	@BeforeEach
	void init() {
		double initBal = 100.50;
		description = "";
		account1 = new SavingsAccount(cust, initBal, description);
		account2 = new SavingsAccount(cust, initBal, description);
	}
	
	//Create a new savings account with the specified initial balance, for the specified customer, and with the given account description
	//Giving it 
	@Test
	@DisplayName("Constructor Test")
	void SavingsAccountConstructorTest () {
		double initBal = 100.50;
		assertDoesNotThrow( () -> account1 = new SavingsAccount(cust, initBal, description), "Savings Account Constructor throw and exception when it shouldnt have.");
	}
	
	@Test
	@DisplayName("-Constructor Test, Negative Balance")
	void SavingsAccountConstructorTestNegative () {
		double initBal = -100.50;
		assertThrows(IllegalArgumentException.class, () -> account2 = new SavingsAccount(cust, initBal, description), "Constructor dint throw Illegal argument");
	}
	
	//Adds a transaction "INTEREST PAYMENT" based on this account's monthly interest rate.
	@Test
	@DisplayName("add interest test")
	void addInterestTest () {
		double rate = 0.01;
		assertDoesNotThrow( () -> account1.addInterestTransaction(rate), "Add interest Test throw a exception when it shouldnt have.");
	}
	
	@Test
	@DisplayName("-add interest test")
	void addInterestTestNegative () {
		double rate = -0.01;
		assertThrows(IllegalArgumentException.class, () -> account1.addInterestTransaction(rate), "Add interest dint throw Illegal argument.");
	}
	
	//Add money into account
	@Test
	@DisplayName("Deposit Test")
	void depositTest() {
		double amount = 100.56;
		assertDoesNotThrow( () -> account1.deposit(amount), "Deposit throw a Illegal argument when it shouldnt have");
	}
	
	@Test
	@DisplayName("Deposit negative Test")
	void depositTestNegative() {
		double amount = -100.56;
		assertThrows(IllegalArgumentException.class, () -> account1.deposit(amount), "Deposit tryed to add a negative.");
	}
	
	@Test
	@DisplayName("Deposit is that money Test")
	void depositTestNotMoney() {
		double amount = 100.00056;
		assertThrows(IllegalArgumentException.class, () -> account1.deposit(amount), "Deposit acepted something thats not an amount money.");
	}
	
	//remove money from account 
	@Test
	@DisplayName("Withdraw Test")
	void withdrawTest(){
		double amount = 100.56;
		assertDoesNotThrow( () -> account1.withdraw(amount), "Withdraw throw a Illegal argument when it shouldnt have");
	}
	
	@Test
	@DisplayName("Withdraw negative Test")
	void withdrawTestNegative() {
		double amount = -100.56;
		assertThrows(IllegalArgumentException.class, () -> account1.withdraw(amount), "Withdraw tryed to add a negative.");
	}
	
	@Test
	@DisplayName("Withdraw is that money Test")
	void withdrawTestNotMoney() {
		double amount = 100.00056;
		assertThrows(IllegalArgumentException.class, () -> account1.withdraw(amount), "Withdraw acepted something thats not an amount money.");
	}
	
	@Test
	@DisplayName("Withdraw not enough money Test")
	void withdrawtNotEnoughMoneyTest() {
		double amount = 100000.56;
		assertThrows(IllegalArgumentException.class, () -> account1.withdraw(amount), "You withdrew more money then you had.");
	}
	
	//Transfer funds between two accounts of a single customer.
	@Test
	@DisplayName("Transfer money Test")
	void transferTest () {
		double amount  = 100.56;
		assertDoesNotThrow( () -> Account.transfer(account1, account2, amount), "Transfer throw a exception when it shouldnt have.");
	}
	
	@Test
	@DisplayName("Withdraw negative Test")
	void transferTestNegative() {
		double amount = -100.56;
		assertThrows(IllegalArgumentException.class, () -> Account.transfer(account1, account2, amount), "Transfer tryed to add a negative.");
	}
	
	@Test
	@DisplayName("Withdraw is that money Test")
	void TransferTestNotMoney() {
		double amount = 100.00056;
		assertThrows(IllegalArgumentException.class, () -> Account.transfer(account1, account2, amount), "Transfer acepted something thats not an amount money.");
	}
	
	@Test
	@DisplayName("Withdraw not enough money Test")
	void TransferNotEnoughMoneyTest() {
		double amount = 100000.56;
		assertThrows(IllegalArgumentException.class, () ->Account.transfer(account1, account2, amount), "You tansfered more money then you had.");
	}
	
	//Returns a List of all transactions for this account. returns List<Transaction>
	@Test
	@Disabled //Takes no arguments so can't be tested.
	@DisplayName("get Transaction Test")
	void getTransactionsTest (){}
	
	//Returns the specified transaction. returns Transaction
	@Test
	@DisplayName("Get Transaction Test")
	void getTransactionTest () {
		int transactionId = 1;
		assertDoesNotThrow( () -> account1.getTransaction(transactionId), "Get Transaction throw a exception when it shouldnt have.");
	}
	
	@Test
	@DisplayName("Get Transaction Invalid Id test")
	void getTransactionTestIdZero () {
		int transactionId = 0;
		assertThrows(IllegalArgumentException.class, () -> account1.getTransaction(transactionId), "Get Transaction took an invalid Id");
	}
	
	@Test
	@DisplayName("Get Transaction negative id test")
	void getTransactionTestIdNegative () {
		int transactionId = 0;
		assertThrows(IllegalArgumentException.class, () -> account1.getTransaction(transactionId),"Get Transaction took a negative Id");
	}
}
