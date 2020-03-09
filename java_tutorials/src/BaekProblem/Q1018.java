package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1018 {

	public static void main(String[] args)throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[][] smallchess=new char[8][8];
		
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		char[][] bigchess=new char[N][M];
		
		
	
	for(int i=0;i<bigchess.length;i++) {
		st=new StringTokenizer(br.readLine());
		String temp=st.nextToken();
		
		
		for(int j=0;j<bigchess[i].length;j++) {
			bigchess[i][j]=temp.charAt(j);
		}
		bw.write("\n"+Arrays.toString(bigchess[i]));
		
	}
	bw.write("\n\n\n\n");
	int temp=0;
	

	
	
	
	bw.flush();
	}

	
	public static void make(int row,int col) {
		
		
		
	}
}
