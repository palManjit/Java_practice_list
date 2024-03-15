import java.util.Scanner;
class MaximumNumber{
	static void maximum(int a,int b, int c){
		if(a>b){
			   if(a>c){
					System.out.println("\n %d is largest number"+a);
				}
				else{
					System.out.println("\n %d is largest numner"+c);
				}
				}
				else if(b>c){
					System.out.println("\n b is larges"+b);
				}
				else{
					System.out.println("\n c is largest"+c);
				}
	}

	public static void main(String args[]){
		Scanner ms=new Scanner(System.in);
			System.out.println("\n enter three numbers:");
			int a=ms.nextInt();
			int b=ms.nextInt();
			int c=ms.nextInt(); 
				maximum(a,b,c);
}
}