package _1000;

import java.util.Scanner;

public class _1353 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 바깥쪽 반복문 : 행 (i)
		for (int i = 1; i <= n; i++) {
			// 안쪽 반복문 : 열 (j)
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
