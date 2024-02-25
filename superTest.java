// super keyword can be used to refer the immediate parent class instance variable.
class A{
	int no=10;
	}
class B extends A{
	int no=20;
	void show(int no){
		System.out.println(super.no);
		}
	}
class superTest{
	public static void main(String ar[]){
		B ob=new B();
		ob.show(30);
	}
}