package com.codeplus.math;

import java.util.Scanner;

public class B_2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int gcd = getGCD(a, b);
		int lcm = getLCM(a, b, gcd);
		System.out.println(gcd);
		System.out.println(lcm);
	}

	public static int getGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return getGCD(b, a%b);
		}
	}
	
	public static int getLCM(int a, int b, int gcd) {
		int lcm = 1;
		
		lcm = gcd * (a/gcd) * (b/gcd);
		
		return lcm;
	}

}
