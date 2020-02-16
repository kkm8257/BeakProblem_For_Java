package BaekProblem;

//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//
//
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;


class Q2439 {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num=Integer.parseInt(br.readLine());
		int temp1=num-1;
		int temp2=1;
		
		for (int i =1;i<=num;i++) {
			
			for(int j=1;j<=temp1;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=temp2;j++) {
				System.out.print("*");
			}
			System.out.println();
			temp1=temp1-1;
			temp2=temp2+1;
		}
	
	}


}

