package loopTest1216;

public class Loop6 {

	public static void main(String[] args) {
		int hap = 0;
		int i = 0; //�ʱⰪ
		while (i<10) {
			hap = hap + (i+1);
			i++;
		}
		System.out.println("1~10���� ��: " + hap);
		
		hap = 0;
		i = 0;
		
		do {
			hap += (i+1);
			i++;
		} while (i<10);
		System.out.println("1~10���� ��2: " + hap);

	}

}
