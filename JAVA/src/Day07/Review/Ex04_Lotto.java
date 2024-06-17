package Day07.Review;

public class Ex04_Lotto {
	
	public static void main(String[] args) {
		// Math.random() : 0.xxxxx ~ 0.9xxxxx 사이의 난수를 반환하는 메소드
		double random = Math.random();
		System.out.println(random);
		
		// 1~6 사이의 정수 : 주사위
		// Math.random() 					: 0.xxxxx ~ 0.9xxxxx
		// Math.random() * 10				: x.xxxx ~ 9.xxxx
		// (int) (Math.random() * 10)		: 0 ~ 9 (10개)
		// (int) (Math.random() * 6)		: 0 ~ 5 (6개)
		// (int) (Math.random() * 6) + 1	: 1 ~ 6 (6개)
		
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println("주사위 : " + dice);
		
		// 1~45 사이의 정수 : 로또
		int lotto = (int) (Math.random() * 45) + 1;
		System.out.println("로또 랜덤 번호 : " + lotto);
		
		// (공식) : (int) (Math.random() * [개수]) + [시작숫자]
		// 1~20 사이의 랜덤수
		int num = (int) (Math.random() * 20) + 1;
		System.out.println("1~20 : " + num);
		
		// -20 ~ 20 사이의 랜덤수
		int num2 = (int) (Math.random() * 41) - 20; 
		System.out.println("-20~20 : " + num2);
		
		// 1~45 사이의 랜덤수 6개를 배열에 중복없이 오름차순으로 저장하시오.
		// (과제) : 중복제거, 오름차순 정렬
		int arr[] = new int[6];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			int r = (int) (Math.random() * 45 + 1);
			arr[i] = r;
			}
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
