package BaekProblem;

//����̴� ���� ��ħ �˶��� ��� �Ͼ��. �˶��� ��� �ٷ� �Ͼ�� �����̰�����, �׻� ���ݸ� �� �ڷ��� ���� ������ ���� �б��� �����ϰ� �ִ�.
//
//����̴� ��� ����� �����غ�������, ���ݸ� �� �ڷ��� ������ �� � �͵� ���� ���� ������.
//
//�̷� ����̸� �ҽ��ϰ� ����, â���̴� �ڽ��� ����ϴ� ����� ��õ�� �־���.
//
//�ٷ� "45�� ���� �˶� ���߱�"�̴�.
//
//�� ����� �ܼ��ϴ�. ���� �������ִ� �˶��� 45�� �ռ��� �ð����� �ٲٴ� ���̴�. ������ �˶� �Ҹ��� ������, �˶��� ���� ���� �� �� ���̱� �����̴�. �� ����� ����ϸ�, ���� ��ħ �� ��ٴ� ����� ���� �� �ְ�, �б��� �������� �ʰ� �ȴ�.
//
//���� ����̰� ����� �˶� �ð��� �־����� ��, â������ ����� ����Ѵٸ�, �̸� ������ ���ľ� �ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) �׸��� �̰��� ���� ����̰� ������� �˶� �ð� H�� M���� �ǹ��Ѵ�.
//
//�Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.

import java.util.*;

class calcul{

	public void cal(int hour,int min) {
		
		min=min-45;
		
		if(hour==0) {
			if(min<0) {
				min=60+min;
				hour=23;
				System.out.println(hour);
				System.out.println(min);
				
			}
			else {
				System.out.println(hour);
				System.out.println(min);
				
			}
			
		}
		
		else {
			if(min<0) {
				min=60+min;
				hour=hour-1;
				System.out.println(hour);
				System.out.println(min);
				
			}
			else {
				System.out.println(hour);
				System.out.println(min);
				
			}
			
	
			
		}
		
		
	}
}


public class Q2884 {

	
	
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int hours,minutes;
	        
	        hours=sc.nextInt();
	        minutes=sc.nextInt();
	        
	        sc.close();
	        
	        calcul mycal=new calcul();
	        
	        mycal.cal(hours, minutes);
	        
	        
	        
		
	}
	


}
