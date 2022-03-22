class OperatorUnary2
{  
  public static void main(String args[])
 {  
  int a=10;  
  int b=10; 
  boolean c=false;
  boolean d=true; 
  int e=-10;
  int f=10;
  System.out.println(a++ + ++a);//10+12=22  
  System.out.println(b++ + b++);//10+11=21
  
  System.out.println(!c);//true (opposite of boolean value)
  System.out.println(!d);//false 
  System.out.println(~e);// 9  (positive of total minus, positive starts from 0)
  System.out.println(~f);//-11 (minus of total positive value which starts from 0)   
  }
}  