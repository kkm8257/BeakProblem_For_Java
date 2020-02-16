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

public class Q10951 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		String input = "";



		while((input = br.readLine()) != null) {
			
			st=new StringTokenizer(input);
			
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			bw.write(Integer.toString(a+b)+"\n");
			bw.flush();
			
		}
	}

}


