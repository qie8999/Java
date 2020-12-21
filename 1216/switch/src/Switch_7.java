import java.util.Scanner;

public class Switch_7 {

	public static void main(String[] args) {
		System.out.println("----------------------------");
		System.out.println("  담배 자판기 프로그램 v1.0");
		System.out.println("----------------------------");
		System.out.println("원하는 담배를 선택하세요. ");
		System.out.println("1. 에쎄 골든 리프	 : 6000원");
		System.out.println("2. 에쎄 스페셜 골드	:5000원");
		System.out.println("3. 더원 블루 	 : 4500원");
		System.out.println("4. 더원 오렌지 	 : 4500원");
		System.out.println("5. 더원 화이트 	: 4500원");
		System.out.println("----------------------------");
		System.out.print("담배를 선택하세요: ");
		Scanner s = new Scanner(System.in);
		int menu = s.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("에쎄 골든 리프를 선택하셨습니다");
			break;
		case 2:
			System.out.println("에쎄 스페셜 골드를 선택하셨습니다");
			break;
		case 3 :
			System.out.println("더원 블루를 선택하셨습니다");
			break;
		case 4:
			System.out.println("더원 오렌지를 선택하셨습니다");
			break;
		case 5:
			System.out.println("더원 화이트를 선택하셨습니다");
			break;
		}
		
		System.out.println("----------------------------");
		System.out.print("담배 금액을 투입하세요 => ");
		int input = s.nextInt();
		int namg = 0;
		//거스름돈 받아야 되는경우/ 거스름돈이 안 남는 경우 / 추가 보충 금액이 필요한 경우
		switch (menu) {
		case 1 : //6,000
			namg = input - 6000;
			if(namg > 0) {
			System.out.println("에쎄 골든 리프를 구매했습니다. 거스름돈" + namg + "을 받으세요");
			}
			else if (namg == 0) {
				System.out.println("에쎄 골든 리프를 구매했습니다.");
			}
			else {
				System.out.println("추가금액 " + Math.abs(namg) + "을 투입하세요");
			}
				
			break;
		case 2 :
			namg = input - 5000;
			if(namg > 0) {
			System.out.println("에쎄 스페셜 골드를 구매했습니다. 거스름돈" + namg + "을 받으세요");
			}
			else if (namg == 0) {
				System.out.println("에쎄 스페셜 골드를 구매했습니다.");
			}
			else {
				System.out.println("추가금액 " + Math.abs(namg) + "을 투입하세요");
			}
			break;
		case 3 :
			namg = input - 4500;
			if(namg > 0) {
			System.out.println("더원 블루를 구매했습니다. 거스름돈" + namg + "을 받으세요");
			}
			else if (namg == 0) {
				System.out.println("더원 블루를 구매했습니다.");
			}
			else {
				System.out.println("추가금액 " + Math.abs(namg)+ "을 투입하세요");
			}
			break;
		case 4 :
			namg = input - 4500;
			if(namg > 0) {
			System.out.println("더원 오렌지를 구매했습니다. 거스름돈" + namg + "을 받으세요");
			}
			else if (namg == 0) {
				System.out.println("더원 오렌지를 구매했습니다.");
			}
			else {
				System.out.println("추가금액 " + Math.abs(namg) + "을 투입하세요");
			}
			break;
		case 5 :
			namg = input - 4500;
			if(namg > 0) {
			System.out.println("더원 화이트를 구매했습니다. 거스름돈" + namg + "을 받으세요");
			}
			else if (namg == 0) {
				System.out.println("더원 화이트를 구매했습니다.");
			}
			else {
				System.out.println("추가금액 " + Math.abs(namg) + "을 투입하세요");
			}
			break;
		}
		
		

	}

}
