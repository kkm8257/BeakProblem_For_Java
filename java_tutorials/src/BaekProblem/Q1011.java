package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1011 {

	public static void main(String[] args)throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int CaseNum=Integer.parseInt(br.readLine());
		
		for(int a =0;a<CaseNum;a++) {
			
			st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			int xCount=0;
			int yCount=0;

			int k=0;
			
			
			
			while(true) {
				if((x==0)&&(y==0)) {
					bw.write(String.valueOf(xCount+yCount)+"\n");
					break;
				}
				k+=1;
				x=x+k;
				xCount++;
				if(x>=y) {
					bw.write(String.valueOf(xCount+yCount)+"\n");
					break;
				}
				
				y=y-k;
				yCount++;
				if(x>=y) {
					bw.write(String.valueOf(xCount+yCount)+"\n");
					break;
					
				}
				
			}
			
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		
		
	}

}
