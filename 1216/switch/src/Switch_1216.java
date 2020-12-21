import java.io.IOException;
import java.util.Scanner;

public class Switch_1216 {

	public static void main(String[] args) throws IOException {
		System.out.println("----------------------------");
		System.out.println("  식당메뉴 자동주문 프로그램 v1.0");
		System.out.println("----------------------------");
		System.out.println("원하는 식사를 선택하세요. ");
		System.out.println("a. 김치찌개 : 5000원");
		System.out.println("b. 된장찌개 : 5000원");
		System.out.println("c. 칼국수   : 4500원");
		System.out.println("d. 잔치국수 : 4000원");
		System.out.println("e. 비빔밥   : 5000원");
		System.out.println("----------------------------");
		System.out.print("메뉴를 선택하세요: ");
		Scanner s = new Scanner(System.in);
		char ch = (char) System.in.read();
		System.out.print("입력받은 문자: " + ch);

		switch (ch) {
		case 'a':
			System.out.println("김치찌개를 주문했습니다");
			break;
		case 'b':
			System.out.println("된장찌개를 주문했습니다");
			break;
		case 'c':
			System.out.println("칼국수를 주문했습니다");
			break;
		case 'd':
			System.out.println("잔치국수를 주문했습니다");
			break;
		case 'e':
			System.out.println("비빔밥을 주문했습니다");
			break;
		default:
			System.out.println("잘못된 메뉴를 주문했습니다");
		}

		
		
	}

}
