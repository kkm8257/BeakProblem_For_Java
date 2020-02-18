package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Q1546 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		double M=0;
		
		int count=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		
		
		double[] Array=new double[count];
		double[] NewArray=new double[count];
		double total=0;
		
		for(int i=0;i<Array.length;i++) {
			Array[i]=Double.parseDouble(st.nextToken());
			if(i==0) {
				M=Array[0];
			}
			else {
				if(M<Array[i]) {
					M=Array[i];
				}
				
			}

		}
		
		

		for(int i=0;i<NewArray.length;i++) {
			NewArray[i]=(Array[i]/M)*100;
			total=total+NewArray[i];
		}
		
		System.out.println(total/count);
		
	
	}

}
