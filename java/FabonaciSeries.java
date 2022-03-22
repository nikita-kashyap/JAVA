import java.util.Scanner;
class FabonaciSeries
{
  public static void main(String args[])
  {
    int first=0;
    int second=1;
    int fina;
   System.out.println(first);
   // System.out.println(second);
    for(int i=0;i<=20;i++)
    {
      fina=first+second;
      System.out.print(second+"  \n"  );
      first=second;
      second=fina;
    }
    }
  
  
}