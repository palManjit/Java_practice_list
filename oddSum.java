import java.util.Scanner;
class oddSum{
	public static void main(String ar[]){
		Scanner mp=new Scanner(System.in);
		System.out.print("enter a number: ");
		int n=mp.nextInt();
		multiplication(n);
		int sum=multiplication(n);
		System.out.println(sum);
		
	}
	public static int multiplication(int n){
		int i=1;
		int sum=0;
		while(i<=n){
			sum+=i;
			i+=2;
			
		}
		return sum;
	
	}
}