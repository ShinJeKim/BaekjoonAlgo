package level.java;

import java.util.Scanner;

public class B_2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();

		System.out.println(solution(N));

	}

	public static int solution(int N) {
		int answer = 0;
		int val = N;
		int count = 0;
		
		if(N<0) {
			answer = -1;
		}
		
		
		if (N % 5 == 0) { // N이 5의 배수 일 때 
			answer = N / 5;
		} else if (N % 3 == 0) {// N이 3의 배수 일 때 
			answer = N / 3;
		} else {
			
			while(val > 0) {
				val = N-5;
				count ++;
				
				if(val%3 == 0 ) {
					answer = count + val/3;
					break;
				}else {
					answer = -1;
					break;
				}
			}
			
		}
		

		return answer;
	}

}
