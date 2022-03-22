class Class1
{                 //default constructor
 int id;
 String name;

 void display(){System.out.println(id+" "+name);}

 public static void main(String args[])
 {
  Class1 c1=new Class1();
  Class1 c2=new Class1();
  c2.display();
 }
}
