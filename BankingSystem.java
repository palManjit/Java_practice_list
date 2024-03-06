import java.util.Scanner;
class Account{
	private int AccountNumber;
	private String name;
	private double balance;
	static int Accountgenerater=856892;
	static String bankName="SBI";
	Account(){}
	Account(String name,double balance)
	{
		Accountgenerater++;
		AccountNumber=Accountgenerater;
		this.name=name;
		this.balance=balance;
	}
	double deposite(double amt)
	{
		balance=balance+amt;
		System.out.println("Transation Succecfull");
		return balance;
	}
	double withdrow(double amt)
	{
		balance=balance-amt;
		System.out.println("Transation Succecfull");
		return balance;
	}
	void ShowInformation()
	{
		System.out.println("--------Details-------");
		System.out.println("Account Number :"+AccountNumber);
		System.out.println("Account holder name :"+name);
		System.out.println("Total balance :"+balance);
		System.out.println("Bank name :"+bankName);
		System.out.println("");
	}
	int getAccountNumber()
	{
		return AccountNumber;
	}
}
class BankingSystem{
	public static void main(String args[])
	{
		Scanner mp =new Scanner(System.in);
		String username="Manjit";
		String password="1234";
		System.out.println("enter the username");
		String un= mp.next();
		System.out.println("enter the password");
		String pass= mp.next();
		if(un.equals(username)&&pass.equals(password))
		{
			System.out.println("Welcome To State Bank of India");
		}
		else
		{
			System.out.println("It is a wrong");
		}
		System.out.println("How many account do you want to create:");
		int n=mp.nextInt();
		Account A[]=new Account[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Informatoin for account holder 1:"+(i+1));
		System.out.println("enter name:");
		mp.nextLine();
		String name=mp.nextLine();
		System.out.println("enter balance");
		double balance=mp.nextDouble();
		A[i]=new Account(name,balance);
		}
		int acco;
		boolean flag;
		double amt;
		while(true)
		{
			System.out.println("press 1 to deposite");
			System.out.println("press 2 to withdrow");
			System.out.println("press 3 to display account holders details");
			System.out.println("press 4 to exit");
			int x=mp.nextInt();
			switch(x)
			{
				case 1 :
				      System.out.println("Enter Account Number:");
					    acco=mp.nextInt();
						flag=false;
						for(int i=0;i<n;i++)
						{
							if(acco==A[i].getAccountNumber())
							{
								System.out.println("Enter Amount");
								amt=mp.nextDouble();
								amt=A[i].deposite(amt);
								System.out.println("current balance is:"+amt);
								
								flag =true;
								break;
							}
						}
						if(flag==false)
							System.out.println("Account number is wrong");
						break;
								
				case 2 :
				      System.out.println("enter account number");
					    acco=mp.nextInt();
						flag=false;
						for(int i=0;i<n;i++)
						{
							if(acco==A[i].getAccountNumber())
							{
								System.out.println("enter amount");
								amt=mp.nextDouble();
								amt=A[i].withdrow(amt);								
								System.out.println("current balance is:"+amt);
								flag=true;								
								break;
							}
						}
						if(flag==false)
							System.out.println("Account number is wrong");
						break;
						
				case 3:				
					System.out.println("enter account number");
					    acco=mp.nextInt();
						flag=false;
						for(int i=0;i<n;i++)
						{
							if(acco==A[i].getAccountNumber())
							{
								A[i].ShowInformation();
								flag= true;
								break;
							
							}
						}
						if(flag==false)
							System.out.println("Account number is wrong");
						break;
				case 4:
					System.exit(0);
					
			}
		}
	}

}