package _mission;

import java.util.Scanner;

// 5. 치킨 메뉴판

public class Ex05 {
	
	public static void menu() {
		System.out.println("********** 치킨 메뉴판 **********");
		System.out.println("1. 황금올리브 반반한 치킨");
		System.out.println("2. 뿌잉클 치킨");
		System.out.println("3. 처갓집에서 호식이가 만든 치킨");
		System.out.println("0. 종료");
		System.out.print("********** 번호:");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int menuNo = 0;
		String menuName = "";
		
		do {
			menu();
			menuNo = sc.nextInt();
			
			if(menuNo == 0) break;
			
			switch (menuNo) {
			case 1: menuName = "황금올리브 반반한 치킨"; 		break;
			case 2: menuName = "뿌잉클 치킨"; 				break;
			case 3: menuName = "처갓집에서 호식이가 만든 치킨"; 	break;
			default: 										break;
			}
			if(menuNo >= 1 && 3 >= menuNo) {
				System.out.println("'" + menuName + "'" + "이(/가) 주문되었습니다.");
				a++;
			} else
				System.out.println("(0~3) 사이의 번호를 입력해주세요.");
		} while (menuNo != 0);
		
		System.out.println("총 " + a +"개의 상품이 주문되었습니다.");
	}
}
