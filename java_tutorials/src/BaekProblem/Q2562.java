package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;




public class Q2562 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int[] Array=new int[10];
		boolean[] CountArray=new boolean[42];
		int count=0;
		for(int i=0; i<=9;i++) {
			Array[i]=Integer.parseInt(br.readLine())%42;
			if(!CountArray[Array[i]]) {
				count+=1;
				CountArray[Array[i]]=true;
			}
			
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		
		
		
	}

}
