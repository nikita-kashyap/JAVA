import java.util.Scanner;
class Ass3
{
	public static void main(String args[])
	{
		static String x="Lovely Professional University";
		System.out.println(x);
		
		//finds the total no. of characters
		System.out.println("Total Length iS :"+x.length());
		
		//finds the position of string University
		System.out.println("finds the position of string University: "+x.indexOf("University"));
		
		//extracts the string Lovely
		System.out.println("extracts the string Lovely");
		System.out.println(x.substring(0,6));
		System.out.println(x);
		//replaces Lovely with lovely (first letter 'l' in small case)
		System.out.println(x.replace("Lovely","lovely"));
		System.out.println(x);
		
		//changes all characters in the string in Upper case.
		System.out.println(x.toUpperCase());
		
		
	}
}