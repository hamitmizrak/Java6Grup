package com.ecodation.dersler;

public class Ders033_CokBoyutluDiziler2 {

	public static void main(String[] args) {

		int[][] matrix = new int[4][4];

		matrix[0][0] = 1;
		matrix[1][0] = 2;
		matrix[1][1] = 3;
		matrix[3][3] = 4;

		for (int i = 0; i < matrix.length; i++) {// satır
			for (int j = 0; j < matrix[i].length; j++) {// sutun
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}

}
