package loopTest1216;

public class Loop8{

	public static void main(String[] args) {
	 	int hap = 0;
		for (int i=1; i<=10; i++) {
			if(i % 3 == 0) {
				//continue�� ������ ���� �������� �ʰ� 
				//�ݺ��� ó������ �̵�
				continue;
			}
			System.out.println("i" + i);
			hap += i;
			
			if(i==5) {
				System.out.println("Ż��");
				break;
			}
		}
		System.out.println("1~10���� 3�� ����� ������ �� : " + hap);

	}

}