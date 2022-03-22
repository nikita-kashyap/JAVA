/** 			@FILE HANDLING@				*/
import java.io.File;
import java.io.*;
public class FileHandlingEx{
	public static void main(String[] args) throws IOException{
		File f=new File("./FileHandlingEx.txt");
		/** @methods of File class*/
		f.createNewFile();
		System.out.println("CAN FILE READ:-	"+f.canWrite());
	    System.out.println("IS FILE EXIST:-	"+f.exists());
		System.out.println("FILE NAME:-	"+f.getName());
		System.out.println("LENGTH OF FILE:-"+f.length());
		//f.delete();
		
		/** @FileOutputStream class*/
		FileOutputStr eam fout=new FileOutputStream("./FileHandlingEx.txt",true);
		String s="\nHave a good day!";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
			fout.write(ch[i]);
		fout.close();
		
		/** @FileInputStream class*/
		FileInputStream fin=new FileInputStream("./FileHandlingEx.txt");
		int i;
		do{
		    i=fin.read();
			if(i!=-1)
				System.out.print((char)i);//typecasting of int i into char
		}while(i!=-1);
		fin.close();
		
		/** @BufferedWriter class*/
		FileWriter fw=new FileWriter("./FileHandlingEx.txt");//FileWriter is the sub cls of Writer class.
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("nikitakri004@gmail.com");
		bw.close();
		
		/** @BufferedReader class*/
		int c;
		BufferedReader br=new BufferedReader(new FileReader("./FileHandlingEx.txt"));//FileReader is the sub cls of Reader class.
		while((c=br.read())!=-1)//-1 denotes the end_point of the file.
		{
			System.out.print((char)c);//typecasting
		}
		/** @more methods of BufferedReader class*/
		String s1;
		while((s1=br.readLine())!=null)//readLine reads a line of text
			System.out.print(s1);
		char[] a=new char[20];
		br.read(a,2,4);			//reads characters into a portion of an array.
		System.out.print(a);
		br.close();
	}
}