package basic;

public class PrimitiveTypeCastingTest {

	public static void main(String[] args) {
		//1. 자동형변환 - JVM내부에서 자동으로 변환
		byte b = 100;
		short s = b;
		int i = s;
		long l = i;
		System.out.println("값:"+l);
		float f = l;
		double d = f;
		System.out.println("값:"+d);
		
		char c ='A';
		int o = c;
		System.out.println("char값"+o);
		
		//2. 명시적 형변환
		int intval = 10;
		byte byteval = (byte)intval;
		
		int data3 = 100;
		char chardata = (char)data3;
		System.out.println(chardata);
		
		System.out.println((double)30/100+"%");
	}

}
