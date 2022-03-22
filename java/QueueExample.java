// Java orogram to demonstrate working of Queue 
// interface in Java 
import java.util.LinkedList; 
import java.util.Queue; 

public class QueueExample 
{ 
public static void main(String[] args) 
{ 
	Queue<Integer> q = new LinkedList<>(); 

	// Adds elements {0, 1, 2, 3, 4} to queue 
	for (int i=0; i<5; i++) 
	q.add(i); 

	// Display contents of the queue. 
	System.out.println("Elements of queue\t"+q); 

	// To remove the head of queue. 
	int removedele = q.remove(); 
	System.out.println("removed element\t" + removedele); 

	System.out.println(q); 

	// To view the head of queue 
	int head = q.peek(); 
	System.out.println("head of queue\t" + head);
    // checking poll methods:- 
    //This method removes and returns the head of the queue. 
    //It returns null if the queue is empty. 
	int p = q.poll();
    System.out.println("poll method\t"+ p);	
	System.out.println(q); 


	// Rest all methods of collection interface, 
	// Like size and contains can be used with this 
	// implementation. 
	int size = q.size(); 
	System.out.println("Size of queue\t" + size);
 

} 
} 
