package file.pk36;

import java.io.File;
import javax.swing.*;

public class FileTest {

	public static void main(String[] args) {
			
		String  str="";
		String name=JOptionPane.showInputDialog("���ϸ��� �Է��ϼ���~");
		File f=new File(name);
		
		if(f.exists()){			
			System.out.println("�Է��Ͻ� �̸���  "+f.getName()+"�Դϴ�");
			
			if(f.isDirectory())
				System.out.println("���丮���� �Է��ϼ̽��ϴ�!");
			else
				System.out.println("���ϸ��� �Է��ϼ̽��ϴ�!");
			
			System.out.println("���� ��δ� "+f.getAbsolutePath()+"�Դϴ�");
			System.out.println("���� ũ��� "+f.length()+"����Ʈ �Դϴ�");			
		}else
			System.out.println("������ �������� �ʽ��ϴ�");
			
	}//main

}//class
