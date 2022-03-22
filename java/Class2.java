class Class2{
    int id;
    String name;
    int age;
    Class2(int i,String n){   //parameterized constructor
    id = i;
    name = n;
    }
    Class2(int i,String n,int a){
    id = i;
    name = n;
    age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}//age will be 0 for two parameterized constructor .	
 public static void main(String args[])
 {
  Class2 c1 = new Class2(111,"Karan");
  Class2 c2 = new Class2(222,"Aryan",25);
  c1.display();
  c2.display();
 }
}
