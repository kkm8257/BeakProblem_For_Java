package BaekProblem;
//�ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
//
//ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.

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


