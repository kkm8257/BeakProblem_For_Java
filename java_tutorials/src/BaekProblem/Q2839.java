package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2839 {

	public static void main(String[] args)throws IOException {

		
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sugar=Integer.parseInt(br.readLine());
		int count=0;
		
		
		while(true) {
			if(sugar%5==0) {
				
				bw.write(Integer.toString(sugar/5+count));
				break;
			}
			else if(sugar<0)  {
				
				bw.write(-1+"\n");
				break;
				
			}
			
			sugar=sugar-3;
			count=count+1;
			
		}
		
		
		bw.flush();
		
	}

}
