import java.util.Scanner;

public class Optest6 {

	public static void main(String[] args) {
		
		int coin500 = 0;
		int coin100 = 0;
		int coin50 = 0;
		int coin10 = 0;
		
		
		Scanner s = new Scanner (System.in);
		System.out.print("�ݾ��� �Է��ϼ���: ");
		int input = s.nextInt();
		//�˰����� ����鼭 �Ұ�
		coin500 = input / 500;
		int namg =input % 500;
		System.out.println("500�� ������ : " + namg );
		
		coin100 = namg/ 100;
		namg = namg % 100; // namg %= 100;
		System.out.println("100�� ������ : " + namg);
		
		coin50 = namg/ 50;
		namg = namg % 50;
		System.out.println("50�� ������ : " + namg);

		
		coin10 = namg/ 10;
		namg = namg % 10;
		System.out.println("10�� ������ : " + namg);
		
		
		
		
		
		System.out.println("-------------------");
		System.out.println("���� ��ȯ�� ���α׷� 1.0");
		System.out.println("--------------------");
		System.out.println("����� ����	: " + coin500 + " ��");
		System.out.println("��� ����		: "+ coin100 + " ��");
		System.out.println("���ʿ� ����	: " + coin50 + "��");
		System.out.println("�ʿ� ����		: " + coin10 + "��");
		System.out.println("�ٲ��� ���� �ܵ�	: ?��");
		System.out.println("-------------------");
		
		
		
		
		s.close();
		
	}

}
