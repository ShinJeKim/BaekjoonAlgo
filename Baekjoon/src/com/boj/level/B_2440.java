package com.boj.level;

import java.util.Scanner;

public class B_2440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int y = 0; y < N; y++) {
			for (int x = 0; x < N - y; x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
