import java.util.Scanner;

public class If5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("------------------");
		System.out.println("���� ���� �� ���� 1.0 ");
		System.out.println("------------------");
		
		System.out.print("ȫ�浿 �Է� : ");
		String hong = s.next();
		System.out.print("��浿 �Է� : ");
		String kim = s.next();
		
		//if (hong =="����" ) �� �ȵȴ�
		if(hong.equals("����")) {//���� ���� ���� equals ���
			if(kim.equals("����")) {
				System.out.println("�����ϴ�.");
			}
			else if(kim.equals("����" )) {
				System.out.println("��浿�� �̰���ϴ�.");
				}
			else if (kim.equals("��")){
				//else if�� ó���ϴ°� �� ������
				System.out.println("ȫ�浿�� �̰���ϴ�");
			}
		}
		
		else if(hong.equals("����")) {//���� ���� ���� equals ���
			if(kim.equals("����")) {
				System.out.println("ȫ�浿�� �̰���ϴ�.");
			}
			else if(kim.equals("����" )) {
				System.out.println("�����ϴ�.");
				}
			else if (kim.equals("��")){
				System.out.println("��浿�� �̰���ϴ�.");
			}
		}
		
		else {//���� ���� ���� equals ���
			if(kim.equals("����")) {
				System.out.println("��浿�� �̰���ϴ�.");
			}
			else if(kim.equals("����" )) {
				System.out.println("ȫ�浿�� �̰���ϴ�.");
				}
			else if (kim.equals("��")){
				System.out.println("�����ϴ�.");
			}
		}
		
s.close();
	}

}
