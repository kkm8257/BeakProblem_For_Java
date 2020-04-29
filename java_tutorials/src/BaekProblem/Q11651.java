package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11651 {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int Num = Integer.parseInt(br.readLine());
		
		
		int [][] array=new int[Num][2];
		
		for(int i =0;i<Num;i++) {
			st=new StringTokenizer(br.readLine());
			
			array[i][0]=Integer.parseInt(st.nextToken());
			array[i][1]=Integer.parseInt(st.nextToken());
			
		}

		
		Arrays.sort(array,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1]==o2[1]) {
					//한줄한줄 개념으로 보면됨
					return Integer.compare(o1[0], o2[0]);
				}
				
				
				else {
					return Integer.compare(o1[1],o2[1]);
				}
			}
			
			
			
		});
		
		
		
		for(int i =0; i <array.length;i++) {
			System.out.println(array[i][0]+" "+array[i][1]);
		}
	
		
	}

}
