package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Q2292 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	

		int room=Integer.parseInt(br.readLine());
		int count=1;//i번째 줄의 방들중 제일 큰 값
		int i =1; 
		
		while(true) {
			
			if(room<=count) {
				bw.write(Integer.toString(i));
				break;
			}
			else if(room>count) {
				count=count+6*i;
				i++;
			}
			
			
		}
		
		bw.flush();
	}

}
