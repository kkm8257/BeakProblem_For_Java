package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Q1157 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String Max ="";
		int MaxCount=0;
		int index=0;
		int[] count=new int[26];
		
		String Word=br.readLine();
		String UpWord=Word.toUpperCase();
		
		for(int i =0;i<UpWord.length();i++) {
			
			int temp=UpWord.charAt(i);
			count[temp-65]+=1;
			
		}
		
		for(int i =0;i<count.length;i++) {
			
			if(MaxCount<count[i]) {
				MaxCount=count[i];
				index=i+65;
			}
			
			else if(MaxCount==count[i]) {
				index='?';
			}
		}
	System.out.println((char)index);
		

		
		
	}

}
