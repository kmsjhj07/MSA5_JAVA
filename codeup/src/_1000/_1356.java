package _1000;

import java.util.Scanner;

public class _1356 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if(i<=5) {
				for (int j = 2; j > 4; j++) {
					System.out.print("");
				}
				for(int j=1;j<=n;j++)
					System.out.print("*");
		}
			System.out.println();
		}
	}

}
