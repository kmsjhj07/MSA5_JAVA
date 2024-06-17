package _1000;

import java.util.Scanner;

public class _1158 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double input = sc.nextDouble();
		
		if( (input >= 30.0 && input <= 40.0) || (input >= 60.0 && input <= 70.0) )
			System.out.println("win");
		else
			System.out.println("lose");

		sc.close();
	}

}
