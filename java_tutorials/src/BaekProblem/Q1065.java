package BaekProblem;

import java.util.Scanner;

public class Q1065 {

	
	static class cal{
		
		static void get(int temp) {
			int count=0;
			int a, b, c;
			
			
			
			
			for(int num=1;num<=temp;num++) {
				a=num/100;
				b=(num%100)/10;
				c=(num%10);
				if(((c-b)==(b-a))&&(num>100)) {
					
					count+=1;
					
				}
				else if(num<100) {
					count+=1;
				}
			}
	
			System.out.println(count);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int Temp=sc.nextInt();
		
		cal.get(Temp);
		
		
	}

}
