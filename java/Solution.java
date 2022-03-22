/*import java.io.*;
import java.util.*;			//EXCEPTION 1
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
		try{
			int i;
			i=Integer.parseInt(S);
			System.out.println(i);
		}
		catch(Exception e){
			System.out.println("Bad String");
		}
    }
}*/
/*import java.util.*;							//Dictionaries and Maps
import java.io.*;
 
class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name,phone);
            
            
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(map.containsKey(s))
                {
                System.out.println(s+ "=" + map.get(s));
            }
            else
                {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}*/
/*import java.io.*;								//Stack&Queue
import java.util.*;
public class Solution {
    // Write your code here.
    Queue <Character> queue = new LinkedList<>();
    Stack <Character> stack = new Stack<>();
   
    public void pushCharacter(char ch){
        stack.push(ch);
    }
    public void enqueueCharacter(char ch){
        queue.add(ch);
    }
    public char popCharacter(){
        return stack.pop();
    }
    public char dequeueCharacter(){
        return queue.remove();
    }
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}*/
/*import java.io.*;
import java.util.*;											

interface AdvancedArithmetic{								//INTERFACE
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = n;
		for(int x=1;x<=n/2;x++)
		{
			if(n%x==0)
			{
				sum = sum + x;
			}
		}
		return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}*/
									
/*import java.io.*;						//BUBBLE SORT
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
		int temp;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
    }
}*/


/*
import java.util.*;							//GENERICS day 21
class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
/*	public void printArray(T[] array)
    {
        for(T value:array)
        {
            System.out.println(value);
        }
 
    }

}

public class Solution {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}*/