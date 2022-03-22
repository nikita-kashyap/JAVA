class WithoutCopyConstructor{  
    int id;  
    String name;  
    WithoutCopyConstructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    WithoutCopyConstructor(){}  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    WithoutCopyConstructor s1 = new WithoutCopyConstructor(111,"Karan");  
    WithoutCopyConstructor s2 = new WithoutCopyConstructor();  
    s2.id=s1.id;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();  
   }  
}  