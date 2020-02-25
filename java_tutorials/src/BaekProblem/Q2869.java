package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2869 {

	static long A,B,C;
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st=new StringTokenizer (br.readLine());
		
		A=Long.parseLong(st.nextToken());
		B=Long.parseLong(st.nextToken());
		C=Long.parseLong(st.nextToken());
		
	

		long result=(C-B)/(A-B);
		if((C-B)%(A-B)!=0) {
			result+=1;
			System.out.println(result);
		}
		else System.out.println(result);
		
	

		
	}

}
