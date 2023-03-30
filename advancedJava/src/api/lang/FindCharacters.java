package api.lang;

public class FindCharacters {

	
	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();
		int count=fc.countChar("Boys, be ambitious", 'i');
		System.out.println(count);
		
		int count2=fc.countChar("aaaaa", 'a');
		System.out.println(count2);

	}
	public int countChar(String str, char c) {
		// Method�� �ϼ��ϼ���...	
		int count = 0;
		for(char ch : str.toCharArray()) {
			if(ch == c) {
				count++;
			}
		}
		
		return count;
	}
}
