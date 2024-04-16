package banking_system;

public class Customer
{
	private static final int MAX_ACCTS = 10;
	private String firstName,
								 lastName,
								 address;
	private int acct = 0;
	//private BankAccount acounts[];
	private BankAccount[] accounts = new BankAccount[MAX_ACCTS];

	public Customer(String fName, String lName)//constructor 
	{
		super();
		this.firstName = fName;//to set customer's first name value
		this.lastName = lName;
		this.address = "";
		this.acct = 0;
	}


	//getters and setters.
	
	public String getFirstName() {
		return firstName;//customer first name return
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAcct() {

		return acct;
	}
	

	
public	void openAccount(Bank b, double amount)     //open account method
	{
		if(this.acct >= MAX_ACCTS -1)                 //checking if account limit is exceeded
		{
			System.out.println("you can't have more than 10 account");
		return;
		}
	
	this.accounts[this.acct++] = b.createAccount(this, amount);   //increment account by 1
	return;
	}
	
	//open account end;
	
	public void transferMoaney(int fromBank,int fromAcctNum,int toBank, int toAcctNum,double amount) //transfer function
	{
		
		if((fromBank) <0|| (toBank) > Bank.getAssignBankNumber())
	  {
	  	System.out.println("No such bank");
	  	return;
	  }
	  else if((toBank) <0|| (fromBank) > Bank.getAssignBankNumber())
	  {
	  	System.out.println("No such bank");
	  	return;
	  }
	  
	  Bank fromBk = Bank.getAllBanks()[(fromBank)];
	  Bank toBk = Bank.getAllBanks()[(toBank)];
	  
	  if(fromBk ==null)
	  {
	  	System.out.println("No such bank");
	  	return;
	  }
	  else if(toBk==null)
	  {
	  	System.out.println("Destination doesn't exists");
	  }
	  else if (fromAcctNum < 0)
	  {
	  	
	  }
	  
	  
	  BankAccount fromBacct = fromBk.getAllAccounts()[fromAcctNum];
	  BankAccount toBacct = toBk.getAllAccounts()[toAcctNum];
	  
	  		
		
	}//end of transfer;
  public void transferMoaney(String fromBank,int fromAcctNum,String toBank, int toAcctNum,double amount)
  {
  if(Integer.parseInt(fromBank) <0|| Integer.parseInt(toBank) > Bank.getAssignBankNumber())//checking if bank exist
  {
  	System.out.println("No such bank");
  	return;
  }
  else if(Integer.parseInt(toBank) <0|| Integer.parseInt(fromBank) > Bank.getAssignBankNumber())
  {
  	System.out.println("No such bank");
  	return;
  }
  
  Bank fromBk = Bank.getAllBanks()[Integer.parseInt(fromBank)];
  Bank toBk = Bank.getAllBanks()[Integer.parseInt(toBank)];
  
  if(fromBk ==null)
  {
  	System.out.println("No such bank");
  	return;
  }
  else if(toBk==null)
  {
  	System.out.println("Destination bank doesn't exists");
  }
  else if (fromAcctNum < 0)
  {
  	System.out.println("Source bank account doesn't exists");
  	return;
  }
  
  
  BankAccount fromBacct = fromBk.getAllAccounts()[fromAcctNum];
  BankAccount toBacct = toBk.getAllAccounts()[toAcctNum];
  
  if(fromBacct ==null)
  {
  	System.out.println("No such bank");
  	return;
  }
  else if(toBacct==null)
  {
  	System.out.println("Destination doesn't exists");
  	return;
  }
  else if (fromAcctNum < 0)
  {
  	System.out.println("Source account doesn't exists");
  	return;
  }
  else if(fromBacct.getAmount()-toBacct.getAmount()<0.00)
  {
  	System.out.println("You don't have enough moeny to transter");
  return;
  }
  else if(fromBacct.getAmount()-toBacct.getAmount()>0.00)
  {
  	fromBacct.setAmount(fromBacct.getAmount()-amount);
  	toBacct.setAmount(toBacct.getAmount()+amount);
  	
  	System.out.println("Transfer Successfull");
  }
  
  
}//end of transfer
		
	public void withdrawMoney(int fromBank, int fromAcctNum, double amount){
		
		if((fromBank)<0 || (fromBank) > Bank.getAssignBankNumber())
		{
			System.out.println("No such bank");
			return;
		}
		Bank b = Bank.getAllBanks()[(fromBank)];
		if(b == null)
		{
			System.out.println("No bank found");
			return;
		}
		else if (fromAcctNum < 0 || fromAcctNum >b.getAssignAcctNumber())
		{
			System.out.println("Account not found");
			return;
		}
		BankAccount bal = b.getAllAccounts()[fromAcctNum];
		if(bal ==null)
		{
			System.out.println("Account not found.");
			return;
		}
		bal.setAmount(bal.getAmount()-amount);
		if(bal.getAmount()-amount<0.00)
		{
			System.out.println("You don't have enough money");
		}
		else if(bal.getAmount()-amount>0.00);
		{
			bal.setAmount(bal.getAmount()-amount);
			return;
		}
		
		
	}//end of withdrawMoney;
	public void withdrawMoney(String fromBank, int fromAcctNum, double amount) {
		if(Integer.parseInt(fromBank)<0 || Integer.parseInt(fromBank) > Bank.getAssignBankNumber())
		{
			System.out.println("No such bank");
			return;
		}
		Bank b = Bank.getAllBanks()[Integer.parseInt(fromBank)];
		if(b == null)
		{
			System.out.println("No bank found");
			return;
		}
		else if (fromAcctNum < 0 || fromAcctNum >b.getAssignAcctNumber())
		{
			System.out.println("Account not found");
			return;
		}
		BankAccount bal = b.getAllAccounts()[fromAcctNum];
		if(bal ==null)
		{
			System.out.println("Account not found.");
			return;
		}
		bal.setAmount(bal.getAmount()-amount);
		if(bal.getAmount()-amount<0.00)
		{
			System.out.println("You don't have enough money");
			return;
		}
		else if(bal.getAmount()-amount>0.00);
		{
			bal.setAmount(bal.getAmount()-amount);
			return;
		}
		
	}
	
	public void depositMoney(int toBank,int toAcctNum, double amount)
	{
		if((toBank)<0 || (toBank) > Bank.getAssignBankNumber())
		{
			System.out.println("No such bank");
			return;
		}
		Bank b = Bank.getAllBanks()[(toBank)];
		if(b == null)
		{
			System.out.println("No bank found");
			return;
		}
		else if (toAcctNum < 0 || toAcctNum >b.getAssignAcctNumber())
		{
			System.out.println("Account not found");
			return;
		}
		BankAccount bal = b.getAllAccounts()[toAcctNum];
		if(bal ==null)
		{
			System.out.println("Account not found.");
			return;
		}
		bal.setAmount(bal.getAmount()+amount);
		return;
			
	}//end of depositMoney
	

	public void depositMoney(String toBank, int toAcctNum, double amount) 
	{
	if(Integer.parseInt(toBank)<0 || Integer.parseInt(toBank) > Bank.getAssignBankNumber())
	{
		System.out.println("No such bank");
		return;
	}
	Bank b = Bank.getAllBanks()[Integer.parseInt(toBank)];
	if(b == null)
	{
		System.out.println("No bank found");
		return;
	}
	else if (toAcctNum < 0 || toAcctNum >b.getAssignAcctNumber())
	{
		System.out.println("Account not found");
		return;
	}
	BankAccount bal = b.getAllAccounts()[toAcctNum];
	if(bal ==null)
	{
		System.out.println("Account not found.");
		return;
	}
	bal.setAmount(bal.getAmount()+amount);
	return;
	}



public BankAccount[] getAccounts() {
	return accounts;
}

}
