package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1002 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		double CaseNum=Double.parseDouble(br.readLine());
		
		for(double a =0;a<CaseNum;a++) {
			
		st= new StringTokenizer(br.readLine());
		double a1=Double.parseDouble(st.nextToken());
		double b1=Double.parseDouble(st.nextToken());
		double r1=Double.parseDouble(st.nextToken());
		double a2=Double.parseDouble(st.nextToken());
		double b2=Double.parseDouble(st.nextToken());
		double r2=Double.parseDouble(st.nextToken());
		
		bw.write(scan(a1,b1,r1,a2,b2,r2)+"\n");
		
		
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	public static String scan(double a1, double b1, double r1, double a2, double b2, double r2) {

		double distance=Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1, 2));
		double rSum=r1+r2;
		double bigR=0;
		double smallR=0;
		
		
		
		
		if(r1>r2) {
			bigR=r1;
			smallR=r2;
		}
		else if(r1<r2) {
			bigR=r2;
			smallR=r1;
		}
		
		//큰 반지름 구하기
		
		
		
		
		if((a1==a2)&&(b1==b2)&&(r1==r2)) {
			
			return "-1";
			
		}
		
		
		
		//-1는 좌표가같고 반지름도같을떄
				//////해야함
				
				
		
		
		if(distance>rSum) {
			
			return "0";

		}
		else if(distance+smallR<bigR) {
			return "0";
		}
		
		//0개일려면 두점간의 거리 > 반지름합
		//큰원안에 작은원이잇을떄 , 두점간의 거리+안에있는 작은원의 반지름 < 큰원의 반지름

		else if(distance==smallR+bigR) {
			return "1";
			
		}
		else if(distance+smallR==bigR) {
			return "1";
		}
		
		
		//1개일때 , 두점간의거리==반지름합
		//한원이 안에잇을때 , 두점간의 거리+안에있는 작은원의 반지름 == 큰원의 반지름
		
		
		else if(distance< smallR+bigR) {
			return "2";
		}
		
		//2개일때, 두전간의거리 < 반지름 합
		
		
		
		return "";
	}

}
