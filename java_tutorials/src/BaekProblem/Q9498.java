package BaekProblem;

//시험 점수를 입력받아 90 ~ 100점은 A, 
//80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D,
//나머지 점수는 F를 출력하는 프로그램을 작성하시오.


import java.util.Scanner;

public class Q9498 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int temp=0;
	        
	        temp=sc.nextInt();
	        sc.close();
	        if ((temp>=90)&&(temp<=100)) {
	        	System.out.println('A');
	        	
	        }
	        else if ((temp>=80)&&(temp<=89)) {
	        	System.out.println('B');
	        	
	        }
	        else if ((temp>=70)&&(temp<=79)) {
	        	System.out.println('C');
	        	
	        }
	        else if ((temp>=60)&&(temp<=69)) {
	        	System.out.println('D');
	        	
	        }
	        else {
	        	System.out.println('F');
	        	
	        }
	        
		
	}

}


