package _1000;

import java.util.Scanner;

public class _1355 {
			
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
			for (int t=n-i;t>0;t--) {
					System.out.print("*");
				}
				System.out.println();
			}
			sc.close();
		}
}
