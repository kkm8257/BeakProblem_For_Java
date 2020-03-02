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
		
		//ū ������ ���ϱ�
		
		
		
		
		if((a1==a2)&&(b1==b2)&&(r1==r2)) {
			
			return "-1";
			
		}
		
		
		
		//-1�� ��ǥ������ ��������������
				//////�ؾ���
				
				
		
		
		if(distance>rSum) {
			
			return "0";

		}
		else if(distance+smallR<bigR) {
			return "0";
		}
		
		//0���Ϸ��� �������� �Ÿ� > ��������
		//ū���ȿ� �������������� , �������� �Ÿ�+�ȿ��ִ� �������� ������ < ū���� ������

		else if(distance==smallR+bigR) {
			return "1";
			
		}
		else if(distance+smallR==bigR) {
			return "1";
		}
		
		
		//1���϶� , �������ǰŸ�==��������
		//�ѿ��� �ȿ������� , �������� �Ÿ�+�ȿ��ִ� �������� ������ == ū���� ������
		
		
		else if(distance< smallR+bigR) {
			return "2";
		}
		
		//2���϶�, �������ǰŸ� < ������ ��
		
		
		
		return "";
	}

}
