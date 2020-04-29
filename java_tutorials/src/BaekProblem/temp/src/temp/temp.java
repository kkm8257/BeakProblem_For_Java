package temp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class temp {

	public static void main(String[] args)throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int testCase=Integer.parseInt(br.readLine());
		
		int[] arrayS=new int[testCase];
		int[] arrayE=new int[testCase];
		
		StringTokenizer st;
		
		
		for(int i =0;i<arrayS.length;i++) {
			
			st=new StringTokenizer(br.readLine());
			
			arrayS[i]=Integer.parseInt(st.nextToken());
			arrayE[i]=Integer.parseInt(st.nextToken());
			
		}
		
		
//		System.out.println(Arrays.toString(arrayS));
//		System.out.println(Arrays.toString(arrayE));
//		
		int count=0;
		
		
		for (int i =0;i<arrayS.length;i++) {
			
			for(int j=0;j<arrayS.length;j++) {
				
				if(i==j)continue;
				
				
				count=count+cal(arrayS[i],arrayS[j],arrayE[j]);
				
			}
			
			System.out.println(count);
			count=0;
		}
		
		
		
		
	}
	
	
	public static int cal(int s1,int s2,int e2) {
		
		
		if((s2<s1)&&(s1<e2)) {
			
			return 1;
			
		}

		return 0;	
	}
	
}
