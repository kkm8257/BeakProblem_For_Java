package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2581 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M=Integer.parseInt(br.readLine());
		int N=Integer.parseInt(br.readLine());
		
		int Min=0;
		int total=0;
		
		
		for(int i=M;i<=N;i++) {
			
			int temp=i;
			if(temp==2) {
				total=total+temp;
				Min=2;
				continue;
			}
			
			for(int j=2;j<temp;j++) {
				
				if(temp%j==0) {
					break;
				}
				
				else if(j==temp-1) {
					total=total+temp;
					if(Min==0) {
						Min=temp;
					}
					else if(Min>temp) {
						Min=temp;
					}
				}
				
			}
			
			
		}
		
		
		if(total==0) {
			bw.write(String.valueOf(-1));
		}
		else {
			bw.write(String.valueOf(total)+"\n");
			bw.write(String.valueOf(Min));
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	

}
