package BaekProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1193 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		int count = 1;// i��° �� ������ �м� ����
		int i = 2;
		// Ȧ���� �ؿ�����
		// ¦���� ������ �Ʒ�
		int order = 0; // ����

		while (true) {

			if (num > count) {
				count = count + i;
				i++;

			} else if (num <= count) {
				
				order = num + (i - 1) - count;

				if ((i - 1) % 2 == 1) {
					System.out.println(((i - 1) - order + 1) + "/" + order);
					break;
				} else if ((i - 1) % 2 == 0) {
					System.out.println(order + "/" + ((i - 1) - order + 1));
					break;
				}
			}

		}
	}
}
