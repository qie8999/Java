import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------");
		System.out.println(" �⵵�� ���� ���� ���α׷� v1.0 ");
		System.out.println("-------------------------");
		Scanner s = new Scanner(System.in);
		System.out.print("�⵵ �Է� = ");
		int year = s.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ������ �ƴմϴ�.");
		}

		s.close();

	}

}
