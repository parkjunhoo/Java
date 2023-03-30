package exercise;


public class Prob7 {
	
	public static void main(String args[]) {
		
		int n = 15; 
		int sum = 0;
		
		 
		/*  여기에 프로그램을 완성하십시오. */
		
		//단일 loop
//		int hang = 1;
//		
//		for(int x=0; x<n; x++) {
//			hang += x;
//			sum += hang;
//			//System.out.println(hang);
//		}
		
		//이중 loop
		int acc = 0;
		for(int x=1; x<=n; x++) {
			for(int y=2; y<x; y++) {
				acc++;
			}
			//System.out.println(x+acc);
			sum += x+acc;
		}
		
		 		 
		System.out.println( n + "번째까지의 합 : " + sum);
	}

}

