import java.util.Scanner;
import javax.swing.plaf.synth.SynthStyle;

public class Employee //Defining class name 
{

            public static void Netsalary() //defining method for net salary
{
                int[] id=new int[5];
                String[] Employeename=new String[5];
                float[] Basicsalary=new float[5];
                float[] Da=new float[5];
                float[] IncomeTax=new float[5];
                float[]Netsalary=new float[5];
               
                Scanner sc=new Scanner(System.in);
                for(int a=0; a<5; a++){
                    System.out.println("Please Enter "+(a+1)+"st Employee Detail" );
                    System.out.println();
                    System.out.println("Please Enter you Name for Netsalary");
                    sc.next();
                    Employeename[a]=sc.nextLine();
                   
                System.out.println("Please Enter you Basic salary for Netsalary");
                Basicsalary[a]=sc.nextFloat();
      
                Da[a]= (52*Basicsalary[a])/100; //for one year dearness
                Netsal[a]= (Basicsalary[a]+Da[a])*12; //total salary
                IncomeTax[a]=(30*Netsal[a])/100; // salary after pay tax
                }

                for(int b=0; b<5; b++){
                    System.out.println("The "+(b+1)+"sc Employee Detail" ); // Print the detail of employee
                System.out.println();
                    System.out.println("Employee Name :"+ Employeename[b]);
                    System.out.println("Your basic salary amount :"+ Basicsalary[b]);
                    System.out.println("Dearness amount :"+ Da[b]);
                    System.out.println("Your Net salary :"+ Netsal[b]);
                    System.out.println("Tax you have to pay :"+ incomeTax[b]);
                }
       
              

                
            }

      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter 1 to calculate the Netsalary");
          System.out.println("Enter 2 to exit");
          int choice= sc.nextInt();
          switch(choice)
          {
              case 1:
                        Netsalary();
                        break;
              case 2 :
                        return;
                    
                       default :
                              System.out.println("You Entered Invalid choice");
                              break;
                     
                       
          }

      }