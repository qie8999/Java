import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		// Scanner 객체 생성(s) system.in은 입력한다는 뜻 system.out은 출력
		
		Scanner s =new Scanner(System.in);
		//입력을 위해 스캐너 개체를 사용한다는 의미
		System.out.print("이름 입력 :");
		//키보드로 문자 입력받음
		String name = s.nextLine();
		//정수 입력받음
		System.out.print("나이 입력 :");
		int age =s.nextInt();
		
		System.out.println("이름 정보 : " + name);
		System.out.println("나이 정보 : " + age);
		
		s.close();
		

	}

}
