import java.util.Scanner;

public class Input4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("원주율 : 3.14");
		float PI = 3.14f;
		
		System.out.print("반지름 : ");
		float banjirem = scan.nextFloat();
		
		System.out.println("원의 면적 : " +banjirem*banjirem*PI );
		
	    scan.close();

	}

}
