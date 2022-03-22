//ABSTRACT CLASSES
/*import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
class MyBook extends Book
{
	int price;
    
    // Write your constructor here
	MyBook(String title,String author,int price)
	{
		super(title,author);
		this.price=price;
	}
    
      
    // Method Name: display
	void display()
	{
		System.out.println("TITLE: "+title+"\n"+ "AUTHOR: "+author+"\n"+ "PRICE: "+price);
	}
      
}

public class HackerRank3 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}*/

/*import java.io.*;						//SCOPE Day_14
import java.math.*;
import java.util.*;
class Difference
{
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
	Difference(int[] a)
	{
		elements=a;
	}
	public void computeDifference()
	{
		int a=0;
		int maxDifference=0;
		for(int i = 0 ; i < elements.length ; i++)
		{
			for(int j = i+1 ; j < elements.length ; j++)
			{
				a=Math.abs(elements[i]-elements[j]);
			
				if(maxDifference<a){
					maxDifference=a;
				}
			}
		}
			maximumDifference=maxDifference;
	}
	

} // End of Difference class

public class HackerRank3 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
		{
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}*/
/*
import java.io.*;						//Cheeku's SCOPE
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
Difference(int[] arr){
    elements=arr;
}
	int findGreater(){
        int x=elements[0];
        for(int i=0;i<elements.length;i++){
            if(elements[i]>=x)
            x=elements[i];
        }return x;
    }
    int findSmaller(){
        int x=elements[0];
        for(int i=0;i<elements.length;i++){
            if(elements[i]<=x)
            x=elements[i];
        }return x;
    }
    void computeDifference(){
        int big,small;
        big=findGreater();
        small=findSmaller();
        maximumDifference=big-small;
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}*/

/*import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class HackerRank3 {							//LINKED LIST day15

    public static  Node insert(Node head,int data) {
       
		Node n = new Node(data);
        Node temp = head;
        
		if (head == null)
		{
            head = n;
            return head;
        }
        
		while (temp.next != null)
		{
            temp = temp.next;
        }
        temp.next = n;
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}*/
/* public static  Node insert(Node head,int data) {
        Node New= new Node(data);
        if (head != null)
            New.next=head;
        return New;
    }*/
	
/*import java.io.*;
import java.util.*;					//EXCEPTION 2
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank3{
	int calculatePower(int a,int b) throws Exception{
		if(a<0 || b<0)
		{
			throw new Exception("n and p should be non-negative");
		}
		else{
				
				return (int) Math.pow(a, b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
		
		while (x-- > 0) {
        
        int n = sc.nextInt();
		int p = sc.nextInt();
		HackerRank3 calculate = new HackerRank3();
            try {
                int result = calculate.calculatePower(n, p);
                System.out.println(result);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
	}
}*/
		
		
		
		
		