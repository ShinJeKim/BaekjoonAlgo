package com.codeplus.basic;

import java.util.Scanner;

public class B_2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int cnt = 0;

		for (int y = N; y > 0; y--) {
			for (int x = 1; x <= (2*N-1); x++) {
				if(x<y)
					System.out.print(" ");
				else if(N-cnt<=x && x<=N+cnt)
					System.out.print("*");
			}
			cnt++;
			System.out.println();
		}
	}
}
