package api.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
//FileWriter
//FileWriter는 문자 단위로 출력
	public static void main(String[] args)throws IOException {
		FileWriter fw = new FileWriter("src/data/result.txt",true);
		fw.write(97);
		fw.close();
	}

}
