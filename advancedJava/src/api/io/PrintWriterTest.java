package api.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) {
		// src/data/InputStreamTest.java를 읽어서 파일을 copy하는 프로그램을 작성하세요.
		// 출력파일명 : output.txt
		// 예외처리 모두 적용하세요.
		BufferedReader reader = null;
		PrintWriter writer = null;

		try {
			reader = new BufferedReader(new FileReader("src/data/InputStreamTest.java"));
			writer = new PrintWriter("src/data/output.txt");
			String line;
			String content = "";
			long start = System.nanoTime();
			while ((line = reader.readLine()) != null) {
				writer.println(line);
			}
			long end = System.nanoTime();
			System.out.println(end - start);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (reader != null)reader.close();
				if (writer != null)writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
