package switch1215;

public class Switch_4 {

	public static void main(String[] args) {
		//Math ���� Ŭ����
		//( 0 ~ 3 ) + 8 = 8,9,10,11
		int time = (int)(Math.random()*4)+8;
		System.out.println("����ð�: " + time );
		switch (time) {
		//Math ���� Ŭ����, random()�޽��
		case 8 :
			System.out.println("���");
		case 9 :
			System.out.println("ȸ��");
		case 10:
			System.out.println("����");
		default :
			System.out.println("����");
		}
		

	}

}
