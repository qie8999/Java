package loopTest1216;

public class Loop3 {

	public static void main(String[] args) {
		int hap = 0;
		for(int i=0; i<5; i +=2 ) {//=(i=i+2) 2�� �����϶�� ��(Ȧ��)
			hap += (i+1);
		}
		System.out.println("1~10���� Ȧ����: " + hap);

		hap = 0;
		for(int j=0; j<10; j++) {
			if((j+1)%2 == 1) {
			hap += (j+1);
			}
		}
		System.out.println("1~10���� Ȧ����: " + hap);
	}

}
