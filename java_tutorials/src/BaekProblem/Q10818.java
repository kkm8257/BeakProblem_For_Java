package BaekProblem;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//각 테스트 케이스마다 A+B를 출력한다.
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
			else {//i 1부터
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


