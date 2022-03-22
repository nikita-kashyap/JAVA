import java.util.Scanner;
class CheekuCalculater{
	//Scanner obj= new Scanner(System.in);
	int operation,num1,num2;
	public int menu(){
		System.out.println("1: addition.");
		System.out.println("2: subtraction.");
		System.out.println("3: multiplication.");
		System.out.println("4: division.");
		System.out.println("0: Exit.");
		System.out.println("\nnote: please type a number of the operation to calculate:-");
		operation=obj.nextInt();
		return operation;
		}
	public void getNumbers(){
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter first number to perform operation: ");
		num1= obj.nextInt();
		System.out.println("Enter first number to perform operation: ");
		num2= obj.nextInt();
		}
	public int operation(){
			switch(menu()){
				case 1:
					System.out.println("Thank you for choosing addition: ");
					return (num1 + num2);
				case 2:
					System.out.println("Thank you for choosing subtraction: ");
					return (num1 - num2);
				case 3:
					System.out.println("Thank you for choosing multiplication: ");
					return (num1 * num2);
				case 4:
					System.out.println("Thank you for choosing division: ");
					try{
						return (num1 / num2);
					}catch(ArithmeticException e){
						System.out.println("exception: " + e.getMessage());
						}
				case 0:
					System.exit(0);
				default:
					System.out.println("Warning: please choose a valid number: try again.");
				}
			}	
	public static void main(String[] args){
		System.out.println("CALCULATOR:-");
		while(true){
			getNumbers();
			System.out.println("your result is " + operation());
		
		}
	}
}