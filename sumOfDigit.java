import java.util.Scanner;
class sumOfDigit{
	public static void main(String args[]){
		Scanner mp=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=mp.nextInt();
		int sum=sumD(n);
		System.out.print("Sum is:"+sum);
		}
	
	public static int sumD(int n){
		int sum=0;
		while(n>0){
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}
	}
		
			
		
		