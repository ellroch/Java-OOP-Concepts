package banking_system;

public class Bank
{
	private String bankName,
								 bankNumber,
	               address;
	private static BankAccount[] allAccounts = new BankAccount[1000]; //constructor
	
	static int numBanks = 0;
	private static int assignBankNumber = 0;
	public static int getAssignBankNumber() {
		return assignBankNumber;
	}

	int acctNums = 0;
	private int assignAcctNumber = 0;
	
	public int getAssignAcctNumber() {
		return assignAcctNumber;
	}

	private static Bank[] allBanks = new Bank[100];
	
			
	
	public Bank(String name, String address)//constructor
	{
		this.bankName = name;                 //to set the bank name, address, and bank number
		this.address = address;
		this.bankNumber = Integer.toString(assignBankNumber);
		allBanks[assignBankNumber++] = this;
		// TODO Auto-generated constructor stub
	}
	public static BankAccount[] getAllAccounts() {
		return allAccounts;
	}

//getters and setters	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankNumber() {
		return bankNumber;
	}
	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public static int getNumBanks() {
		return numBanks;
	}
	public int getAcctNums() {
		return acctNums;
	}

	
	
	public BankAccount createAccount(Customer customer, double amount){
		BankAccount b = new BankAccount(this, assignAcctNumber, amount);
		
		allAccounts[assignAcctNumber++] = b;
		b.setCustomer(customer);
		return b;
	}
	
	public static Bank[] getAllBanks() {
		return allBanks;
	}
	public static int getAssignBankNunber() {
		return 0;
	}
	
	
	
}
