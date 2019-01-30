package level.java;

import java.util.Scanner;

public class B_2441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int y = N; y > 0; y--) {
			for (int x = N; x > 0; x--) {
				if (x <= y) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
