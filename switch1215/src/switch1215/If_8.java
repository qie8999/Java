package switch1215;

import java.util.Scanner;

public class If_8 {

	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("���� ���� ���α׷� v1.0");
		System.out.println("-------------------");
		System.out.println(" 100 ~ 90 : A���� ");
		System.out.println(" 89 ~ 80 : B���� ");
		System.out.println(" 79 ~ 70 : C���� ");
		System.out.println(" 69 ~ 60 : D���� ");
		System.out.println(" 59 ~ 0 : F���� ");
		System.out.println("-------------------");
		
		Scanner s = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int guk = s.nextInt();
		System.out.print("���� ���� �Է� : ");
		int yeong = s.nextInt();
		System.out.print("���� ���� �Է� : ");
		int su = s.nextInt();
		
		int hap = guk + yeong + su ;
		int ave = hap / 3 ;
		System.out.println("����" + hap );
		System.out.println("���" + ave );
		
		if(ave <=100 && ave >= 90 ) {
			System.out.println("������ A�Դϴ�");
		}
		else if(ave <= 89 && ave >= 80 ) {
			System.out.println("������ B�Դϴ�");
		}	
		else if(ave <= 79 && ave >= 70 ) {
			System.out.println("������ C�Դϴ�");
		}
		else if(ave <= 69 && ave >= 60 ) {
			System.out.println("������ D�Դϴ�");
		}
		else if(ave <= 59 && ave >= 0) {
			System.out.println("������ F�Դϴ�");
		}
		s.close();
		

		
		
	}

}
