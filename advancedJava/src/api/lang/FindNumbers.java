package api.lang;

public class FindNumbers {
	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();
		
		long number = 228754462;
		System.out.println( "입력 숫자 = " + number );		
		System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3�� ����
		System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2�� ����
	}
	
	/*  �̰��� countNumber �޼ҵ带 �ۼ��Ͻʽÿ�. */
	public int countNumber(long number , int find) {
		char[] charArr = (number+"").toCharArray();
		char charFind = (find+"").charAt(0);
		int count = 0;
		
		for(char c : charArr) {
			if(c == charFind) {
				count++;
			}
		}
		
		return count;
	}
	
}
