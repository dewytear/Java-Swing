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
			
			System.out.println("ȸ���� : "+ num);
			System.out.println("������ : "+ subject);
			System.out.println("�������� : "+ title);
			System.out.println(str);
		}catch(Exception e){
			e.printStackTrace();
		}
	}//main

}//class
