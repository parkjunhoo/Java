package api.util;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "java,mysql,html,css,js";
		StringTokenizer st = new StringTokenizer(str,",");
		
		while(st.hasMoreTokens()) {
			
			String token = st.nextToken();
			
			System.out.println(token);
		}
	}

}
