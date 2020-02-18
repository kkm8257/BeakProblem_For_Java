package BaekProblem;


import java.util.Scanner;
public class Q11720 {

	public static void main(String[] args) {
		
		int result=0;
		
		Scanner sc= new Scanner(System.in);
		int temp=sc.nextInt();
		String Str_temp=Integer.toString(temp);
		
		String[] Array=Str_temp.split("");
		for(int i =0;i<Array.length;i++) {
			result=result+Integer.parseInt(Array[i]);
			
		}
		System.out.println(result);
	}

}
