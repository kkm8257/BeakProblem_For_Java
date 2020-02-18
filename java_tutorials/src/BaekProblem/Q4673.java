package BaekProblem;

public class Q4673 {

	public static class cal{
		
		static void calCal() {
			
			
			for(int i =1;i<=10000;i++) {
				int temp=getDn(i);
				System.out.println(temp);
				
			}
			
			
			
		}
		
		static int getDn(int num) {
			
			int a,b,c,d;
			a=num/1000;
			b=(num%1000)/100;
			c=(num%100)/10;
			d=(num%10);
			
			
			return num+a+b+c+d;
			
		}
		
		
	}
	
	
	public static void main(String[] args) {

		cal.calCal();
		
	
	}

}
