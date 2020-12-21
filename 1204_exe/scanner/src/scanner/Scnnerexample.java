package scanner;

import java.util.Scanner;

public class Scnnerexample {
	
	public static void main (String[] args) {
		
		//1. 스캐너 기능 생성.
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너가 가지고 있는 기능을 통해서 데이터를 입력 받음.
		
		System.out.println("자기소개>");
		String intro = scan.nextLine();// 공백을 포함하는 문자열 받음
		//<-- 입력받는 구문.이 기능을 만나면 입력 받을수 있는 상태가 된다
		//출력문을 통해서 확인가능
		
		System.out.println("이름>");
		String name = scan.next();//next는 공백을 포함하지 않는다
		
		System.out.println("나이>");
		int age =scan.nextInt();
		
		System.out.println("자기소개: " + intro);
		System.out.println(" 이름: " + name +"나이: " +age );
		
		
		//스캐너 기능 종료
		scan.close();
		
		
		
		
	}

}
