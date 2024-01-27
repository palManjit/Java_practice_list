import java.util.Scanner;
class gcd{
	public static void main(String args[]){
	Scanner mp=new Scanner(System.in);
	System.out.println("enter two number:");
	int x=mp.nextInt();
	int y=mp.nextInt();
	int gcdIs=calgcd(x,y);
	
	}
	public static int calgcd(int x,int y){
	if(x%y==0)
		return y;
	else 
		return calgcd(y,x%y);
	}
}