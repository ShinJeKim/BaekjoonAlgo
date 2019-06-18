package com.codeplus.basic;

import java.util.Scanner;

public class B_1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		int monthArr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String dayArr[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int sum = day;

		for (int i = 0; i < month - 1; i++) {
			sum += monthArr[i];
		}

		System.out.println(dayArr[sum % 7]);
	}
}
