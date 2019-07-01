package com.codeplus.math;

import java.util.Scanner;

public class B_1934_answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		while (cnt-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int gcd = getGCD(a, b);
			System.out.println(a*b/gcd);
		}
	}

	public static int getGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return getGCD(b, a%b);
		}
	}
}
