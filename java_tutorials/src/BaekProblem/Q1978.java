package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1978 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine());
		
		int temp=0;
		int count=0;
		
		for(int a = 0;a<N;a++) {
			
			
			temp=Integer.parseInt(st.nextToken());
			
			if(temp==1) {
				continue;
			}
			if(temp==2) {
				count++;
				continue;
			}
			
			for(int i=2;i<temp;i++) {
				if(temp%i==0) {
					break;
				}
				else if(temp-1==i) {
					count=count+1;
					
				}
				
				
			}
			
			
			
			
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}

	
}
