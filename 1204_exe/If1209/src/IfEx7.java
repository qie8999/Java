import java.util.Scanner;

public class IfEx7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("------------------");
		System.out.println("���� ���� �� ���� 1.0 ");
		System.out.println("------------------");

		System.out.print("ȫ�浿 �Է� => ");
		String hong = s.nextLine();

		System.out.print("��浿 �Է� => ");
		String kim = s.nextLine();

		if (hong.equals("����")) {
			if (kim.equals("����")) {
				System.out.println("�����ϴ�.");
			} else if (kim.equals("����")) {
				System.out.println("��浿�� �̰���ϴ�.");
			} else if (kim.equals("��")) {
				System.out.println("ȫ�浿�� �̰���ϴ�.");
			}
		} else if (hong.equals("����")) {
			if (kim.equals("����")) {
				System.out.println("ȫ�浿�� �̰���ϴ�.");
			} else if (kim.equals("����")) {
				System.out.println("�����ϴ�.");
			} else if (kim.equals("��")) {
				System.out.println("��浿�� �̰���ϴ�.");
			}
		} else if (hong.equals("��")) {
			if (kim.equals("����")) {
				System.out.println("��浿�� �̰���ϴ�.");
			} else if (kim.equals("����")) {
				System.out.println("ȫ�浿�� �̰���ϴ�.");
			} else if (kim.equals("��")) {
				System.out.println("�����ϴ�.");
			}
		}

		s.close();

	}

}
