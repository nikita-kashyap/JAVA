//Java Program to illustrate the use of static variable which  
//is shared with all objects.  
class StaticCounter
{  
 static int count=0;//will get memory only once and retain its value  
  
 StaticCounter()
 {  
  count++;//incrementing the value of static variable  
  System.out.println(count);  
 }  
  
  public static void main(String args[])
  {  
   //creating objects  
     StaticCounter c1=new  StaticCounter();  
     StaticCounter c2=new  StaticCounter();  
     StaticCounter c3=new  StaticCounter();  
  }  
}  
