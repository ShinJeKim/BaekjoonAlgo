package com.codeplus.basic;

import java.util.Scanner;

public class B_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String strs[] = sc.nextLine().split(" ");
		sc.close();
		int input[] = new int[strs.length];
		
		for(int i=0; i<strs.length; i++) {
			input[i] = Integer.parseInt(strs[i]);
		}
		
		int min = input[0];
		int max = input[0];
		
		for(int i=1; i<input.length; i++){
			if(min>input[i])
				min = input[i];
			if(max<input[i])
				max = input[i];
		}
		System.out.println(min+" "+max);
	}

}
