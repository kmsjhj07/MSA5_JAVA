package _1000;

import java.util.Scanner;

public class _1351 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int input = sc.nextInt();
		int input2 = sc.nextInt();
		
		for(int i=input;i<=input2;i++) {
			for(int j=1;j<=9;j++)
			System.out.println(i+"*"+j+"="+(i*j));
		}
		sc.close();
	}

}
