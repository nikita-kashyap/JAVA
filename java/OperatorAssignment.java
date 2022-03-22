class OperatorAssignment
{  
 public static void main(String[] args)
 {  
  int a=10;
  int b=10;  
  a+=3;//10+3  
  System.out.println(a);  
  a-=4;//13-4  
  System.out.println(a);  
  a*=2;//9*2  
  System.out.println(a);  
  a/=2;//18/2  
  System.out.println(a); 
  
  // a+=b;//a=a+b internally so fine  
  a=a+b;//Compile time error because 10+10=20 now int  
  System.out.println(a);
  
/*
  short c=10;  
  short d=10;  
  //c+=d;//c=c+d internally so fine  
  c=c+d;//Compile time error because 10+10=20 now int  
  System.out.println(c);  
  output produce: comple time error.
*/  
 }
}  