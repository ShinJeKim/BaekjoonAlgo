package level.java;

import java.util.Scanner;

public class B_2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int y=1; y<=N; y++) {
			for(int x=1; x<=y; x++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
