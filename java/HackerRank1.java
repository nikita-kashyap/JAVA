/* import java.util.Scanner;
 public class HackerRank1
{
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any 'integer' value- ");
		int x=obj.nextInt();
		System.out.println("Enter any 'double' value- ");
		double d=obj.nextDouble();
		System.out.println("Enter any 'String' value- ");
		String s=obj.nextLine();
		s=obj.nextLine();
		obj.close();
		System.out.println();
		System.out.println("sum of 'integer' is "+(x+x));
		System.out.println("sum of 'double' is "+(d+d));
		System.out.println("Hacker Rank "+s);
	}
}*/

/*import java.util.Scanner;
public class HackerRank1						//meal_cost,tipprcent,taxPrcent
{
		static void calculate(double meal_price,double initialTip, double initialTax)
		{
		
			double tip=100*initialTip/100;
			double tax=100*initialTax/100;
			double totalCost=meal_price+tip+tax;
			System.out.println("MRP-: "+ Math.round(totalCost));
		}
	public static void main(String[] args)
	{		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter price value:- ");
		double a=obj.nextDouble();
		System.out.println("enter tip percentage:- ");
		double b=obj.nextDouble();
		System.out.println("enter tax percentage:- ");
		double c=obj.nextDouble();
		calculate(a,b,c);
		obj.close();
	}
}*/

/*import java.util.Scanner;
public class HackerRank1{       					 //wierd or not
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.println("ENTER NUMBER UPTO 100:- ");
		int i=obj.nextInt();
		if(i%2==0 &&i<5)
			System.out.println("NOT WIERD");
		else if(i%2==0 && i>=6 && i<=20)
			System.out.println("WIERD");
		else if(i%2==0 && i>20)
			System.out.println("NOT WIERD");
		else
			System.out.println("WIERD");
	}
}*/ 
/*import java.util.Scanner;
import java.io.*;
public class HackerRank1{							//young/old
	private int age;
	public HackerRank1(int initialAge){
		if(initialAge<0){
			age=0;
		System.out.println("Age is not valid and age is set to 0");}
		else
			age=initialAge;
	}
		public void amIOld(){
			if(age<13)
				System.out.println("You are Young");
			else if(age>12 && age<18)
				System.out.println("You are a Teenager");
			else if(age>=18)
				System.out.println("You are Old");
		}
		public void yearPasses(){
			age=age+1;
		}
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your age- ");
		int age=obj.nextInt();
		HackerRank1 h=new HackerRank1(age);
		h.amIOld();
		for(int j=0;j<3;j++)
		{
			h.yearPasses();
		}
		h.amIOld();
		System.out.println();
	}
}*/
/*import java.util.Scanner;
public class HackerRank1					//print string with space values 
{   
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int i=obj.nextInt();
		double d=obj.nextDouble();
		String s=obj.nextLine();
		s=obj.nextLine();
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
	}
}*/
/*import java.util.Scanner;

public class HackerRank1						//output formatting
{
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();	
			System.out.format("%-15s%03d%n", s1, x);
			}			
			System.out.println("================================");
			}
}*/
/*import java.util.Scanner;
public class HackerRank1 {						//output formatting

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=String.format("%-15s",sc.next());
                int x=sc.nextInt();
                System.out.println(s1 + String.format("%03d",x));
                //Complete this line
            }
            System.out.println("================================");

    }
}*/
