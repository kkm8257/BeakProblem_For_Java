package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q4344 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		int caseNum = Integer.parseInt(br.readLine());
		int total=0;
		double Avg=0;
		int count=0;
		for(int i=0;i<caseNum;i++) {
			
			
			st=new StringTokenizer(br.readLine());
			int StudentNum=Integer.parseInt(st.nextToken());
			int[] Array=new int[StudentNum];
			
			for(int j=0;j<StudentNum;j++) {
				Array[j]=Integer.parseInt(st.nextToken());
				total=total+Array[j];
			}
			
			Avg=(double)total/(double)StudentNum;

			for(int j=0;j<Array.length;j++) {
				if(Array[j]>Avg) {
					count+=1;
				}
			}
			System.out.printf("%.3f%%",((double)count/(double)StudentNum)*100);
			System.out.println();
			total=0;
			count=0;
			Avg=0;
			
		}
		
		
	}

}
