package BaekProblem;

//���� ������ �Է¹޾� 90 ~ 100���� A, 
//80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D,
//������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.


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


