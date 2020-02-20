package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2908 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		String str_num1 = st.nextToken();
		String str_num2 = st.nextToken();

		String[] Str_Array1 = str_num1.split("");
		String[] Str_Array2 = str_num2.split("");

		int A=cal(Str_Array1);
		int B=cal(Str_Array2);
		
		if(A>B) {
			System.out.println(A);
		}
		else {
			System.out.println(B);
		}
		

	}

	public static int cal(String[] array) {

		String temp = array[0];
		array[0] = array[2];
		array[2] = temp;
		
		int a,b,c;
		a=Integer.parseInt(array[0])*100;
		b=Integer.parseInt(array[1])*10;
		c=Integer.parseInt(array[2]);
		int result=a+b+c;
		
		return result;
	}
}
