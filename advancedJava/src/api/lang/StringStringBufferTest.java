package api.lang;

public class StringStringBufferTest {
	public static void stringCheck(int count) {
		long start = System.nanoTime();
		String str = new String("java");
		for(int i =1 ; i<=count; i++) {
			str += "java";
		}
		long end = System.nanoTime();
		long time = end -start;
		
		System.out.println("str+=java");
		System.out.println("실행시간:"+time);
		System.out.println(str);
	}
	public static void stringBufferCheck(int count) {
		long start = System.nanoTime();
		StringBuffer sb = new StringBuffer("java");
		for(int i =1 ; i<=count; i++) {
			sb.append("java");
		}
		long end = System.nanoTime();
		long time = end -start;
		
		System.out.println("sb.append(java)");
		System.out.println("실행시간:"+time);
		System.out.println(sb);
	}
	public static void main(String[] args) {
		int count = 10000;
		System.out.println("실행횟수:"+count);
		stringCheck(count);
		System.out.println("===================");
		stringBufferCheck(count);
	}

}
