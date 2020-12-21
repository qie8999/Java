import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println(" 학점 관리 프로그램 v1.0 ");
		System.out.println("-----------------------");
		Scanner s = new Scanner (System.in);
		
		System.out.print("1. 국어 점수 입력 => ");
		int guk = s.nextInt();
		
		System.out.print("2. 영어 점수 입력 => ");
		int yeong = s.nextInt();
		
		System.out.print
		("3. 수학 점수 입력 => ");
		int su = s.nextInt();
		
		int sum = guk + yeong + su;
		System.out.println("총점 "+ sum);
		int ave = (guk + yeong + su)/3;
		System.out.println("평균 " + ave);
		
		
		if(ave >= 90 && ave <= 100) {
			System.out.println("학점은 A입니다");
		}
		else if(ave >= 80 && ave <= 89){
			System.out.println("학점은 B입니다");
		}
		else if(ave >= 70 && ave <= 79) {
			System.out.println("학점은 C입니다");
		}
		else if(ave >= 60 && ave <= 69) {
			System.out.println("학점은 D입니다");
		}
		else if(ave >= 50 && ave <= 59) {
			System.out.println("학점은 E입니다");
		}
		else if(ave >= 0 && ave <= 49) {
			System.out.println("학점은 F입니다");
		}

		s.close();
		
	}

}
