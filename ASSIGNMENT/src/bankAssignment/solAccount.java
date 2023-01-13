package bankAssignment;
import java.util.*;
public class solAccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No Of Accounts=>");
		int n=sc.nextInt();
		Account ac[]=new Account[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter The Account No=>");
			int aNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter The Customer Id=>");
			String cId=sc.nextLine();
			System.out.println("Enter The Customer Name=>");
			String cName=sc.nextLine();
			System.out.println("Enter The Customer Balance=>");
			double balance=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter The Account Type=>");
			String aType=sc.nextLine();
			System.out.println("Enter The Account Status=>");
			String aStatus=sc.nextLine();
			
			ac[i]=new Account(aNo,cId,cName,balance,aType,aStatus);
			
		}
		Account ob=new Account(4577,"C06","RAM DAS",340000,"SAVING","ACTIVE");
		
		System.out.println("Previous Accounts=");
		for(Account a:ac)
		{
			System.out.println("Account Holders Id=>"+a.CustomerId+"\nAccount Holder's Name=>"+a.CustomerName+"\nAccount No=>"+a.AccountNo);
		}
		
		Account new1[]=insertAnAccount(ac,ob);
		System.out.println("New Account=>");
		for(Account final1:new1)
		{
			System.out.println("Account Holders Id=>"+final1.CustomerId+"\nAccount Holder's Name=>"+final1.CustomerName+"\nAccount No=>"+final1.AccountNo);
		}
		Account updateAccount[]=updateAccountBalance(new1,"SAVING");//'new1' ER JAYGAY 'ac' likhlei real array er opor hobe update
        System.out.println("Updated Account=>");
        for(Account updt:updateAccount)
        {
        	System.out.println("Account Holder's Name=>"+updt.CustomerName+" \n Account Holder's Balance=>"+updt.balance);
        }
        
        Account deleteAccount[]=deleteAccount(new1,"CURRENT");
        System.out.println("Active Accounts=");
        for(Account dl:deleteAccount)
        {
        	System.out.println("Account Holder's Name=>"+dl.CustomerName+" \nAccount Type=>"+dl.AccountType+" \nAccount Status=>"+dl.AccountStatus);
        }
        
        double totalSavings=findSavingsAccountTotalBalance(new1,"SAVING");
        System.out.println("Total Savings="+totalSavings);
        
        Account oddActive[]=getActiveOddAccountNumbers(new1,"ACTIVE");
        System.out.println("Active Odd Accounts Are=>");
        for(Account a:oddActive)
        {
        	System.out.println("Account No=>"+a.AccountNo+"\nAccount Holders Id=>"+a.CustomerId+"\nAccount Holders Name=>"+a.CustomerName+"\nAccount Holders Balance=>"+a.balance+"\nAccount Type=>"+a.AccountType+"\nAccount Status=>"+a.AccountStatus);
        }
        
        double currentAvgSavings=findCurrentAccountAverageBalance(new1,"CURRENT");
        System.out.println("Average Current Savings="+currentAvgSavings);
        
        Account savingActiveAc[]=getSavingActiveAccount(new1,"CURRENT","ACTIVE");
        System.out.println("The Active Savings Accounts Are=>");
        for(Account a:savingActiveAc)
        {
        	System.out.println("Account No=>"+a.AccountNo+"\nAccount Holders Id=>"+a.CustomerId+"\nAccount Holders Name=>"+a.CustomerName+"\nAccount Holders Balance=>"+a.balance+"\nAccount Type=>"+a.AccountType+"\nAccount Status=>"+a.AccountStatus);
        }
        Account sortActiveAccountByAccountId[]=sortActiveAccountByAccountId(new1);
        System.out.println("Sorted Array By Account No=>");
        for(Account a:sortActiveAccountByAccountId)
        {
        	System.out.println("Account No=>"+a.AccountNo+"\nAccount Holders Id=>"+a.CustomerId+"\nAccount Holders Name=>"+a.CustomerName+"\nAccount Holders Balance=>"+a.balance+"\nAccount Type=>"+a.AccountType+"\nAccount Status=>"+a.AccountStatus);
        }
        Account updateAndSortActiveCurrentAccounts[]=updateAndSortActiveCurrentAccounts(new1,"CURRENT","ACTIVE");
        System.out.println("Updated Sorted Account Details=>");
        for(Account a:updateAndSortActiveCurrentAccounts)
        {
        	System.out.println("Account No=>"+a.AccountNo+"\nAccount Holders Id=>"+a.CustomerId+"\nAccount Holders Name=>"+a.CustomerName+"\nAccount Holders Balance=>"+a.balance+"\nAccount Type=>"+a.AccountType+"\nAccount Status=>"+a.AccountStatus);
        }
        System.out.println("Customer Having Maximum Balance=>");
        Account maxSal=getAccountWithMaximumBalance(new1);
        System.out.println("Account Holder's Name=>"+maxSal.CustomerName+"\nAccount Holder's Balance"+maxSal.balance);
        
        System.out.println("Customer Having Minimum Balance=>");
        Account minSal=getAccountWithMinimumBalance(new1);
        System.out.println("Account Holder's Name=>"+minSal.CustomerName+"\nAccount Holder's Balance=>"+minSal.balance);
        
        System.out.println("Customer Having Second Maximum Balance=>");
        Account secondMaxSal=getAccountWithSecondMaximumBalance(new1);
        System.out.println("Account Holder's Name=>"+secondMaxSal.CustomerName+"\nAccount Holder's Balance"+secondMaxSal.balance);
        
        System.out.println("Customer Having Second Minimum Balance=>");
        Account secondMinSal=getAccountWithSecondMinimumBalance(new1);
        System.out.println("Account Holder's Name=>"+secondMinSal.CustomerName+"\nAccount Holder's Balance=>"+secondMinSal.balance);
        
        
        String s1[]=sortCustomersWithActiveSavingsAccount(new1,"SAVING","ACTIVE");
        System.out.println("Active Savings Accout Holder's Name In Sorted Order=>");
        for(String a:s1)
        {
        	System.out.println("Account Holder's Name=>"+a);
//        	try {
//        		System.out.println("Account Holder's Name=>"+a);
//        	}
//        	catch(Exception e){
//        		System.out.println(e.getMessage());
//        	}
        }
        String s2[]=sortCustomersWithActiveCurrentAccount(new1,"CURRENT","ACTIVE");
        System.out.println("Active Current Accout Holder's Name In Sorted Order=>");
        for(String a:s2)
        {
        	System.out.println("Account Holder's Name=>"+a);
        }
        System.out.println("Deposited Account=>");
        Account depAc=depositAccount(new1);
        System.out.println(depAc.CustomerName+depAc.balance);
        
        String s= withdrawAmount(new1);
        System.out.println(s);
        
        System.out.println("Account Without Zero Balance Is=>");
        Account withoutZero[]=deleteAccount(new1);
        for(Account i:withoutZero)
        {
        	System.out.println(i.CustomerName);
        }
        
        System.out.println("Active And Saving Accounts With Over 10000 Balance Are=>");
        Account ov10000[]=getDetailsOfActiveActiveAccounts(withoutZero);
        for(Account a:ov10000)
        {
        	try {
        	 System.out.println("Account No=>"+a.AccountNo+"\nAccount Holders Id=>"+a.CustomerId+"\nAccount Holders Name=>"+a.CustomerName+"\nAccount Holders Balance=>"+a.balance+"\nAccount Type=>"+a.AccountType+"\nAccount Status=>"+a.AccountStatus);
        	}
            catch(Exception e) {
            	System.out.println(e.getMessage());
            }
        }
        
        System.out.println("Accounts Having More Than Average Balance=>");
        Account moreThanAvgBal[]=findActiveAccountsMoreThanAvgBalance(withoutZero);
        for(int a=0;moreThanAvgBal[a]!=null;a++)
        {
        	try {
        	 System.out.println("Account No=>"+moreThanAvgBal[a].AccountNo+"\nAccount Holders Id=>"+moreThanAvgBal[a].CustomerId+"\nAccount Holders Name=>"+moreThanAvgBal[a].CustomerName+"\nAccount Holders Balance=>"+moreThanAvgBal[a].balance+"\nAccount Type=>"+moreThanAvgBal[a].AccountType+"\nAccount Status=>"+moreThanAvgBal[a].AccountStatus);
        	}
            catch(Exception e) {
            	System.out.println(e.getMessage());
            }
        }
        
        System.out.println("Account Holders Accounts Details Whose Name Starts With R Is=>");
        Account nameR[]=findActiveCurrentAccount(new1);
        for(Account a:nameR)
        {
        	try {
        	 System.out.println("Account No=>"+a.AccountNo+"\nAccount Holders Id=>"+a.CustomerId+"\nAccount Holders Name=>"+a.CustomerName+"\nAccount Holders Balance=>"+a.balance+"\nAccount Type=>"+a.AccountType+"\nAccount Status=>"+a.AccountStatus);
        	}
            catch(Exception e) {
            	System.out.println(e.getMessage());
            }
        }
        
	}
	
	public static Account[] insertAnAccount(Account ac[],Account obj)
	{
		Account copy[]=new Account[ac.length+1];
		for(int i=0;i<ac.length;i++)
		{
			copy[i]=ac[i];
		}
		copy[ac.length]=obj;
		return copy;
	}
    public static Account[] updateAccountBalance(Account new1[],String obj)
    {
    	//JODI REAL ARRAY ER ELEMENT ER OPOR EI UPDATE HOY THEN 'new1' ER JAIGAY 'ac' LIKHLEI HOYE JABE
    	int index=0,i,j;
    	for(int i1=0;i1<new1.length;i1++)
    	{
    		if(new1[i1].AccountStatus.equals("ACTIVE") && new1[i1].AccountType.equals(obj))
    		{
    			index++;
    		}
    	}
    	Account updt[]=new Account[index];
    	for(j=0,i=0;i<new1.length;i++)
    	{
    		if(new1[i].AccountStatus.equals("ACTIVE") && new1[i].AccountType.equals(obj))
    		{
//    			new1[i].balance+=(new1[i].balance*(7/100));
    			updt[j]=new Account(new1[i].AccountNo,new1[i].CustomerId,new1[i].CustomerName,new1[i].balance,new1[i].AccountType,new1[i].AccountStatus);
    		   
    		   	j++;
    		}
    	}
//    	for(int p=0;p<updt.length;p++)
//    	{
//    		updt[p].balance+=((updt[p].balance)*(7/100));
//    	}
    	return updt;
    }
	public static Account[] deleteAccount(Account new1[],String obj)
	{
		int index=0,i,j;
    	for(int i1=0;i1<new1.length;i1++)
    	{
    		if(new1[i1].AccountStatus.equals("INACTIVE") && new1[i1].AccountType.equals(obj))
    		{
    			index++;
    		}
    	}
    	Account dlt[]=new Account[new1.length-index];
    	for(j=0,i=0;i<new1.length;i++)
    	{
    		if((new1[i].AccountStatus).equals("ACTIVE") && (new1[i].AccountType)!=(obj))
    		{		
    			dlt[j]=new Account(new1[i].AccountNo,new1[i].CustomerId,new1[i].CustomerName,new1[i].balance,new1[i].AccountType,new1[i].AccountStatus);
    		   	j++;
    		}
    	}
    	return dlt;
	}
	public static double findSavingsAccountTotalBalance(Account new1[],String acType)

	{
		double savings=0;
		for(int i1=0;i1<new1.length;i1++)
		{
			if(new1[i1].AccountType.equals(acType))
			{
				savings+=new1[i1].balance;
			}
		}
		return savings;
	}
	public static double findCurrentAccountAverageBalance(Account new1[],String acType)
	{
		int index=0,sum=0;
		for(int i1=0;i1<new1.length;i1++)
		{
			if(new1[i1].AccountType.equals(acType))
			{
				index++;
			}
		}
		for(int i=0;i<new1.length;i++)
		{
			if(new1[i].AccountType.equals(acType))
			{
				sum+=new1[i].balance;
				sum=sum/index;
			}
		}
		return sum;
	}
	public static Account[] getActiveOddAccountNumbers(Account new1[],String acStatus)
	{
		int index=0,i,j;
		for(int i1=0;i1<new1.length;i1++)
		{
			if(new1[i1].AccountStatus.equals(acStatus) && (new1[i1].AccountNo)%2  !=  0)
			{
				index++;
			}
		}
//		System.out.println(index);
		Account oddAc[]=new Account[index];
		for(j=0, i=0;i<new1.length;i++)
		{
			if(new1[i].AccountStatus.equals(acStatus) && (new1[i].AccountNo)%2  != 0)
			{
				oddAc[j]=new Account(new1[i].AccountNo,new1[i].CustomerId,new1[i].CustomerName,new1[i].balance,new1[i].AccountType,new1[i].AccountStatus);
				j++;
			}
		}
		return oddAc;
	}
    public static Account[] getSavingActiveAccount(Account new1[],String acType,String acStatus)
    {
    	int index=0,i,j;
    	for(int i1=0;i1<new1.length;i1++)
    	{
    		if(new1[i1].AccountType.equals(acType) && new1[i1].AccountStatus.equals(acStatus))
    		{
    			index++;
    		}
    	}
    	Account saveAct[]=new Account[index];
    	for(j=0,i=0;i<new1.length;i++)
    	{
    		if(new1[i].AccountType.equals(acType) && new1[i].AccountStatus.equals(acStatus))
    		{
    			saveAct[j]=new Account(new1[i].AccountNo,new1[i].CustomerId,new1[i].CustomerName,new1[i].balance,new1[i].AccountType,new1[i].AccountStatus);
    			j++;
            }
    	}
    	return saveAct;
    }
	public static Account[] sortActiveAccountByAccountId(Account new1[])
	{
		int index=0,i,j;
		for(int i1=0;i1<new1.length;i1++)
		{
			if(new1[i1].AccountStatus.equals("ACTIVE"))
			{
				index++;
			}
		}
		Account a[]=new Account[index];
		for(j=0,i=0;i<new1.length;i++)
		{
			if(new1[i].AccountStatus.equals("ACTIVE"))
			{
				a[j]=new Account(new1[i].AccountNo,new1[i].CustomerId,new1[i].CustomerName,new1[i].balance,new1[i].AccountType,new1[i].AccountStatus);
				j++;
			}
		}
		for(int i2=0;i2<a.length;i2++)
		{
			for(int j1=0;j1<a.length-i2-1;j1++)
			{
				if((a[j1].AccountNo>a[j1+1].AccountNo))
				{
					Account t=a[j1];
					a[j1]=a[j1+1];
					a[j1+1]=t;
				}
			}
		}
		return a;
	}
    public static Account[] updateAndSortActiveCurrentAccounts(Account new1[],String acType,String acStatus)
    {
    	int index=0,i,j;
    	for(int i1=0;i1<new1.length;i1++)
    	{
    		if(new1[i1].AccountType.equals(acType) && new1[i1].AccountStatus.equals(acStatus))
    		{
    			index++;
    		}
    	}
    	Account sort[]=new Account[index];
    	for(j=0,i=0;i<new1.length;i++)
    	{
    		if(new1[i].AccountType.equals(acType) && new1[i].AccountStatus.equals(acStatus))
    		{
    			sort[j]=new Account(new1[i].AccountNo,new1[i].CustomerId,new1[i].CustomerName,new1[i].balance,new1[i].AccountType,new1[i].AccountStatus);
    			j++;
    		}
    	}
    	for(int k=0;k<sort.length;k++)
    	{
    		sort[k].balance+=100;
    	}
    	for(int p=0;p<sort.length;p++)
    	{
    		for(int q=0;q<sort.length-p-1;q++)
    		{
    			if(sort[q].balance<sort[q+1].balance)
    			{
    				Account temp=sort[q];
    				sort[q]=sort[q+1];
    				sort[q+1]=temp;
    			}
    		}
    	}
    	return sort;
    }
    public static Account getAccountWithMaximumBalance(Account new1[]) 
    {
    	for(int x=0;x<new1.length;x++)
    	{
    		for(int y=0;y<new1.length-x-1;y++)
    		{
    			if(new1[y].balance<new1[y+1].balance)
    			{
    				Account temp=new1[y];
    				new1[y]=new1[y+1];
    				new1[y+1]=temp;
    			}
    		}
    	}
    	return new1[0];
    }
    public static Account getAccountWithMinimumBalance(Account new1[]) 
    {
//    	Account a[]=new Account[1];
    	for(int x=0;x<new1.length;x++)
    	{
    		for(int y=0;y<new1.length-x-1;y++)
    		{
    			if(new1[y].balance>new1[y+1].balance)
    			{
    				Account temp=new1[y];
    				new1[y]=new1[y+1];
    				new1[y+1]=temp;
    			}
    		}
    	}
    	return new1[0];
    }
    public static Account getAccountWithSecondMaximumBalance(Account new1[]) 
    {
    	for(int x=0;x<new1.length;x++)
    	{
    		for(int y=0;y<new1.length-x-1;y++)
    		{
    			if(new1[y].balance<new1[y+1].balance)
    			{
    				Account temp=new1[y];
    				new1[y]=new1[y+1];
    				new1[y+1]=temp;
    			}
    		}
    	}
    	return new1[1];
    }
    public static Account getAccountWithSecondMinimumBalance(Account new1[]) 
    {
//    	Account a[]=new Account[1];
    	for(int x=0;x<new1.length;x++)
    	{
    		for(int y=0;y<new1.length-x-1;y++)
    		{
    			if(new1[y].balance>new1[y+1].balance)
    			{
    				Account temp=new1[y];
    				new1[y]=new1[y+1];
    				new1[y+1]=temp;
    			}
    		}
    	}
    	return new1[1];
    }
    public static String[] sortCustomersWithActiveSavingsAccount(Account new1[],String acType,String acStatus)
    {
    	int index=0,i,j,k,l;
    	for(int i1=0;i1<new1.length;i1++)
    	{
    		if(new1[i1].AccountType.equals(acType) && new1[i1].AccountStatus.equals(acStatus))
    		{
    			index++;
    		}
    	}
//    	System.out.println(index);
    	Account name1[]=new Account[index];
    	for(j=0,i=0;i<new1.length;i++)
    	{
    		if(new1[i].AccountType.equals(acType) && new1[i].AccountStatus.equals(acStatus))
    		{
    			name1[j]=new Account(new1[i].AccountNo,new1[i].CustomerId,new1[i].CustomerName,new1[i].balance,new1[i].AccountType,new1[i].AccountStatus);
    			j++;
    		}
    	}
    	for(int p=0;p<name1.length;p++)
    	{
    		for(int q=0;q<name1.length-p-1;q++)
    		{
    			if(name1[q].balance<name1[q+1].balance)
    			{
    				Account temp=name1[q];
    				name1[q]=name1[q+1];
    				name1[q+1]=temp;
    			}
    		}
    	}
    	String name[]=new String[index];
     	for(l=0,k=0;k<name1.length;k++)
    	{
    		name[l]=name1[k].CustomerName;
    		l++;
    	}
    	return name;
    }
    public static String[] sortCustomersWithActiveCurrentAccount(Account new1[],String acType,String acStatus)
    {
    	int index=0,i,j,k,l;
    	for(int i1=0;i1<new1.length;i1++)
    	{
    		if(new1[i1].AccountType.equals(acType) && new1[i1].AccountStatus.equals(acStatus))
    		{
    			index++;
    		}
    	}
    	Account name1[]=new Account[index];
    	for(j=0,i=0;i<new1.length;i++)
    	{
    		if(new1[i].AccountType.equals(acType) && new1[i].AccountStatus.equals(acStatus))
    		{
    			try {
    				name1[i]=new Account(new1[i].AccountNo,new1[i].CustomerId,new1[i].CustomerName,new1[i].balance,new1[i].AccountType,new1[i].AccountStatus);
        			j++;
    			}
    			catch(Exception e)
    			{
    				System.out.println(e.getMessage());
    			}
    		}
    	}
    	for(int p=0;p<name1.length;p++)
    	{
    		for(int q=0;q<name1.length-p-1;q++)
    		{
    			if(name1[q].balance<name1[q+1].balance)
    			{
    				Account temp=name1[q];
    				name1[q]=name1[q+1];
    				name1[q+1]=temp;
    			}
    		}
    	}
    	String name[]=new String[index];
     	for(l=0,k=0;k<name1.length;k++)
    	{
    		name[l]=name1[k].CustomerName;
    		l++;
    	}
    	return name;
    }
    public static Account depositAccount(Account new1[])
    {
    	Scanner sc=new Scanner(System.in);
    	int i=0;
    	System.out.println("Enter The Account No=>");
    	int acNo=sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter The Account Status=>");
    	String acStatus=sc.nextLine();
    	System.out.println("Enter The Amount To Be Deposited=>");
    	double depositAmount=sc.nextDouble();
    	while(i<new1.length)
    	{
    		if(new1[i].AccountNo==(acNo) && new1[i].AccountStatus.equals(acStatus))
    		{	
    				new1[i].balance+=depositAmount;
    				return new1[i];
    		}
    		else
    			i++;
    	}
    	return null;
    	
    }
    public static String withdrawAmount(Account new1[])
    {
    	Scanner sc=new Scanner(System.in);
    	int i=0;
    	System.out.println("Enter The Account No=>");
    	int acNo=sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter The Account Status=>");
    	String acStatus=sc.nextLine();
    	System.out.println("Enter The Amount To Be Deposited=>");
    	double withdrawAmount=sc.nextDouble();
    	while(i<new1.length)
    	{
    		if(new1[i].AccountNo==(acNo) && new1[i].AccountStatus.equals(acStatus))
    		{	
    				new1[i].balance-=withdrawAmount;
    				return "Balance of Customer: "+ new1[i].CustomerName +" With Account No: "+new1[i].AccountNo+" Is: "+new1[i].balance;
    		}
    		else
    			 i++;
    	}
    	return null;
    }
    public static Account[] deleteAccount(Account new1[])
    {
    	int index=0;
    	for(int i=0;i<new1.length;i++)
    	{
    		if(new1[i].balance>0)
    		{
    			index++;
    		}
    	}
    	Account updated[]=new Account[index];
    	int k=0;
    	for(int i=0;i<new1.length;i++)
    	{
    		if(new1[i].balance>0)
    		{
    			updated[k]=new Account(new1[i].AccountNo,new1[i].CustomerId,new1[i].CustomerName,new1[i].balance,new1[i].AccountType,new1[i].AccountStatus);
    			k++;
    		}
    	}
    	return updated;
    }
    public static Account[] getDetailsOfActiveActiveAccounts(Account withoutZero[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter The Accounts Status You Want To See=>");
    	String acStatus=sc.nextLine();
    	System.out.println("Enter The Accounts Type You Want To See=>");
    	String acType=sc.nextLine();
    	int index=0;
    	for(int j=0;j<withoutZero.length;j++)
    	{
    		if(withoutZero[j].balance>10000 && withoutZero[j].AccountStatus.equals(acStatus) && withoutZero[j].AccountType.equals(acType))
    		{
    			index++;
    	    }
    	}
    	Account over10000[]=new Account[index];
    	int k=0;
    	for(int i=0;i<withoutZero.length;i++)
    	{
    		if(withoutZero[i].balance>10000 && withoutZero[i].AccountStatus.equals(acStatus) && withoutZero[i].AccountType.equals(acType))
    		{
    			over10000[k]=new Account(withoutZero[i].AccountNo,withoutZero[i].CustomerId,withoutZero[i].CustomerName,withoutZero[i].balance,withoutZero[i].AccountType,withoutZero[i].AccountStatus);
    			k++;
    	    }
    	}
    	return over10000;
    }
    public static Account[] findActiveAccountsMoreThanAvgBalance(Account withoutZero[])
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter The Accounts Status You Want To See=>");
    	String acStatus=sc.nextLine();
    	int sum=0;
    	for(int i=0;i<withoutZero.length;i++)
    	{
    		sum+=withoutZero[i].balance;
    	}
    	int avgBalance=sum/withoutZero.length;
//    	int index=0;
//    	for(int j=0;j<withoutZero.length;j++)
//    	{
//    		if(withoutZero[j].balance>avgBalance)
//    		{
//    			index++;
//    		}
//    	}
    	Account getAvgBal[]=new Account[10];
    	int k=0;
    	for(int j=0;j<withoutZero.length;j++)
    	{
    		if(withoutZero[j].balance>avgBalance)
    		{
    			getAvgBal[k]=new Account(withoutZero[j].AccountNo,withoutZero[j].CustomerId,withoutZero[j].CustomerName,withoutZero[j].balance,withoutZero[j].AccountType,withoutZero[j].AccountStatus);
    			k++;
    		}
    	}
    	return getAvgBal;
    }
    public static Account[] findActiveCurrentAccount(Account new1[])
    {
    	//Array Jodi Ami Age baniye ni kono  specific size er then je array te return korbo setay nullpointer exception asbe tai index size er array banalam 
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter The Accounts Status You Want To See=>");
    	String acStatus=sc.nextLine();
    	System.out.println("Enter The Accounts Type You Want To See=>");
    	String acType=sc.nextLine();
    	int index=0;
    	for(int i=0;i<new1.length;i++)
    	{
    		if(new1[i].CustomerName.startsWith("R") && new1[i].AccountStatus.equals(acStatus) && new1[i].AccountType.equals(acType))
    		{
    			index++;
    		}
    	}
    	Account name[]=new Account[index];
    	int j=0;
    	for(int i=0;i<new1.length;i++)
    	{
    		if(new1[i].CustomerName.startsWith("R") && new1[i].AccountStatus.equals(acStatus) && new1[i].AccountType.equals(acType))
    		{
    			name[j]=new Account(new1[i].AccountNo,new1[i].CustomerId,new1[i].CustomerName,new1[i].balance,new1[i].AccountType,new1[i].AccountStatus);
    			j++;
    		}
    	}
    	return name;
    }
}