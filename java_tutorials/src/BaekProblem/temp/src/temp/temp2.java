package temp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class temp2 {

	public static void main(String[] args) throws  IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int testCase = Integer.parseInt(br.readLine());
		
		int[] fruit=new int[testCase];
		int[] fruitFindMax = new int[testCase];
		
		
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i =0; i<testCase;i++) {
			
			fruit[i]=Integer.parseInt(st.nextToken());
			fruitFindMax[i]=fruit[i];
			
		}
		
		Arrays.sort(fruitFindMax);	
		int OneThingBest=fruitFindMax[fruitFindMax.length-1];
	///////////////////////////////////////////////////////////
		
		
		int temp=0;
		int tempbest=0;
		for(int i=0; i<fruit.length-1;i++) {	
			temp=fruit[i];
			
			for(int j=i+1;j<fruit.length;j++) {
				
				
				temp=temp+fruit[j];
				if(temp>OneThingBest) {
					
					tempbest=temp;
					OneThingBest=temp;
				}
				else {
					tempbest=OneThingBest;
				}

			}				
		}
		
		bw.write(Integer.toString(tempbest));
		bw.flush();
	}

}
