package scanner;

public class Boolean {

	public static void main(String[] args) {
		
		byte a =127;//byte�� -128~127������ ������ �� �� ���� �ִ�
		short b =32767;//32767������ ������ ����
		int c =2147483647; //��������� ������ ���� �ܿ� �ʿ�� ����
		long d = 2147483648l;//long�� ���� �ڿ� l�� �ٿ���� �Ѵ�.
		
		
		System.out.println(d);//d�� �ξ� �� ū ���ڱ��� ����� �� ���� �ִ�
		
		//2����, 8����, 16������ ���ؼ��� ������ ���� �ִ�
		//2������ ������ ���� ���� �տ� 0b�� �ٿ��ش�
		int bin =0b1010;//2���� 1010���� �����Ѵ�
		System.out.println("2����1010 : "+ bin);
		
		//8���� ������ ���� ���� �տ� 0�� ���δ�
		int octa =064;
		System.out.println("8����064 : " + octa);
		
		//16������ 0x�� ���δ�
		int hexa =0x3a4c;   //a=10 b=11 c=12 d=13 e=14 f=15
		System.out.println("16����0x3a4c :" + hexa);
		
		
		System.out.println("-----------------------------------");
		float f1 = 3.14f;
		double d1 =3.14;
		
		float f2 = 1.234567891234f;
		double d2 =1.234567891234;
		
		System.out.println(f2);//�Ҽ��� 7�ڸ����� ��ȿ��
		System.out.println(d2);//�Ҽ��� 13�ڸ����� ��ȿ�� 
		
		
	
	
		

	}

}
