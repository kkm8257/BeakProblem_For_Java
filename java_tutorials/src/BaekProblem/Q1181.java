package BaekProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Q1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int Num=Integer.parseInt(br.readLine());
		
		
		String[] array=new String[Num];
		
		
		for(int i =0;i<Num;i++) {
			array[i]=br.readLine();
		}
		
		Arrays.sort(array,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				

				
				return Integer.compare(o1.length(), o2.length());
			}
			
			
		});
		
		
		
		for(int i=1;i<array.length;i++) {
			
		//https://hongku.tistory.com/254
			
		}
		
		
		
		for(int i =0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}

}
