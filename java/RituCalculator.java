//UNTERMINATED LOOPimportimport java.util.Scanner;
public class RituCalculator
{
 public static void main(String args[])
 {
	 Scanner obj= new Scanner(System.in);
	 int x,y,Result;
	 System.out.println("Please Enter your first number");
	 x= obj.nextInt();
	 System.out.println("Please Enter your second number");
	 y= obj.nextInt(); 
	 System.out.println("Please enter number 1 to 6 for such performance");
	 System.out.println("1.Addition.");
	 System.out.println("2.Subtraction.");
	 System.out.println("3.Multiplication");
	 System.out.println("4.Division");
	 System.out.println("5.Module");
	 System.out.println("6.Exit");
	 Result= obj.nextInt();
	 aa:
	 while(true){
		 if (Result<=6 && Result>=0)
{
switch(Result){
  case 1:
    System.out.println(x+"+"+y+"="+ (x+y));
    break;
 case 2:
    System.out.println(x+"-"+y+"="+ (x-y));
    break;
 case 3:
    System.out.println(x+"*"+y+"="+ (x*y));
    break;
case 4:
    System.out.println(x+"/"+y+"="+ (x/y));
    break;
case 5:
    System.out.println(x+"%"+y+"="+ (x%y));
    break;
case 6:
    System.out.println("Thanks");
    break;
}}
else{System.out.println("Please enter number between 1 to 6 for such performance");
} }
}
}