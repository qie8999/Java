import java.util.Scanner;

public class LoopEx1_1 {

	public static void main(String[] args) {
		System.out.println("---------------------------");
		System.out.println("  ¦��, Ȧ�� ���� ���α׷� v1.0 ");
		System.out.println("---------------------------");
		int i = 0;
		int num = 0;
		Scanner s = new Scanner(System.in);
		

		while (i < 2) {
			System.out.print((i + 1) + ". Num ==>");
			num = s.nextInt();
			if (num % 2 == 0) {
				System.out.println("¦���Դϴ�");
			} else {
				System.out.println("Ȧ���Դϴ�");
			}
			i++;
		}
	}
}
