package algorithm.basic;

import java.util.Scanner;

public class test{
    public static void main(String[] args){
    	
        Scanner s = new Scanner(System.in);
        
        int count = s.nextInt();
        int start = count;
        
        while(count-- > 0){
            for(int i =0; i<count; i++){
                System.out.print(" ");
            }
            int a = start-count;
            
            for(int i = 0; i<a; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}