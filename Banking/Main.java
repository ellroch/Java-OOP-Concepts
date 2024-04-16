package banking_system;

public class Main
{
//Test case objects - we make these public for easy access
	public static Bank citi, wlsfrgo;
	public static Customer jt, rg, cb;
	public static Main testCase;
   
   
	// Set up Banks, Customers, Accounts
	public Main() {
		
		citi = new Bank("Citibank", "388 Greenwich Street");
		wlsfrgo = new Bank("Wells Fargo Bank", "420 Montgomery Street");
		
		  jt = new Customer("Joe", "Tribiani");
	    rg = new Customer("Rachel", "Green");
	    cb = new Customer("Chandler", "Bing");
	    
	    jt.openAccount(citi, 100000.00);
	    jt.openAccount(wlsfrgo, 4000.0);
	    jt.openAccount(citi, 50000.00);
	
	    rg.openAccount(wlsfrgo, 5000.0);
	    rg.openAccount(citi, 200000.00);
	    
	    cb.openAccount(wlsfrgo, 150000.00);
	}
	
	public void testActions1() {
		System.out.println("testActions1");
		
       BankAccount ba1 = jt.getAccounts()[0];
       jt.depositMoney(ba1.getBankNumber(), ba1.getAcctNum(), 100000.00);
       
       BankAccount ba2 = rg.getAccounts()[0];        
       rg.withdrawMoney(ba2.getBankNumber(), ba2.getAcctNum(), 200.00);
       
       BankAccount ba3 = cb.getAccounts()[0]; 
       BankAccount ba4 = rg.getAccounts()[1]; 
       cb.transferMoaney(ba3.getBankNumber(), ba3.getAcctNum(),
       				ba4.getBankNumber(), ba4.getAcctNum(), 2500.00);
	}
	
	public void testActions2() {
		System.out.println("testActions2");
		
       BankAccount ba1 = jt.getAccounts()[0];
       jt.depositMoney(-999, -9999, 100000.00);
       
       BankAccount ba4 = cb.getAccounts()[0]; 
       BankAccount ba3 = rg.getAccounts()[1]; 
       cb.transferMoaney(ba3.getBankNumber(), ba3.getAcctNum(),
       				ba4.getBankNumber(), ba4.getAcctNum(), 2500.00);
	}
	
public  void printCurrentState() {
		
		// Print out states of customers
				System.out.println("Account Holders: ");
        System.out.println(jt.getFirstName()+ " " + jt.getLastName());
        System.out.println(rg.getFirstName()+ " " + rg.getLastName());
        System.out.println(cb.getFirstName()+ " " + cb.getLastName());
        
        // Print out states of banks
        System.out.println("\nBanks");
        System.out.println(citi.getBankName());
        System.out.println(wlsfrgo.getBankName());
        
        System.out.println("\n------------------");
        
        
        // Print out all of the accounts
        
   for(Bank bank : Bank.getAllBanks())   
   {
  	 
  	 if(bank ==null)
  		 break;
  	 
  	 System.out.printf("%s: %s: %s\n",bank.getBankName(), 
  			 															bank.getBankNumber(), 
  			 															bank.getAddress());
  	 
   }
		for (BankAccount acct : Bank.getAllAccounts()) {
			if (acct == null) {
				break;
			}
			System.out.printf("%d :", acct.getAcctNum());
			System.out.printf("%s %s", acct.getCustomer().getFirstName(), acct.getCustomer().getLastName());
			System.out.printf(" %.2f\n", acct.getAmount());
		}
		
		System.out.println("--------------------");
	}
	
	public static void main(String[] args) {

		// Set up a test case object Main
		Main testCase = new Main();
		
       // Make sure everything is set up correctly
		testCase.printCurrentState();
		
       // Go through the first set of tests
		testCase.testActions1();
		testCase.printCurrentState();

       // Go through the second set of tests (some error checking here)
		testCase.testActions2();
	testCase.printCurrentState();
	}
	
	
	
	
	
}
