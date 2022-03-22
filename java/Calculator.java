import java.util.Scanner;
public class Calculator
{
	
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("ENTER 1st NUMBER");
		int a=obj.nextInt();
		System.out.println("ENTER 2nd NUMBER");
		int b=obj.nextInt();
		System.out.println("ENTER FOLLOWING NUMBER FOR PERFOM OPERATION");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRSCTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVIDION");
		int i=obj.nextInt();
		System.out.println();
		switch(i)
		{
			case 1:
			System.out.println(a+"+"+b+"="+(a+b));
			break;
			case 2:
			System.out.println(a+"-"+b+"="+(a-b));
			break;
			case 3:
			System.out.println( a+"*"+b+"="+(a*b));
			break;
			case 4:
			System.out.println(a+"/"+b+"="+(a/b));
			break;
			default:
			System.out.println("INVALID SELECTION..YOY CAN CHOOSE WITHIN 1-4 ONLY");
			break;
		}
		
	}
}
	