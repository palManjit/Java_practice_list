import java.util.Scanner;
class multiplicationTable{
	public static void main(String arg[]){
		Scanner mp=new Scanner(System.in);
		System.out.println("enter a number");
		int n=mp.nextInt();
		table(n);
	}
	
	public static void table(int n){
	int i=1;
	while(i<=10)
	{
		System.out.println(n +"X"+i+"="+(n*i));
		i++;
	}
   }
}
		
