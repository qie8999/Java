import java.util.Random;

public class LoopEx3 {

	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println(" ������ �ζ� ���α׷� v1.0  ");
		System.out.println("-----------------------");

		int i = 0;
		int num = 0;
		while (i < 5) {
			Random rand = new Random();
			num = rand.nextInt(45) + 1;
			System.out.println(num + 1);
			i++;
		}
		

	}

}