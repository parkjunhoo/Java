package api.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCalculator {

	public static void main(String[] args)throws Exception {
		addCalculateResult("src/data/data.txt");
	}
	public static void addCalculateResult(String inputFileName) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
		FileWriter writer = new FileWriter(inputFileName,true);
		String line;
		int sum = 0;
		int mul = 1;
		while((line = reader.readLine())!=null) {
			int n = Integer.parseInt(line);
			sum += n;
			mul *= n;
		}
		writer.write("\n"+sum);
		writer.write("\n"+mul);
		reader.close();
		writer.close();
		
	}
}