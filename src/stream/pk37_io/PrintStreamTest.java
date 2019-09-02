package stream.pk37_io;

import java.io.*;

public class PrintStreamTest {

	public static void main(String[] args) {
		
		try{
			PrintStream p = new PrintStream("dat2.txt");
			p.println("Kwak");
			p.println("YoungJin");
			p.println(791104);
			p.close();
		}catch(IOException e){
			
		}
	}//main

}//class
