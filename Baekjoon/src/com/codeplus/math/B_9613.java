package com.codeplus.math;

import java.util.Scanner;

public class B_9613 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lineCnt = sc.nextInt();
		while (lineCnt-- > 0) {
			long result = 0;
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					result += getGCD(arr[i], arr[j]);
				}
			}
			System.out.println(result);
		}
	}

	public static int getGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return getGCD(b, a % b);
		}
	}

}
