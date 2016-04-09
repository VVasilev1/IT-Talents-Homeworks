import java.util.Scanner;

public class App {

	static void fill(char[][] mat) {
		boolean check = false;
		for (int index1 = 0; index1 < mat.length; index1++) {
			for (int index2 = 0; index2 < mat[index1].length; index2++) {
				if (mat[index1][index2] == 'X') {

					if (index1 >= 2 && index2 > 0) {
						if (mat[index1 - 2][index2 - 1] != 'X') {
							mat[index1 - 2][index2 - 1] = 'X';
							check = true;
						}
					}
					if (index1 >= 2 && index2 < mat[index1].length - 1) {
						if(mat[index1 - 2][index2 + 1] != 'X') {
						mat[index1 - 2][index2 + 1] = 'X';
						check = true;
						}
					}
					if (index1 < mat.length - 2 && index2 < mat[index1].length - 1) {
						if (mat[index1 + 2][index2 + 1] != 'X') {
						mat[index1 + 2][index2 + 1] = 'X';
						check = true;
						}
					}
					if (index1 < mat.length - 2 && index2 > 0) {
						if (mat[index1 + 2][index2 - 1] != 'X') {
						mat[index1 + 2][index2 - 1] = 'X';
						check = true;
						}
					}
					if (index2 >= 2 && index1 > 0) {
						if(mat[index1 - 1][index2 - 2] != 'X') {
						mat[index1 - 1][index2 - 2] = 'X';
						check = true;
						}
					}
					if (index2 < mat[index1].length - 2 && index1 > 0) {
						if (mat[index1 - 1][index2 + 2] != 'X') {
						mat[index1 - 1][index2 + 2] = 'X';
						check = true;
						}
					}
					if (index2 >= 2 && index1 < mat.length - 1) {
						if (mat[index1 + 1][index2 - 2] != 'X') {
						mat[index1 + 1][index2 - 2] = 'X';
						check = true;
						}
					}
					if (index2 < mat[index1].length - 2 && index1 < mat.length - 1) {
						if (mat[index1 + 1][index2 + 2] != 'X') {
						mat[index1 + 1][index2 + 2] = 'X';
						check = true;
						}
					}
				}
			}
		}
		for (int index1 = 0; index1 < mat.length; index1++) {
			for (int index2 = 0; index2 < mat[index1].length; index2++) {
				System.out.print(mat[index1][index2]);
			}
			System.out.println();
		}
		System.out.println();
		if (check == true) {
			fill(mat);
		}

	}

	public static void main(String[] args) {
		int n = 5;
		int m = 5;
		char[][] mat = new char[n][m];
		for (int index = 0; index < n; index++) {
			for (int index2 = 0; index2 < m; index2++) {
				mat[index][index2] = 'O';
			}	
		}	
		mat[3][3] = 'X';
		for (int index1 = 0; index1 < mat.length; index1++) {
			for (int index2 = 0; index2 < mat[index1].length; index2++) {
				System.out.print(mat[index1][index2]);
			}
			System.out.println();
		}
		
		System.out.println();
		fill(mat);

	}

}
