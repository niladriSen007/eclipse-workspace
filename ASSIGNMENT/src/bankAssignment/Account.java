package bankAssignment;

public class Account {

	int AccountNo;
	String CustomerId;
	String CustomerName;
	double balance;
	String AccountType;
	String AccountStatus;
	public Account(int accountNo, String customerId, String customerName, double balance, String accountType,String accountStatus) 
	{
		super();
		AccountNo = accountNo;
		CustomerId = customerId;
		CustomerName = customerName;
		this.balance = balance;
		AccountType = accountType;
		AccountStatus = accountStatus;
	}
	
	
}
