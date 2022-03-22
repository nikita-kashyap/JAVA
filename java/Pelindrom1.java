import java.util.Scanner;
public class Pelindrom1
{	private int userNum;
	public Pelindrom1()
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("please enter your number to check it is pelindrome or not: ");
		userNum = obj.nextInt();
	}
	private boolean checkPelindrom()
	{
		int x;
		int y=0;
		for(x=userNum;x!=0;x=x/10)
		{
			y=y*10+(x%10);
		}
		if (y == userNum)
			return true;
		else
			return false;
		
	}
	public void showPelindrom()
	{
		if(checkPelindrom())
		System.out.println(userNum+" is pelindrom number");
		else
			System.out.println("It is not a pelindrom number: please try another number.");
		
	}
	public static void main(String args[])
	{	
		Pelindrom1 Np1=new Pelindrom1();
		Np1.showPelindrom();
	}
	
}