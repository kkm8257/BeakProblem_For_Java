package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1152 {

	public static void main(String[] args) throws IOException {


		BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		String Line=br.readLine();
		
		StringTokenizer st=new StringTokenizer(Line);
		
		int count=0;
		
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
			count+=1;
			
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
	}

}
