package _ioStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex10_09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("/Users/daramg/Desktop/tstudy/Java/data.txt");
        int ch;
 
        while ((ch = fis.read()) != -1)
            System.out.print((char) ch);
 
        fis.close();

	}

}
