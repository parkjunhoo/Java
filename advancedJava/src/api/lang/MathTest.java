package api.lang;

public class MathTest {

	public static void main(String[] args) {
		System.out.println("Math.PI=>"+Math.PI);
		System.out.println("Math.abs=>"+Math.abs(-1)); // 절대값
		System.out.println("Math.ceil=>"+Math.ceil(10.3)); //올림
		System.out.println("Math.floor=>"+Math.floor(10.8)); //내림
		System.out.println("Math.round=>"+Math.round(10.4)); //반올림
		System.out.println("Math.max=>"+Math.max(100,200));//최대값
		System.out.println("Math.min=>"+Math.min(100,200));//최소값
		System.out.println("Math.random=>"+Math.random());//0~1사이의값
	}

}
