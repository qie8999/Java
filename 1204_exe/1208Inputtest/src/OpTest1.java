
public class OpTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =2, num2 =3, num3 =4;
		//������ �켱������ 
		//*,/�� +,- ���� ����. ���� ������ �������� �������� ���
		int result = num1 + num2 - num3;
		System.out.println("result : " + result);
		
		//��ȣ ���� ó��
		int result2 =  num1 + (num2 - num3);
		System.out.println("result2 : " + result2);
		
		//*,/�� +,-���� �켱���� //���п� ����� �켱������ ���� ����� �ش�
		result = num1 + num2 * num3;
		System.out.println("result : " + result);

		result = (num1 + num2) * num3;
		System.out.println("result : " + result);
		
		result =num1 * num2 / num3;
		System.out.println("result : " + result);
		
		//%������ ������ 4 % 3 (4�� 3���� ���� ������)
		// x % 2 --> 0, 1
		// x % 3 --> 0, 1, 2 
		// x % 4 --> 0, 1, 2, 3
		
		result =10 % 3;
		System.out.println("result : " + result);
		
		
		
		
		
		
	}

}
