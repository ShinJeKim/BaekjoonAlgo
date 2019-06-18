package com.boj.level;

import java.util.Scanner;

public class B_2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();

		if (N < 3 || N > 5000) {// 입력값 조건
			System.out.println(-1);
			return;
		}

		if (N % 5 == 0) {// 1) N이 5의 배수일 때
			System.out.println(N / 5);
			return;
		} else {// 2) N이 5의 배수가 아닐 때는 N에서 5의 배수를 차례대로 빼면서 3으로 나눠지는지 확인 
			int divide = N / 5;

			for (int i = divide; i > 0; i--) {
				int val = N - 5 * i;
				if (val % 3 == 0) {
					System.out.println(i + val / 3);
					return;
				}
			}
		}

		if (N % 3 == 0) {// 3) N이 3의 배수 일 때 
			System.out.println(N / 3);
		} else {// N이 1~3 어느 케이스에도 속하지 않을 때 
			System.out.println(-1);
		}
		return;

	}

}
