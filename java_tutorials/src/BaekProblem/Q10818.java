package BaekProblem;

//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
//

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;




public class Q10818 {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int temp = 0;
		int max=0,min=0;
		int count=Integer.parseInt(br.readLine());
		int[] Array=new int[count];
		
		st=new StringTokenizer(br.readLine());
		
		for(int i=0;i<count;i++) {
			Array[i]=Integer.parseInt(st.nextToken());
			if(i==0) {
				max=Array[0];
				min=Array[0];
			}
			else {//i 1����
				if(Array[i]>=max) {
					max=Array[i];
				}
				else if(Array[i]<max) {
					if(Array[i]<min) {
						min=Array[i];
					}
				}
			}

		}
		
		bw.write(Integer.toString(min)+" ");
		bw.write(Integer.toString(max));
		
		bw.flush();
	}

}


