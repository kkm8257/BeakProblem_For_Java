package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2577 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int Num_1 = Integer.parseInt(br.readLine());
		int Num_2 = Integer.parseInt(br.readLine());
		int Num_3 = Integer.parseInt(br.readLine());

		int total = Num_1 * Num_2 * Num_3;

		String str_total = Integer.toString(total);
		String[] ArrayStr = str_total.split("");

		int[] countArray=new int[10];

		for (int i = 0; i < ArrayStr.length; i++) {
			countArray[Integer.parseInt(ArrayStr[i])]=countArray[Integer.parseInt(ArrayStr[i])]+1;
			
			}
			
		for(int i=0;i<countArray.length;i++) {
			System.out.println(countArray[i]);
		}
		}
		
	}


