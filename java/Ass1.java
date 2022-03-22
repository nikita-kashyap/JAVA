import java.util.Scanner;
class Calculate
{
int dis;
float price=0;
float wight=0;

private void wight_calculte()
{	if(wight<=2)
	{price=1.10f;}
	else if(wight>2 && wight <=6)
	{price=2.20f;}
	else if(wight>6 && wight <=10)
	{price=3.70f;}
	else if(wight>10 && wight <=20)
	{price=4.80f;}
}

private void distance_calculate()
{	if(dis%500==0)
	{
		dis=dis/500;
	}
	else
	{dis=(dis/500)+1;}		
}

Calculate(int dis1, int wight1)
{
	dis=dis1;
	wight=wight1;
	distance_calculate();
	wight_calculte();
	System.out.print("The total amount is "+dis*price);
}



};
class Ass1
{public static void main(String args[])
	{int dist,wight;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Distance:");
		dist=sc.nextInt();
		System.out.print("Enter the weight:");
		wight=sc.nextInt();
		
		if(dist<=3000 && dist>=10)
		{	if(wight<=20 && wight>0)
			{Calculate obj=new Calculate(dist,wight);}
			else
			{
				System.out.println("invalied weight try again");
			}
		}
		else
		{
			System.out.println("invalied dist try again");
		}
}}