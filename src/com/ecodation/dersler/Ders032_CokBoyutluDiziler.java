package com.ecodation.dersler;

public class Ders032_CokBoyutluDiziler {

	public static void main(String[] args) {

		int[][] matrix = new int[4][4];

		matrix[0][0] = 1;
		matrix[1][0] = 2;
		matrix[1][1] = 3;
		matrix[3][3] = 4;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}

}
