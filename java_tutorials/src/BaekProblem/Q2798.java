package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2798 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int[] array = null;
	
			st=new StringTokenizer(br.readLine());
			array=new int[N];
			
			for(int i=0;i<array.length;i++) {
				
				array[i]=Integer.parseInt(st.nextToken());
			}
	
		bw.write(Integer.toString(solve(array,M,N)));
		bw.flush();
	}
	
	
	
	public static int solve(int[] temp,int M,int N) {
		
		int total=0;		
		int result=0;
		
		
		if(N==3) {
			for(int i=0; i<temp.length;i++) {
				total=temp[i]+total;
			}
			return total;
		}
		
		else {
			for(int i=0;i<temp.length;i++) {
				

				for(int j=0; j<temp.length;j++) {
					
					if(i==j) continue;
					
					
					for(int q=0;q<temp.length;q++) {
						if((i==j)||(i==q)||(q==j)) continue;
//						System.out.println("i j q :"+i+" "+j+" "+q);
						

				
//						System.out.println(temp[i] + " "+temp[j]+ " "+temp[q]);
						
						total=temp[i]+temp[j]+temp[q];

						
						if(total==M) {
							return total;
						}
						else if(total<M) {
							if((M-total)<=(M-result)) {
								result=total;
							}
							
						}
						
						
						total=total-temp[q];
//						System.out.println("q나가요~");
					}
					total=total-temp[j];
//					System.out.println("j나가요~");
				}
				total=total-temp[i];
//				System.out.println("i나가요~");
				
			}
			
			
			
			
			return result  ;
		}
		
		
		
		
		
		
	}

}
