class OperatorTernary
{  
 public static void main(String args[])
 {  
  int a=2;  
  int b=5;
  int c=10;
  int d=5;  
  int min=(a<b)?a:b;//2 i.e contion is true then value will bs of left side
  System.out.println(min);
  int min1=(c<d)?50:100;  // condition galat h to ans last wala hoga
  System.out.println(min1);  
 }
}  