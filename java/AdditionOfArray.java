import java.util.Scanner;
class AdditionOfArray
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int[][] mat1=new int[3][3];
    int[][] mat2=new int[3][3];
    int sum=0;
    
	for(int i=0;i<3;i++)
    {
      for(int j=0; j<3;j++)
      {
        mat1[i][j]= sc.nextInt();
      }
    }
    System.out.print("************** \n");
    for(int i=0;i<3;i++)
    {
      for(int j=0; j<3;j++)
      {
        mat2[i][j]= sc.nextInt();
      }
    }
    System.out.print("************** \n");
    for(int i=0;i<3;i++)
    {
      for(int j=0; j<3;j++)
      {
        System.out.print(mat1[i][j]+mat2[i][j]+" ");
      }
      System.out.print("\n");
    }
    
  }
  
}