package org.throwsprogram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsEx1 {
	public static void main(String [] args) {
		ThrowsEx1 obj=new ThrowsEx1();
		try {
			obj.test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void test1()  {
		
	}
	
	public void test() throws IOException  {
		File f=new File("Test.txt");
		FileWriter FwObj=new FileWriter(f);
	}
}
