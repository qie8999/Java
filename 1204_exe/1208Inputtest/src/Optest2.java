
public class Optest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		
		//++,--�� ����������
		//1�� ���� �Ǵ� 1 ����
		num2 = num1++;// ++�� �ڿ� �ִ� ��� 10�� �ٷ� num2�� �Ѿ
		//�׸��� ������ �� �̷� ������ ������ ���� ������ 1�� �߰�����
		System.out.println("num2 : " + num2);
		
		num2 = ++num1;//++�� �տ� �ִ� ��� ���� 1�� �߰��ϰ� num2�� �ѱ��
		System.out.println("num2 : " + num2);
		
		num2 = num1--;//-1�� ������� �ʰ� 12�� �ٷ� num2�� �Ѿ
		System.out.println("num2 : " + num2);

	}

}
