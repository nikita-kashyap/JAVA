import java.util.Scanner;
class Year
{
public static void main(String args[])
 {
Scanner obj=new Scanner(System.in);
System.out.println("Enter a year:-");
 int i=obj.nextInt();
  if(i%100==0&&i%400==0||i%100!=0&&i%4==0)
   {System.out.println(i +"is a leap year.");}
  else
   {System.out.println(i +"is not a leap year.");}
 }  
}