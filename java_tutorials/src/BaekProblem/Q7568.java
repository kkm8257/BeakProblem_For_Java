package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q7568 {

	static int testCase;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		testCase = Integer.parseInt(br.readLine());
		int[] x = new int[testCase];
		int[] y = new int[testCase];
		int[] ans=new int[testCase];

		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans.length;j++) {
				if(i==j)continue;
				
				if((x[i]<x[j])&&(y[i]<y[j])) {
					ans[i]++;
				}
				
				
			}
		}
		
		for(int rank : ans) {
			System.out.print((rank)+1 +" ");
		}
		
	}


}
