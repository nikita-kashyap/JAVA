import java.util.Scanner;
class Tester
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age;
System.out.println("Enter your age:");
age=sc.nextInt();
if(age>=18)
System.out.println("You are eligible to cast your vote");
else
System.out.println("You are not eligible");
}
}