package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q3009 {

	public static void main(String[] args) throws IOException{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x1,y1,x2,y2,x3,y3;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		x1=Integer.parseInt(st.nextToken());
		y1=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		x2=Integer.parseInt(st.nextToken());
		y2=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		x3=Integer.parseInt(st.nextToken());
		y3=Integer.parseInt(st.nextToken());
		
		int x4 = 0,y4=0;
		
		if(x1==x2) {
			x4=x3;
			
			
		}
		else if(x2==x3) {
			x4=x1;
			
		}
		
		else if(x1==x3) {
			x4=x2;
			
		}
		////////////////////////
		if(y1==y2) {
			y4=y3;
			
			
		}
		else if(y2==y3) {
			y4=y1;
			
		}
		
		else if(y1==y3) {
			y4=y2;
			
		}
		
		
		bw.write(Integer.toString(x4)+ " "+Integer.toString(y4));
		bw.flush();
		bw.close();
		br.close();
		
		
	}

}
