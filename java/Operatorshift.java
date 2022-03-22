class Operatorshift
{  
  public static void main(String args[])
 {  
    //For positive number, >> and >>> works same  
    System.out.println(20>>2);//20/2^2=20/4=5 or 10100=(shifts 2 bits right)101=5  
    System.out.println(20>>>2); //same as above 
    //For negative number, >>> changes parity bit (MSB) to 0  
    System.out.println(-20>>2); // -20/2^2= -5 
    System.out.println(-20>>>2);// don't know
    System.out.println(20<<2); //20*2^2=20*4=80 or 10100=(shifts 2 bits left)101000=80 
  }
}  