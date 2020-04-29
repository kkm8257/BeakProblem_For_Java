package BaekProblem;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


class Qtest {
	
	
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		
		
		int N=Integer.parseInt(st.nextToken());//배열크기
		int K=Integer.parseInt(st.nextToken());
		
		int[] array=new int[N];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0; i <array.length;i++) {
			
			array[i]=Integer.parseInt(st.nextToken());
			
		}
		
		bw.write(Integer.toString(solve(N,K)));
		
		bw.flush();
		
	}
	
	public static int solve(int N,int K) {
		
		int total=N-K;
		int result=1;
		if(total%(K-1)==0) {
			result=(total/(K-1))+result;
		}
		else if(total%(K-1)!=0) {
			result=(total/(K-1))+result+1;
		}
		
		return result;
		
	}
}