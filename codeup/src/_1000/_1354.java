package _1000;

import java.util.Scanner;

public class _1354 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
		System.out.println();
		}
		sc.close();
	}
}
