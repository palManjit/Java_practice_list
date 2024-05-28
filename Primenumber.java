import java.util.Scanner;
class Primenumber{
	public static void main(String args[])
	{
		Scanner pn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=pn.nextInt();
		 int flag=0;
		for( int i=2;i*i<=n;i++)
		{	
			if(n%i==0)
			{	
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}