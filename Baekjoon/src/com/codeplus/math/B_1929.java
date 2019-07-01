package com.codeplus.math;

import java.util.Scanner;

public class B_1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i : getPrimeNumbers(a, b)) {
			if(i != 0)
				System.out.println(i);
		}

//		int[] prime = new int[100]; // 소수 저장
//		int pn = 0; // 소수의 개수
//		boolean[] check = new boolean[101]; // 지워졌으면 true
//		int n = 100; // 100까지 소수
//		for (int i = 2; i <= n; i++) {
//			if (check[i] == false) {
//				prime[pn++] = i;
//				for (int j = i * i; j <= n; j += i) {
//					check[j] = true;
//				}
//			}
//		}
	}

	public static int[] getPrimeNumbers(int a, int b) {
		int[] resultArr = new int[b];
		boolean[] checkArr = new boolean[b+1];
		int idx = 0;
		
		if(a == 1)
			a++;

		for (int i = a; i <= b; i++) {
			if (checkArr[i] == false) {
				resultArr[idx++] = i;
				for (int j = i * 2; j <= b; j += i) {
					checkArr[j] = true;
				}
			}
		}

		return resultArr;
	}

}
