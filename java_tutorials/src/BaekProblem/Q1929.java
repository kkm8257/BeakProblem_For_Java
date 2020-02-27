package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//https://pangsblog.tistory.com/39 Âü°í


public class Q1929 {

	static boolean[] check;
	
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int M=Integer.parseInt(st.nextToken());
		int N=Integer.parseInt(st.nextToken());
		
		check=new boolean[N+1];
		getPrime();
		
		for(int i=M;i<=N;i++) {
			
			if(!check[i]) {
				bw.write(Integer.toString(i)+"\n");
			}
	
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}
	
	public static void getPrime() {
		
		check[1]=true;
		
		for(int i=2;i<check.length;i++) {
			for(int j=2;i*j<check.length;j++) {
				
				check[i*j]=true;
				
			}
			
			
		}
		
		
	}

}