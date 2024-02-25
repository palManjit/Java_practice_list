// super keyword can be used to invoke parent class method.
class A{
	void show(){
		System.out.println("i am A method");
		}
	}
class B extends A{
		void show(){
			super.show();
			System.out.println("i am B method");
		}
		void m1(){
			super.show();
		}
	}
class superTest{
	public static void main(String ar[]){
		B ob=new B();
		ob.m1();
	}
}