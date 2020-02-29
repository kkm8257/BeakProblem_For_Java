package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1085 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		int h=Integer.parseInt(st.nextToken());
		
		int horizon_1 = w-x;
		int vertical_1=h-y;
		int horizon_2=x;
		int verticla_2=y;
		
		bw.write(Integer.toString(scan(horizon_1,vertical_1,horizon_2,verticla_2)));
	
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static int scan(int a,int b, int c, int d) {
		
		int temp1= a>=c? c : a ;
		int temp2= b>=d? d: b;
		
		int result = temp1>=temp2 ? temp2 : temp1; 
		if(result<0) {
			result=-result;
		}
		return result;
	}

}
