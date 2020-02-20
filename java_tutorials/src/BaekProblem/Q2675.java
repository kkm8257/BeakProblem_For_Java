package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2675 {

	public static void main(String[] args)throws IOException {

		BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int Case=Integer.parseInt(br.readLine());
		
		for(int i=0;i<Case;i++) {
			
			st=new StringTokenizer(br.readLine());
			int count=Integer.parseInt(st.nextToken());
			String word=st.nextToken();
			
			String[] Array=word.split("");
			
			for(int j=0;j<Array.length;j++) {
				for(int k=0;k<count;k++) {
					bw.write(Array[j]);
					
				}
			}
			bw.write("\n");
			
			
		}
		
		bw.flush();
		
	}

}
