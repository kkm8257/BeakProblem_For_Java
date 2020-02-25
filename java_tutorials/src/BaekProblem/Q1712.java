package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1712 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		long fix=Integer.parseInt(st.nextToken());
		long change=Integer.parseInt(st.nextToken());
		long price=Integer.parseInt(st.nextToken());
		
		
		if((price-change)>0) {
			bw.write((fix/(price-change)+1)+"\n");
			
		}
		else {
			bw.write("-1\n");
		}
		
	bw.flush();
	
		
		
	}

}
