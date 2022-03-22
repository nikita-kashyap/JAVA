import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1
 { 
  public static void main(String[] args) 
  { 
    ArrayList<String> friend = new ArrayList<String>();
    friend.add("nikita");
    friend.add("nikku");
    friend.add("rima");
    friend.add("kusum");
    System.out.println(friend);
	friend.set(2,"julie");
	System.out.println(friend);
    friend.add(2,"julie");
	System.out.println(friend.get(3));
	friend.remove(2);
	System.out.println(friend);
	friend.add("rima");
	System.out.println(friend);
	//friend.clear();
	System.out.println(friend.size());
	Collections.sort(friend);
	for(int i=0; i < friend.size(); i++)
	{
		System.out.println(friend.get(i));
	}
	/* for (String j : friend)//for each loop
		{
         System.out.println(j);
        }*/
  } 
}