package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2231 {
	static boolean flag = false;
	static boolean checkflag=false;
	static int numLength;
	static int result = 0;
	static int ref=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int Num = Integer.parseInt(br.readLine());

//		numLength = Integer.toString(Num).length() - 1;
//		result = Num;
//		solve(Num);
//		ref=result;
		
		for(int i=1;i<=Num;i++) {
			numLength=Integer.toString(i).length();
			flag=false;
			result=i;
			solve(i);
			if(result==Num) {
//				System.out.println(i);
				bw.write(Integer.toString(i));
				checkflag=true;
				break;
			}
			
		}
		if(checkflag==false) {
			bw.write("0");
		}
		
		bw.flush();
	}
	

	// Àç±Í±¸Çö
	public static void solve(int num) {

		// Àç±ÍÅ»Ãâ±¸Çö
		if((num<10)&&(num>=1)) {
			result=num*2;
		}
		else if (numLength == 0) {
			return;
		}

		else if (flag == false) {
			result = result + (int) (num / Math.pow((double) 10, (double) numLength));
			flag = true;
			solve(num);

		}
		else {
			result = result + ((num % (int) (Math.pow((double) 10, (double) numLength)))
					/ (int) Math.pow((double) 10, (double) numLength - 1));
			numLength--;
			solve(num);
		}
		
	}

}
