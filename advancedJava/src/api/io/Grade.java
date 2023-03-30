package api.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class Grade {

	public static void main(String args[]) throws Exception{ 
		
		Grade grade = new Grade();
		String filePath = "src/data/";
		String fileName = filePath+"score.txt";
		grade.printGrade(fileName);
		
	}
		
	public void printGrade(String fileName) throws Exception{
		/* 이곳에 프로그램을 완성하십시오. */ 
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		String line;
		
		int count = 0;
		int sum = 0;
		int avg = 0;
		
		while((line = reader.readLine()) != null) {
			count ++;
			String[] arr = new String[2];
			arr = line.split(",");
			sum += Integer.parseInt(arr[1]);
			System.out.printf("%s의 점수는 %s점 입니다.\n",arr[0],arr[1]);
		}
		avg = sum / count;
		System.out.println("모두의 총점은 "+sum+"점 입니다.");
		System.out.println("모두의 평균은 "+avg+"점 입니다.");
	} 
	
}