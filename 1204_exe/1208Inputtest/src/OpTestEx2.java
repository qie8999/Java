import java.util.Scanner;

public class OpTestEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----------------------");
		System.out.println("  ���� ��ȯ�� ���α׷� 1.0  ");
		System.out.println("----------------------");
		
		System.out.print("���� : ");
		int money = scan.nextInt();
		
		int oback =money / 500 ;
		System.out.println("����� ¥�� : " + oback );
		
		int back = (money- (500*oback)) / 100;
		System.out.println("��� ¥�� : " + back );
		
		int osip = (money- (500*oback)-(100*back)) / 50;
		System.out.println("���ʿ� ¥�� : " + osip );
		
		int sip = (money -(500*oback)-(100*back)-(50*osip))/ 10;
		System.out.println("�ʿ� ¥�� : " + sip);
		
		int one = money % 10 ;
		System.out.println("�ٲ��� ���� �ܵ� : " + one);
		
		System.out.println("----------------------");
		
		scan.close();
		
		

	}

}
