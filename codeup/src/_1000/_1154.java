package _1000;

import java.util.Scanner;

public class _1154 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		int a = sc.nextInt();
		System.out.print("");
		int b = sc.nextInt();
		
		if ( a > b ) {
			System.out.println(a-b);
		}
		else {
			System.out.println(b-a);
		}
		sc.close();
	}
}