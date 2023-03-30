package basic;

public class FirstExam
{
	public static void main(String[] args){

		int kor = 23;
		int eng = 55;
		int math = 1;
		
		int total = (kor+eng+math);
		float avg = total / 3f;

		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
	}
}