import java.util.Scanner;
class Student3{
    int roll;
    String name;
	String fname;
    int cls;
    
    Student3(int i,String n,String fn,int c){
    roll = i;
    name = n;
	fname= fn;
    cls = c;
    }
	Student3(){
    roll = 10;
    name = "juhi";
	fname= "keshri";
    cls = 7;}
	void getData()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter student's details...");
		System.out.println("Roll no:-");
		roll=obj.nextInt();
		System.out.println("NAME:-");
		name=obj.next();
		System.out.println("FATHER'S NAME:-");
		fname=obj.next();
		System.out.println("CLASS:-");
		cls=obj.nextInt();
	}
    void showData(){System.out.println("DETAILS OF STUDENT"+"\n"+"ROLL NO="+roll+"\n NAME="+name+"\n FATHER'S NAME= "+fname+"\n CLASS= "+cls);}	

	public static void main(String[] args)
 {
  Student3 s1 = new Student3(111,"Karan","Vinod_Kumar",5);
  Student3 s2 = new Student3();
  s1.showData();
  s2.showData();
  Student s3 ;
  s3=new Student();
  s3.getData();
  s3.showData();
 }
}
