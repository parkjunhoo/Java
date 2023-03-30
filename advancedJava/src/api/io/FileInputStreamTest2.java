package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args){
		FileInputStream fis = null;
		try {
			//파일경로 디폴트 : 프로젝트 폴더
			fis = new FileInputStream("src\\data\\test.txt");		
			while(true) {
				int i = fis.read();
				if(i == -1) break;
				System.out.print((char)i);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽는 중에 오류 발생...");
		}finally {
			if(fis!=null)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
