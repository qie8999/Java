import java.util.Scanner;


public class Input5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� : ");
		int guk = scan.nextInt();
		
		System.out.print("���� : ");
		int yeong = scan.nextInt();
		
		System.out.print("���� : ");
		int su = scan.nextInt();
		
		System.out.print("���� : ");
		int gua = scan.nextInt();
		
		int sum = guk + yeong + su + gua;
		float ave = sum / 4;
		
		System.out.println("���� : " + sum);
		System.out.println("�հ� : " + ave);
		
		scan.close();

	}

}
