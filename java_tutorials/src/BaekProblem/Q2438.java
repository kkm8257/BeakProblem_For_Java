package BaekProblem;

//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
//ù° �ٿ� N(1 �� N �� 100)�� �־�����.
//ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;


class Q2438 {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


}

