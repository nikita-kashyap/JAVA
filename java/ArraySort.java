/*import java.util.Scanner;

public class ArraySort  //Defining class name
{
  public static void main(String args[]) // main method
  {
    
    int n, i, j; //taking variables
    float temp;
    float arr[] = new float[50];
    Scanner scan = new Scanner(System.in);

  
    System.out.print("Enter number for the Array Elements : "); // taking input from user
    n = scan.nextInt();

   
    System.out.println("Enter " + n + " Numbers : ");  // taking number of elements
    for (i = 0; i < n; i++) 
    {
      arr[i] = scan.nextFloat();
    }

    
    System.out.print("Sorting Array in Descensding order : \n"); // array element in descending order
    for (i = 0; i < (n - 1); i++) {
      {
        if (arr[i] < arr[i+1]) 
        {
          temp = arr[i];
          arr[i] = arr[i+ 1];
          arr[i + 1] = temp;
        }
      
    }

    System.out.print("Array Sorted Successfully..!!\n"); // sorted array elements

    System.out.print("Sorted List in descending Order : \n"); // print in descending order
    for (i = 0; i < n; i++)
    {
      System.out.print(arr[i] + "  ");
    }
	}
          }
	    }
		*/
		
import java.util.Scanner;

public class Array //defining class name
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3]; // declare and initilize the 2d array
        for (int i = 0; i < 3; i++) 
	{
            System.out.println("Enter 1st array element for "+(i+1)+"row "); //taking input from user

            for (int j = 0; j < 3; j++) 
	{

           arr[i][j] = sc.nextInt(); //all
            }
        }
     
    
       for (int i = 0; i < 3; i++) //accessing the elements of the specified array
       {
           for (int j = 0; j < 3; j++) 
           {
                System.out.print(arr[i][j]+" ");
           }
           
           System.out.println();
       }

        System.out.println("column sum--->");
        for (int i = 0; i < 3; i++) 
        {
           int sum = 0;
            
            for (int j = 0; j < 3; j++) //accessing the elements of the specified array
            {
                 sum=sum+arr[j][i];
                
            }
               System.out.print(sum+" ");
                }
          System.out.println("");
         System.out.println("row sum--->"); //print the sum of row-wise array element
          {
             for (int i = 0; i < 3; i++) 
             {
                int sum = 0;
            
            for (int j = 0; j < 3; j++) {
                sum=sum+arr[i][j];
            
        }  System.out.print(sum+" ");
}
}
}}