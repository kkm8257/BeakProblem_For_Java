package BaekProblem;
//자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//
//첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
//
//첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
 
 
class Q2741 {
    public static void main(String args[]) throws IOException  {
    		
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int temp=Integer.parseInt(br.readLine());
    	
    	for(int i=1;i<=temp;i++) {
    		
    		String ment=Integer.toString(i);
    		
    		bw.write(ment+"\n");
    		
    	}
    	bw.flush();
	    
  
    }
}


