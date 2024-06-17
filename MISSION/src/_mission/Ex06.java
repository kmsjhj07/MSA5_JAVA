package _mission;

import java.util.Scanner;

// 6. 로또리아 N게임

public class Ex06 {

	public static void main(String[] args) {
		
		System.out.print("몇 게임? ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int k = 1; k <= n; k++) {
		int arr[] = new int[6];
		System.out.print("[" + k + " 게임] ");
		
		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 45 + 1);
			arr[i] = r;
			for (int j = 0; j < i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int num1 = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = num1;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		}
	}
}
