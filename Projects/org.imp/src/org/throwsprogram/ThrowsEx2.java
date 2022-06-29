package org.throwsprogram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsEx2 {
	public static void main(String [] args) throws IOException  {
		ThrowsEx1 obj=new ThrowsEx1();
		obj.test();
	}
	
	
	public void test(){
		
		try {
			File f=new File("\"E:\\Java setup\\Projects\\test.txt\"");
			FileWriter FwObj=new FileWriter(f);
			FwObj.write("HI pooja");
			FwObj.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("continue");
	}

}
