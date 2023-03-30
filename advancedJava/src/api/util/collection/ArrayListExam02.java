package api.util.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

//배열을 ArrayList로 변환해서 리턴하는 메소드를 정의
//메소드명 : changeArrayList
//매개변수 : String[]
//리턴타입 : ArrayList<String>
public class ArrayListExam02 {

	public static void main(String[] args) {
		String[] strArr = {"java" , "servlet","jsp","spring"};
		//2.구현한 메소드 호출
		ArrayList<String> list = changeArrayList(strArr);
		//3.호출결과로 리턴받은 ArrayList를 출력. sysout
		for(String s : list) {
			System.out.println(s);
		}
	}
	//1. 메소드 스펙대로 작성.
	
	public static ArrayList<String> changeArrayList(String[] arr){
		ArrayList<String> list = new ArrayList<String>();
		
		for(String s : arr) {
			list.add(s);
		}
		
		return list;
	}
}
