package api.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class Prob2 {
	
	public static void main(String[] args){
		Prob2 p2 = new Prob2();
		try {
			p2.printScore("src/data/data2.txt");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void printScore(String fileName) throws Exception{
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line;
		System.out.print(reader.readLine().replaceAll("/","\t"));
		System.out.println("\t총점");
		while((line = reader.readLine()) != null) {
			String[] arr = line.split("/");
			int sum = 0;
			for(int i = 1 ; i<arr.length; i++) {
				sum += Integer.parseInt(arr[i]);
			}
			System.out.printf("%s\t%s\t%s\t%s\t%d\n",arr[0],arr[1],arr[2],arr[3],sum);
			
		}
	}
	

}
