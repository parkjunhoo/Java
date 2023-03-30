package exercise;

public class Prob8 {

	public static void main(String args[]) {

		Prob8 prob8 = new Prob8();

		System.out.println(prob8.leftPad("SDS", 6, '#'));
		System.out.println(prob8.leftPad("SDS", 5, '$'));
		System.out.println(prob8.leftPad("SDS", 2, '&'));

	}

	public String leftPad(String str, int size, char padChar) {

		/* 여기에 프로그램을 완성하십시오. */
		if(str.length() > size) {
			return str;
		}
		
		char[] originals = str.toCharArray();
		char[] outputs = new char[size];
		int diffSize = size - originals.length;
		
		for(int i =0; i<diffSize; i++) {
			outputs[i] = padChar;
		}
		
		System.arraycopy(originals, 0, outputs, diffSize, originals.length);
		
		return new String(outputs);
	}

}
