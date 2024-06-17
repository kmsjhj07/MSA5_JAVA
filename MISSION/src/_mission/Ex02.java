package _mission;

import java.util.Scanner;

// 2. 홀수&짝수 합계, 약수

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int sum1 = 0;
		
		for (int i = 1; i <= N; i+=2) {
				sum = sum + i;
				
			if( i == N-1 ) {
				System.out.print(i + "=");
			} else {
				System.out.print(i + "+");
			}
		}
		System.out.println(sum);
		
		for (int i = 2; i <= N; i+=2) {
			sum1 = sum1 + i;
			
			if( i == N ) {
				System.out.print(i + "=");
			} else {
				System.out.print(i + "+");
			}
		}
		System.out.println(sum1);
		
		for (int i = 1; i <= N; i++) {
			if( N % i == 0 ) {
				System.out.print(i + " ");
			}
		}
	}
}
