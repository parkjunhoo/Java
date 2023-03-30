package api.lang;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("0123456789");
		StringBuilder sbuilder = new StringBuilder("0123456789");
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbuilder);
		
		//문자열 뒤에 추가하기
		sb.append("재밋다");
		sbuilder.append("재밌다.");
		
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbuilder);
		
		//문자열 중간에 삽입하기
		sb.insert(2,  "servlet");
		sbuilder.insert(5, "jsp");
		
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbuilder);
		
		//문자열 삭제
		sb.delete(0,1);
		sbuilder.delete(0,8);
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbuilder);
		
		//문자열 거꾸로
		sb.reverse();
		sbuilder.reverse();
		System.out.println("원본:"+sb);
		System.out.println("원본:"+sbuilder);
	}
	

}
