package api.io;

import java.io.FileInputStream;

public class FileInputStreamTest3 {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("src/data/test.txt");
		byte[] arr = new byte[2];
		while(true) {
			int data = fis.read(arr);
			if(data == -1) break;
			for(int i =0; i<data; i++) {
				System.out.print((char)arr[i]);
			}
		}
		fis.close();
	}

}
