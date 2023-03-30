package chap06.oop.constructor;

import java.io.FileInputStream;

public class ConstructorTest01 {

	public static void main(String[] args) throws Exception{
		byte[] data1 = { 65, 66, 67, 68, 69 };
		char[] data2 = { 'a', '^', 'c', 'ㅇ' };

		String str1 = new String("java");
		String str2 = new String(data1);
		String str3 = new String(data1, 0, 3);
		String str4 = new String(data2);
		String str5 = new String(data2, 1, 3);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		//FileInputStream클래스의 생성자 사용해보기
		FileInputStream fs = new FileInputStream("test.txt");
		String str6 = new String(fs.readAllBytes());
		System.out.println(str6);
		
		//fs.close();
	}
}
