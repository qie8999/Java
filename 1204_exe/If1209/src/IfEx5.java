import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println(" ���� ���� ���α׷� v1.0 ");
		System.out.println("-----------------------");
		Scanner s = new Scanner (System.in);
		
		System.out.print("1. ���� ���� �Է� => ");
		int guk = s.nextInt();
		
		System.out.print("2. ���� ���� �Է� => ");
		int yeong = s.nextInt();
		
		System.out.print
		("3. ���� ���� �Է� => ");
		int su = s.nextInt();
		
		int sum = guk + yeong + su;
		System.out.println("���� "+ sum);
		int ave = (guk + yeong + su)/3;
		System.out.println("��� " + ave);
		
		
		if(ave >= 90 && ave <= 100) {
			System.out.println("������ A�Դϴ�");
		}
		else if(ave >= 80 && ave <= 89){
			System.out.println("������ B�Դϴ�");
		}
		else if(ave >= 70 && ave <= 79) {
			System.out.println("������ C�Դϴ�");
		}
		else if(ave >= 60 && ave <= 69) {
			System.out.println("������ D�Դϴ�");
		}
		else if(ave >= 50 && ave <= 59) {
			System.out.println("������ E�Դϴ�");
		}
		else if(ave >= 0 && ave <= 49) {
			System.out.println("������ F�Դϴ�");
		}

		s.close();
		
	}

}
