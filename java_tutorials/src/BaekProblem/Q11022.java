package BaekProblem;

//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
//
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
//�� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�.
//

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;

class Q11022 {
	public static void main(String args[]) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int Num=Integer.parseInt(br.readLine());
		
		for(int i=1;i<=Num;i++) {
			st=new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			int C=A+B;
			bw.write("Case #"+Integer.toString(i)+": "+Integer.toString(A)+" + "+Integer.toString(B)+" = "+Integer.toString(C)+"\n");
					
		}
		
		bw.flush();
		
		
	}

}


