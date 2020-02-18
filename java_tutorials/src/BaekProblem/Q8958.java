package BaekProblem;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q8958 {

	public static void main(String[] args) throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		String Line="";
		int total=0;
		int count=0;
		
		int num=Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			Line=br.readLine();
			String[] LineArray=Line.split("");
			for(int j =0;j<LineArray.length;j++) {
				if(LineArray[j].equals("O")) {
					count+=1;
					total=total+count;
				}
				else {
					count=0;
				}
			}
			System.out.println(total);
			total=0;
			count=0;
		}
		

		
		
		
	}

}
