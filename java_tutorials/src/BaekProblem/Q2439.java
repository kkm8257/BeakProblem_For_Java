package BaekProblem;

//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
//
//������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
//ù° �ٿ� N(1 �� N �� 100)�� �־�����.
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

