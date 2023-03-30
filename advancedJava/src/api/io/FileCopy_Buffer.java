package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy_Buffer {

	public static void main(String[] args) {
		// src/data/InputStreamTest.java를 읽어서 파일을 copy하는 프로그램을 작성하세요.
		// 출력파일명 : output.txt
		// 예외처리 모두 적용하세요.
		BufferedReader reader = null;
		FileWriter writer = null;

		try {
			reader = new BufferedReader(new FileReader("src/data/InputStreamTest.java"));
			writer = new FileWriter("src/data/output.txt");
			String line;
			String content = "";
			long start = System.nanoTime();
			while ((line = reader.readLine()) != null) {
				content += line+"\n";
			}
			writer.write(content);
			long end = System.nanoTime();
			System.out.println(end - start);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
