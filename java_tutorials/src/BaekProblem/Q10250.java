package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
public class Q10250 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int CaseNum=Integer.parseInt(br.readLine());
		
		for(int a=0;a<CaseNum;a++) {
			st=new StringTokenizer(br.readLine());

			int H=Integer.parseInt(st.nextToken());//높이
			int W=Integer.parseInt(st.nextToken());//너비
			int N=Integer.parseInt(st.nextToken());//순번
			
			int temp__H=N%H==0?H:N%H; //층수 앞자리
			int temp__W=N%H==0? N/H : (N/H)+1;//호실 뒷자리

			
			temp__H=temp__H*100;
			bw.write(Integer.toString(temp__H+temp__W)+"\n");

			
		}
		
		bw.flush();
		br.close();
		bw.close();
	

		
		
	}

}
