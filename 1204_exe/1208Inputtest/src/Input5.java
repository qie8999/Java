import java.util.Scanner;


public class Input5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 : ");
		int guk = scan.nextInt();
		
		System.out.print("영어 : ");
		int yeong = scan.nextInt();
		
		System.out.print("수학 : ");
		int su = scan.nextInt();
		
		System.out.print("과학 : ");
		int gua = scan.nextInt();
		
		int sum = guk + yeong + su + gua;
		float ave = sum / 4;
		
		System.out.println("총점 : " + sum);
		System.out.println("합계 : " + ave);
		
		scan.close();

	}

}
