package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de linhas: ");
		int numbersLines = sc.nextInt();
		System.out.print("Digite o número de colunas: ");
		int numbersColumns = sc.nextInt();
		int[][] mat = new int[numbersLines][numbersColumns];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Digite o número que deseja buscar as informações: ");
		int number = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == number) {
					System.out.println("Posição linha/coluna: " + i + "," + j);

					if (j > 0) {
						System.out.println("esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("acima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("abaixo: " + mat[i+1][j]);
					}

				}
			}
			sc.close();
		}
	}
}
