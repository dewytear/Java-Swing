package network.pk38_net;

import java.net.*;
import java.io.*;

public class URLTest {

	public static void main(String[] args) {
		
		String row="";
		String str="http://en.wikipedia.org/wiki/Java_(programming_language)";
		try{
			URL url = new URL(str);
			BufferedReader b = new BufferedReader(new InputStreamReader(url.openStream()));
			row = b.readLine();
			
            while(row !=null){
            	System.out.println(row);
            	row = b.readLine();
			}//while
			b.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}//main

}//class