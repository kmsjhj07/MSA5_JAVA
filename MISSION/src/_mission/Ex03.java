package _mission;

import java.util.Scanner;

// 3. 3, 6, 9 게임

public class Ex03 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			int a = i / 10;
			int b = i % 10;
			
			boolean a1 = a != 0 && a % 3 == 0;
			boolean b1 = b != 0 && b % 3 == 0;
			
			if( a1 && b1 ) {
				System.out.println("**");
			} else if( a1 || b1 ) {
				System.out.println("*");
			} else
				System.out.println(i);
		}
	}
}
