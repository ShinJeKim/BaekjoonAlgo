package com.codeplus.math;

import java.util.Scanner;

public class B_1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (getPrimeNumberCount(sc.nextInt()))
				cnt++;
		}
		System.out.println(cnt);

	}

	public static boolean getPrimeNumberCount(int input) {
		if (input < 2)
			return false;

		for (int i = 2; i * i <= input; i++) {
			if (input % i == 0)
				return false;
		}

		return true;
	}

}
