import java.util.Scanner;

public class LoopEx1_3 {

	public static void main(String[] args) {
		System.out.println("---------------------------");
		System.out.println("  짝수, 홀수 구분 프로그램 v1.0 ");
		System.out.println("---------------------------");
		Scanner s = new Scanner(System.in);
		int i = 0;
		int num = 0;
		
		do {
			System.out.println((i+1)+ ". Num ==>" );
			num= s.nextInt();
			if((num%2) == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
					i++;
		} while(i<5);
		

	}

}
