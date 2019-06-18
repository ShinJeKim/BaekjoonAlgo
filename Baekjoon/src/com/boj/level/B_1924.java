package com.boj.level;

import java.util.Scanner;

public class B_1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;
		String answer = "";
		
		String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		if(x == 1) {
			answer = day[y%7];
		}else {
			for(int i=2; i<=x; i++) {
				if(i == 2) {
					sum += 28;
				}else if(i<8) {
					if(i%2 == 1)
						sum += 31;
					else
						sum += 30;
				}else {
					if(i%2 ==1)
						sum +=30;
					else
						sum += 31;
				}
			}
			System.out.println("error = "+((sum+y)%7-1));
			//answer = day[(sum+y)%7-1];
			
			if(((sum+y)%7-1) == -1) {
				answer = day[6];
			}else {
				answer = day[(sum+y)%7-1];
			}
			
		}
		
		
		System.out.println(answer);

		
	}

}
