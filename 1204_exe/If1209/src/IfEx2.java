import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println(" 홀짝 판단 프로그램 v1.0 ");
		System.out.println("-------------------");
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 =>");
		int num1 = s.nextInt();
		
		if(num1 % 2 == 1) {
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		else {
			System.out.println("입력한 숫자는 짝수입니다.");
		}
		
		
		
		
		
		s.close();

	}

}
