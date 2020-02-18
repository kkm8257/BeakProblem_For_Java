package BaekProblem;

import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] Array = new int[10];
		int count = 0;
		int temp=0;
		for (int i = 0; i < Array.length; i++) {
			Array[i] = (sc.nextInt()) % 42;
			
		}
		for (int i=0;i<Array.length;i++) {
			temp=Array[i];
			for(int j=i;j<Array.length;j++) {
				if(temp!=Array[j]) {
					System.out.println(j);
					count+=1;
					break;
				}
				
				
			}
		}
		System.out.println(count);

	}
}
