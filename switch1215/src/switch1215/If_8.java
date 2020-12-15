package switch1215;

import java.util.Scanner;

public class If_8 {

	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("학점 관리 프로그램 v1.0");
		System.out.println("-------------------");
		System.out.println(" 100 ~ 90 : A학점 ");
		System.out.println(" 89 ~ 80 : B학점 ");
		System.out.println(" 79 ~ 70 : C학점 ");
		System.out.println(" 69 ~ 60 : D학점 ");
		System.out.println(" 59 ~ 0 : F학점 ");
		System.out.println("-------------------");
		
		Scanner s = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int guk = s.nextInt();
		System.out.print("영어 점수 입력 : ");
		int yeong = s.nextInt();
		System.out.print("수학 점수 입력 : ");
		int su = s.nextInt();
		
		int hap = guk + yeong + su ;
		int ave = hap / 3 ;
		System.out.println("총점" + hap );
		System.out.println("평균" + ave );
		
		if(ave <=100 && ave >= 90 ) {
			System.out.println("학점은 A입니다");
		}
		else if(ave <= 89 && ave >= 80 ) {
			System.out.println("학점은 B입니다");
		}	
		else if(ave <= 79 && ave >= 70 ) {
			System.out.println("학점은 C입니다");
		}
		else if(ave <= 69 && ave >= 60 ) {
			System.out.println("학점은 D입니다");
		}
		else if(ave <= 59 && ave >= 0) {
			System.out.println("학점은 F입니다");
		}
		s.close();
		

		
		
	}

}
