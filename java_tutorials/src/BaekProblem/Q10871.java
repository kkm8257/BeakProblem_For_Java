package BaekProblem;

//���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
//
//��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
//
//X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
//

//�Է�:
//10 5
//1 10 4 9 2 3 8 5 7 6

//���:
//1 4 2 3

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Q10871 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;
		
		
		st=new StringTokenizer(br.readLine());

		int numList =Integer.parseInt(st.nextToken());
		int compareNum=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());

		
		int[] ArrayNum=new int[numList];
		for(int i=0;i<numList;i++) {
			ArrayNum[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<ArrayNum.length;i++) {
			
			if(ArrayNum[i]<compareNum) {
				
				System.out.print(ArrayNum[i]+" ");
				
			}
			
		}
		
		

	}

}




