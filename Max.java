import java.util.Scanner;
class Max{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int num1=sc.nextInt();
		if(num1%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		}
	}