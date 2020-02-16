package BaekProblem;
//
//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//
//�Է��� ���������� 0 �� ���� ���´�.
//�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10952 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		int A, B;

		while (true) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			if((A==0)&&(B==0)) {
				break;
			}
			
			bw.write(Integer.toString(A + B)+"\n");
			bw.flush();
		}


	}

}


