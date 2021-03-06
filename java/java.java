import java.util.*;
 
class Printer  {
 
    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
 
    public void printArray(T[] array)
    {
        for(T value:array)
        {
            System.out.println(value);
        }
 
    }
 
}
 
public class Generics {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i &lt; n; i++) {
            intArray[i] = scanner.nextInt();
        }
 
        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i &lt; n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer intPrinter = new Printer();
        Printer stringPrinter = new Printer();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length &gt; 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}