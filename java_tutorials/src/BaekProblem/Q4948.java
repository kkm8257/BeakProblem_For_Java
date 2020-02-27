package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4948 {
	

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = 0;
	
		int temp=0;
		
		while (true) {
			temp = Integer.parseInt(br.readLine());
			
			
			if (temp == 0) {
				break;
			}
			bw.write(Integer.toString(getPrime(temp))+"\n");;
		}
		bw.flush();

	}

	public static int getPrime(int num) {
		int count=0;
		
		boolean[] check=new boolean[num*2];
		check[1]=true;
		
		int temp=num;
		int temp2=num*2;
		if(num==1) {
			return 1;
		}
		
		
		for(int i=2;i<=check.length;i++) {
			for(int j=2;i*j<check.length;j++) {
				
				check[i*j]=true;				
			}
			
		}
		
		for(int i=num+1;i<check.length;i++) {
			if(check[i]==false) {
				count++;
			}
		}
		
		return count;
		
	}

}
