import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ : 3.14");
		float PI = 3.14f;
		
		System.out.print("������ : ");
		float banjirem = scan.nextFloat();
		
		System.out.println("���� ���� : " +banjirem*banjirem*PI );
		
	    scan.close();

	}

}
