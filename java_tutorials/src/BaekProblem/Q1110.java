package BaekProblem;

//0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.
//
//26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
//
//���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
//
//N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� N�� �־�����. N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.

//ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Q1110{
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input="";
		int count=0;
		int temp=0;
		int first,second=0;
		int basicTemp;
		
		
		int newFirst,newSecond;
		int newTemp=0;
		
		temp=Integer.parseInt(br.readLine());
		basicTemp=temp;
		while(true) {
			first=temp/10;
//			System.out.println(first);
			second=(temp%10);
//			System.out.println(second);
			newFirst=second;
//			System.out.println(newFirst);
			newSecond=(first+second)%10;
//			System.out.println(newSecond);
			newTemp=second*10+newSecond;
//			System.out.println(newTemp);
			count=count+1;
			temp=newTemp;
			
			if(temp==basicTemp) {
				System.out.println(count);
				break;
			}
			
		}
		
		
		
	}
	
}

