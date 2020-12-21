import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.println(" 대소 비교 프로그램 v1.0 ");
		System.out.println("-------------------");
		System.out.print("숫자1 입력 => ");
		int num1 = s.nextInt();
		System.out.print("숫자2 입력 => ");
		int num2 = s.nextInt();
		
		if (num1 > num2) {
			        System.out.println("num1이 num2보다 크다.");
		}
		else if(num1 <num2) {
			        System.out.println("num2가 num1보다 크다.");      
		}
		else if(num1 == num2) {
					System.out.println("num1과 num2는 같다.");	
		}
		s.close();

	}
	

}
