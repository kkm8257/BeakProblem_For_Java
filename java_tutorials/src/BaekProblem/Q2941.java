package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;

public class Q2941 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		int count = 0;
		
		String[] Match= {
				"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i =0;i<Match.length;i++) {
			
			while(input.contains(Match[i])) {
				count+=1;
				input=input.replaceFirst(Match[i], " ");
			}
			
		}
		input=input.replace(" ", "");
		count=count+input.length();
		System.out.println(count);
		
		
}
}
	


