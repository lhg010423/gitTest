package test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;

public class IOService {


	


	public void output1() {

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {

			
		fos = new FileOutputStream("test1.txt");
		bos = new BufferedOutputStream(fos);
		StringBuilder sb = new StringBuilder();
		
		sb.append("안녕하세요!");
		
		
		
		int num = 0;
		
		byte[] bytes = new readAllBytes(sb);
		while(true) {
			
			num = (int)readLine(bytes);
			
			if(num == -1) break;
			
			bos.write(bytes);
			
				
		}
		


		} catch(IOException e) {
			e.printStackTrace();

		} finally {
			
			try {
				if(bos != null) bos.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}


	


	public void output2() {
		
		FileOutputStream fos = null;

		try {

		fos = new FileOutputStream("test.txt");

		String str = "안녕하세요!";

		for(int i=0 ; i<str.length() ; i++) {

		fos.write( str.charAt(i) );

		}

		} catch(IOException e) {

		e.printStackTrace();

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
		
}
