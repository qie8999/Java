package switch1215;

public class Switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade ='A';//����
		switch (grade) {//���ڶǴ� ���ڿ�, ���ڰ��� ��
		case 'A':
			System.out.println("A����");//���
			break;//Ż��
		case 'B' :
			System.out.println("B����");
			break;
		case 'c':
			System.out.println("C����");
			break;
		default:
			System.out.println("F����");
			break; //������ �ͼ� default�� ������ ���� �ȵ�
		
		}

	}

}
