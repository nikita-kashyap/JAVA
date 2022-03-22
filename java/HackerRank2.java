/*import java.util.*;
public class HackerRank2 {						//divide string in odd & even possition
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
		obj.nextLine();

        for (int i = 0; i < n; i++) 
        {
            String string = obj.nextLine();
            char[] charArray = string.toCharArray();

            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 == 0) 
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 != 0) 
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println(" ");
        }

        obj.close();
    }
}*/

/*import java.util.*;
public class HackerRank2{						//compilation prblm reverse array
	public static void main (String[] args){
		int[] a = new int[array.length];
	    static int[] reverseArray(int[] array)
		{
			int[] a = new int[array.length];
			int end = array.length - 1;
			for (int i = end; i >= 0; i--) 
			{
				a[i] = array[end - i];
			}
			return a;
	}
	}
}*/
/*import java.util.*;
 class Main {									//REVERSE OF STRING
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("program for REVERSE the STRING");
		int n=sc.nextInt();
		sc.nextLine();
		String rev="";
		for(int x=0;x<n;x++)
		{
		String s1=sc.nextLine();
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		}
		System.out.println(rev);
	}
}*/

/*import java.util.*;
 
public class HackerRank2 {					//CONSICUTIVE wala
 
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int count=0,min=0;
        while(n>0)
            {
            
            if(n%2==1)
                {
                
				count++; 
                  if(count>=min)
                   {
                     min=count;
                   }
                }
            else
                {
                 count=0;
                 }
            
        n=n/2;   
        }
        System.out.println(min);
    }
} */
/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRank2 {						//cheekus consicutive
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int a=0;
        int b=0;
        for(n=n+0; n>=0; n=n/2){
            if(n%2==1){
                a++;
            }
			else{
                if(a>b){
                    b=a;
                    a=0;
                }else{a=0;}
            }
            if(n==0){break;}
        }
        System.out.println(b);
        scanner.close();
    }
}*/
		   
/*import java.util.*;

public class HackerRank2								//2D ARRAY OF HOURGLASS
{
	private static final Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int arr[][]=new int[6][6];
		int hourGlassSum[] = new int[16];
        int pos = 0;
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
	  //Finding all possible hourGlass and calculate the sum of each hourGlass
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        hourGlassSum[pos] = calculateHourGlassSum(arr, i, i + 2, j, j + 2);
                        pos++;
                    }
                }
                System.out.println(findMax(hourGlassSum));

            }
            /*
              para arr 
              para pos1 - Row startPoint
              para pos2 - Row endPoint
              para pos3 - column startPoint
              para pos4 - column endPoint
             */
   /*         public static int calculateHourGlassSum(int arr[][], int pos1, int pos2, int pos3, int pos4) {

                int sum = 0;
                int Row0 = pos1 + 1;
                int Col1 = pos3;
                int Col2 = pos4;
                for (int i = pos1; i <= pos2; i++) {
                    for (int j = pos3; j <= pos4; j++) {
                        sum = sum + arr[i][j];
                    }
                }
                sum = sum - (arr[Row0][Col1] + arr[Row0][Col2]);
                return sum;
            }

			public static int findMax(int arr[]) {
                int max = arr[0];
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= max)
                        max = arr[i];
                }
                return max;
            }
}*/

import java.util.*;
 class Person
 {													//INHERITANCE
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int id)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = id;
	}
	
	// Print person data
	public void printPerson()
	{
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person
{
	private int[] testScores;
	
	  public Student(String firstName, String lastName, int id, int[] testScores)
	    {
			// TODO Auto-generated constructor stub
		  super(firstName, lastName, id);
	          this.testScores=testScores;
	         
		}
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
     char calculate()
         {             
            int i,sum=0,avg;
            char grade;
			
			for(i=0; i<testScores.length; i++)
             sum+=testScores[i];
			avg=sum/testScores.length;
 
			if(avg<=100 && avg>=90)
				grade='O';
			else if(avg==80)
				grade='E';
			else if(avg==70)
				grade='A';
			else if(avg==55)
				grade='P';
			else if(avg==40)
				grade='D';
			else
				grade='T';
 
			return grade;
		}
}
class HackerRank2 
{
	public static void main(String[] args) 
	{
		System.out.println("PROGRAMM FOR INHERITANCE");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter FIRST NAME:- ");
		String firstName = scan.next();
		System.out.println("enter LAST NAME:- ");
		String lastName = scan.next();
		System.out.println("enter ID:- ");
		int id = scan.nextInt();
		System.out.println("NO. OF SCORES:- ");
		int numScores = scan.nextInt();
		System.out.println("score1 score2 ...scoreN");
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}

			
		   