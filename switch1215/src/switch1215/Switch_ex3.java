package switch1215;

import java.util.Scanner;

public class Switch_ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);


		System.out.println("1. 에쎄 골든 리프  6,000원");
		System.out.println("2. 에쎄 스페셜 골드   5,000원");
		System.out.println("3. 더원 블루    4,500원");
		System.out.println("4. 더원 오렌지   4,500원");
		System.out.println("5. 더원 화이트    4,500원");
		System.out.println("----------------------");
		int one=6000, two=5000, three=4500, four=4500, five=4500;
			
		
		System.out.print("담배를 선택하세요 =>" );
		int sig = s.nextInt();
		switch(sig) {
		case 1 :System.out.println("에쎄 골든 리프를 선택하셨습니다");
		break;
		case 2 :System.out.println("에쎄 스페셜 골드를 선택하셨습니다");
		break;
		case 3 :System.out.println("더원 블루를 선택하셨습니다");
		break;
		case 4 :System.out.println("더원 오렌지를 선택하셨습니다");
		break;
		case 5 :System.out.println("더원 화이트를 선택하셨습니다");
		break;
		default:
			break;}
		
		
			System.out.println("----------------------");
		System.out.print("담배 금액을 입금하세요 =>");
		int money = s.nextInt();
		switch(sig) {
		case 1 :System.out.println("에쎄 골든 리프를 구매하셨습니다. 거스름돈" + (money-one) + "원을 받으세요");  
		break;
		case 2 :System.out.println("에쎄 스페셜 골드를 구매하셨습니다. 거스름돈" +(money-two) + "원을 받으세요 "); 
		break;
		case 3 :System.out.println("더원 블루를 구매하셨습니다. 거스름돈" +(money-three) + "원을 받으세요 ");
		break;
		case 4 :System.out.println("더원 오렌지를 구매하셨습니다. 거스름돈" +(money-four) + "원을 받으세요 ");
		break;
		case 5 :System.out.println("더원 화이트를 구매하셨습니다. 거스름돈" +(money-five) + "원을 받으세요 ");
		break;
		
		}
		
		s.close();

	}

	}

