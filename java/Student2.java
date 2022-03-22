class Student1
{  
 int roll;  
 String name;  
 void insertRecord(int r, String n)
 {  
  roll=r;  
  name=n;  
 }  
 void display()
 {
  System.out.println(roll+" "+name);
 }  
}  
class Student2
{  
 public static void main(String args[])
 {  
  Student1 s1=new Student1();  
  Student1 s2=new Student1();  
  s1.insertRecord(1,"Sarita");  
  s2.insertRecord(2,"Nikita");  
  s1.display();  
  s2.display();  
 }  
}  