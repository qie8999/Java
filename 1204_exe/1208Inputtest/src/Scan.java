import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.print("�̸� �Է� > ");
		String name = s.nextLine();
		
		System.out.print("���� �Է�> ");
		int age = s.nextInt();
		
		System.out.print("ü�� �Է�> ");
		double mom = s.nextDouble();
		
		System.out.print("Ű �Է�> ");
		float ki = s.nextFloat();
		s.close();

	}

}
