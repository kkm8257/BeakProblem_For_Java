package BaekProblem;
import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

import java.util.Arrays;

import java.util.StringTokenizer;

public class Q1018 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		int M = Integer.parseInt(st.nextToken());

		char[][] bigchess = new char[N][M];

		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine());

			String temp = st.nextToken();

			for (int j = 0; j < M; j++) {

				bigchess[i][j] = temp.charAt(j);

			}

		}


		
		

		bw.write(Integer.toString(check(bigchess, 0, 0))+"\n");
		bw.write("\n\n\n\n\nbig\n");

//		bw.write(Integer.toString(check(bigchess, 0, 5 ))+"\n");
//		bw.write("\n\n\n\n\nbig\n");
//		bw.write(Integer.toString(check(bigchess, 1,5 ))+"\n");
//
//		
		bw.flush();

	}

	public static int check(char[][] chess, int row, int col) {

//row랑 col은 시작 인덱스

		char[][] tempchess = chess;

		int count = 0;

		int temprow = row;

		int tempcol = col;
		
		

		for(int i=row;i<8+row;i++) {

			for(int j=col;j<col+8;j++) {
				System.out.print(tempchess[i][j]);
				if(j==col+7) {
					System.out.println();
				}
				
			}
		}
		
		System.out.println();
		System.out.println();

//화이트시작

		if (tempchess[row][col] == 'W') {

			count = 0;

			for (int i = row; i < row + 8; i++) {

				for (int j = col; j < col + 8; j++) {

					if ((i == temprow) && (j == tempcol)) {

						continue;

					}

					if (((((i % 2) == 0) && ((j % 2) == 0)) || ((i % 2 == 1) && ((j % 2) == 1)))
							&& (tempchess[i][j] != 'B')) {

//						tempchess[i][j] = 'B';

						count++;

					}

					else if ((((i % 2 == 0) && ((j % 2) == 1)) || (((i % 2) == 1) && ((j % 2) == 0)))
							&& (tempchess[i][j] != 'W')) {

//						tempchess[i][j] = 'W';

						count++;

					}

				}

			}

		}

//블랙시작

		else if (tempchess[row][col] == 'B') {

			count = 0;

			for (int i = row; i < row + 8; i++) {

				for (int j = col; j < col + 8; j++) {

					if ((i == temprow) && (j == tempcol)) {

						continue;

					}

					if (((((i % 2) == 0) && ((j % 2) == 0)) || ((i % 2 == 1) && ((j % 2) == 1)))
							&& (tempchess[i][j] != 'B')) {

//						tempchess[i][j] = 'B';

						count++;

					}

					else if ((((i % 2 == 0) && ((j % 2) == 1)) || (((i % 2) == 1) && ((j % 2) == 0)))
							&& (tempchess[i][j] != 'W')) {

//						tempchess[i][j] = 'W';

						count++;

					}

				}

			}

		}


		return count;

	}

////////////////////////////////////////////////////////////////////

}