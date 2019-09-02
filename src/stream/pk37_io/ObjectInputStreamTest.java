package stream.pk37_io;

import java.io.*;

public class ObjectInputStreamTest {

	static int num;
	static String subject="";
	static String title="";
	static String str="";

	public static void main(String[] args) {
		try{
			FileInputStream f=new FileInputStream("FOS.dat");
			ObjectInputStream obj=new ObjectInputStream(f);
			num=(Integer)obj.readObject();
			subject=(String)obj.readObject();
			title=(String)obj.readObject();
			str=(String)obj.readObject();
			
			System.out.println("雀瞒绰 : "+ num);
			System.out.println("林力绰 : "+ subject);
			System.out.println("家林力绰 : "+ title);
			System.out.println(str);
		}catch(Exception e){
			e.printStackTrace();
		}
	}//main

}//class
