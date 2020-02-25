package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2775 {

	public static void main(String[] args)throws IOException {

		//¸Ç ¹Ø 0ÃþÀº È£¼ö°¡ °ð ¸í¼ö 1~14
		//kÃþ nÈ£ 1~14
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		
		int[][] Array=new int[15][16];
		
		//i´Â Ãþ
		//j´Â È£¼ö
		
		for (int i=0;i<=14;i++) {
		
			Array[i][1]=1;
			Array[0][i+1]=i+1;
		}
				

		
		
		
		
		int CaseNum=Integer.parseInt(br.readLine());
		for(int a =1;a<=CaseNum;a++) {
			
			int k=Integer.parseInt(br.readLine());
			int n=Integer.parseInt(br.readLine());
			
			
			for(int i=1;i<=k;i++) {
				
				for(int j=2;j<=n;j++) {
					Array[i][j]=Array[i][j-1]+Array[i-1][j];
				}
				
			}
			
			bw.write(Integer.toString(Array[k][n])+"\n");
			
			
		}
		
		bw.flush();

	}
	
	

}
