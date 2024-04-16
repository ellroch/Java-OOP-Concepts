package banking_system;

public class BankAccount
{
	private Customer customer;
	private int acctNum;
	private double amount;
	private Bank bank;
	
	
	
	public BankAccount(Bank bank, int acctNum, double amount)
	{
		this.acctNum = acctNum;
		this.amount = amount;
		this.bank = bank;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getAcctNum() {
		return acctNum;
	}
	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
	public String getBankName()
	{
		return this.bank.getBankName();
	
	}
	
	public String getBankNumber()
	{
		return this.bank.getBankNumber();
	}
	
	
	
	
	

}
