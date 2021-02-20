package com.ecodation.dersler;

public class Ders034_CokBoyutluDiziler3 {

	public static void main(String[] args) {

		int[][] matrix = { { 4, 5, 6, 9, 8 }, { 5, 6, 7, 8, 5 }, { 1, 2, 3, 4, 5 } };

		for (int i = 0; i < matrix.length; i++) {// satır
			for (int j = 0; j < matrix[i].length; j++) {// sutun
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}

}
