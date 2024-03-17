import java.util.Scanner;
class Rectangle{
	private float lenght;
	private float bteadth;
	
void inputData()
{
	Scanner mp=new Scanner(System.in);
	System.out.println("enter lenght:");
	lenght=mp.nextFloat();
	System.out.println("enter bredth");
	bteadth=mp.nextFloat();
	}
	float CalAre()
	{
		return lenght*bteadth;
		
	}
	float CalPerimeter()
	{
		return 2*(lenght+bteadth);
	}
	void OutPut()
	{
		System.out.println("the area of rectangle:"+CalAre());
		System.out.println("the perimeter of rectangle:"+CalPerimeter());
	}
}
class RectangleDemo{
	public static void main(String args[])
	{
		Rectangle R1=new Rectangle();
		R1.inputData();
		R1.OutPut();
	}
	}