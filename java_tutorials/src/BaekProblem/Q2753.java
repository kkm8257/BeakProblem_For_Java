package BaekProblem;

//������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� �� �̴�.
//
//�������, 2012���� 4�� ����� ����������, 1900���� 4�� ���������, 100�� ����̱� ������ ������ �ƴϴ�.
//
//������, 2000���� 400�� ����̱� ������ �����̴�.

import java.util.Scanner;

public class Q2753 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int temp=0;
	        
	        
	        temp=sc.nextInt();
	        sc.close();
	        if((((temp%4)==0)&&((temp%100)!=0))||((temp%400)==0)) {
	        	
	        	System.out.println(1);
	        	
	        }
	        else {
	        	System.out.println(0);
	        }
	        
		
	}

}
