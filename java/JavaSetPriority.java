public class JavaSetPriority extends Thread
{  
    public void run()
    {  
        System.out.println("running..."+ currentThread().getPriority());  
    }  
    public static void main(String args[])
    {  
         
        JavaSetPriority t1=new JavaSetPriority();  
        JavaSetPriority t2=new JavaSetPriority();
        // set the priority
        t1.setPriority(8);
        t2.setPriority(1);
        
        System.out.println("Priority of thread t1 is: " + t1.getPriority()); 
        System.out.println("Priority of thread t2 is: " + t2.getPriority() ); 
        
        t1.start();
        t2.start();
    }
}