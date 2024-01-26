import java.util.Scanner;
class factorial{
	public static void main(String args[]){
		Scanner mp=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=mp.nextInt();
		fact(n);
		int f=fact(n);
		System.out.print("factorial is:"+f);
	}
	public static int fact(int n){
		int i=2,f=1;
		if(n<2){
			return 1;
		}
		while(i<=n){
			f=f*i;
			i++;
			}
			return f;
	}
}