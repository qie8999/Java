import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력: ");
		int num = s.nextInt(); 
		//홀짝 체크하기
		
		//2의 배수인지? 아닌지로 알아내는 방법도 있다
		// %가 실제 많이 활용됨
		if(num % 2 == 1 ) {
			System.out.println("홀수입니다.");
		}
		else {
			System.out.println("짝수입니다.");
		}
			
		
		s.close();
	}

}
