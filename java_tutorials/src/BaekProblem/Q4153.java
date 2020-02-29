package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q4153 {

	public static void main(String[] args)throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		
		
		while(true) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			if((a==0)&&(b==0)&&(c==0)) {
				break;
			}
			
			bw.write(scan(a,b,c));
			
		}
		bw.flush();
		bw.close();
		br.close();
		
	
		
		
		
	}
	
	
	
	
	public static String scan(int a, int b, int c) {
		
		int Long=0;
		int Short1=0;
		int Short2=0;
		
		if((a==b)||(a==c)||(b==c)) {
			return "wrong"+"\n";
		}
		
		if((a>b)&&(a>c)) {
			Long=a;
			Short1=b;
			Short2=c;
			if((Long*Long)==((Short1*Short1)+(Short2*Short2))) {
				return "right\n";
			}
			else {
				return "wrong\n";
			}
			
		}
		else if((b>a)&&(b>c)) {
			Long=b;
			Short1=a;
			Short2=c;
			if((Long*Long)==((Short1*Short1)+(Short2*Short2))) {
				return "right\n";
			}
			else {
				return "wrong\n";
			}
		}
		else if((c>a)&&(c>b)) {
			Long=c;
			Short1=a;
			Short2=b;
			if((Long*Long)==((Short1*Short1)+(Short2*Short2))) {
				return "right\n";
			}
			else {
				return "wrong\n";
			}
		}
		
		
		return ((Long*Long)==((Short1*Short1)+(Short2*Short2)))?"right\n":"wrong\n";
		
		
	}
	
	
}
