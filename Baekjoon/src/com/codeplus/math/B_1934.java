package com.codeplus.math;

import java.util.Scanner;

public class B_1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = getLcm(a, b);
		}	
		sc.close();
		for(int i : arr)
			System.out.println(i);
	}
	
	public static int getLcm(int a, int b) {
		int lcm = 1;
		int gcd;
		int aTemp = a;
		int bTemp = b;
		
		while(bTemp != 0) {
			gcd = aTemp%bTemp;
			aTemp = bTemp;
			bTemp = gcd;
		}
		gcd = aTemp;
		lcm = gcd * (a/gcd) * (b/gcd);
		
		return lcm;
	}

}
