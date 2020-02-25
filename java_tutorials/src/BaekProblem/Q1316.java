package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1316 {

	public static void main(String[] args)throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		
		
		int num=Integer.parseInt(br.readLine());
		int count=num;
		
		
		for (int i=0;i<num;i++) {
			
			String temp=br.readLine();
			boolean[] check=new boolean[26];
			
			
			
			for(int a=1;a<temp.length();a++) {
				
				if(temp.charAt(a-1)!=temp.charAt(a)) {
					
					if(check[temp.charAt(a)-97]==true) {
						count--;
						break;
					}
					
						check[temp.charAt(a-1)-97]=true;
					
					
					
				}
				
			
				
			}
			
			
			
		}
		System.out.println(count);
		
		
	}

}
