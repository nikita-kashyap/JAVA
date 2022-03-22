//It is a program of odd and even number.  
public class IfElse
{  
  public static void main(String[] args)
  {    
    int num=13;  
    //Check if the number is divisible by 2 or not  
    if(num%2==0)
	{  
        System.out.println("even number");  
    }
	else
	{  
        System.out.println("odd number");  
    }
   int year=2020;    
    if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){  
        System.out.println("It is a LEAP YEAR");  
    }  
    else{  
        System.out.println(" It is a COMMON YEAR");  
    } 
// USING TERNARY operator 
   int num1=13;      
    String output=(num1%2==0)?"even number":"odd number";    
    System.out.println(output);  	
}  
}  