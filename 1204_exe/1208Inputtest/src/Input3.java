import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("����Ÿ� �Է� : ");
		double juhang = s.nextDouble();//();�� �޷��ִ� ���� �޼ҵ�
		System.out.print("����� �ֹ��� �� �Է� : ");
		double fuels = s.nextDouble();
		
		double yeonbi =juhang / fuels;//  /�� ������ ������
		//������ ������ ���� �Ҽ����� ������ ��� �յڰ� ���� double�̸� �Ҽ����� ���´�
		System.out.println("���� ���� : " + yeonbi);
				
		s.close();

	}

}
