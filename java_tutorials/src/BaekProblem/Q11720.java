package BaekProblem;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
public class Q11720 {

	public static void main(String[] args)throws IOException {
		int result=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		

		String count=br.readLine();
		String Str_temp=br.readLine();

		
		
		
		
		if((Integer.parseInt(count)>0)&&(Integer.parseInt(count)<=100)) {
			
			String[] Array=Str_temp.split("");
			for(int i=0;i<Array.length;i++) {
				
				result=result+Integer.parseInt(Array[i]);
			}
			
		}
		else {
			System.out.println("¿À·ù");
		}

		System.out.println(result);
	}

}
