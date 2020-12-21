import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.print("이름 입력 > ");
		String name = s.nextLine();
		
		System.out.print("나이 입력> ");
		int age = s.nextInt();
		
		System.out.print("체중 입력> ");
		double mom = s.nextDouble();
		
		System.out.print("키 입력> ");
		float ki = s.nextFloat();
		s.close();

	}

}
