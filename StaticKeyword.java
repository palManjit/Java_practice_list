class Test{
	int studentid;
	String studentName;
	static String collegeName="JIS College of Engineering";
	
	Test(int studentid,String studentName){
		this.studentName=studentName;
		this.studentid=studentid;
		}
	
	
	void show(){
			System.out.println("Student Id:"+studentid);
			System.out.println("Student name:"+studentName);
			System.out.println("Student Id:"+collegeName);
		}
		
	}
class StaticMain{
	public static void main(String arg[]){
	Test ob1=new Test(101,"Ranjit");
	Test ob2=new Test(102,"Manjit");
	Test ob3=new Test(103,"Sanjit");
	ob1.show();
	ob2.show();
	ob3.show();
	}
}