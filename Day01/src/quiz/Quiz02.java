package quiz;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		/*
		 * 	�� ������ ������ �������·� �Է¹ް�, �̸��� ���ڿ��� �Է¹�������
		 * 	�׷� ����, ������ �հ�� ����� ���մϴ�
		 * 	�̶�, ����� �Ǽ����·� �Ҽ��� ��°�ڸ����� ����� �� �ֵ��� �غ��ϼ���
		 * 
		 * 	��� �غ� ������ �̸��� �հ�� ��ո� ����մϴ�
		 * 
		 * 	�߰�����) boolean Ÿ���� ������ �����Ͽ�, ����� 60�� �̻����� �ƴ��� �Ǻ��Ͽ�
		 * 	����� ����ϼ���
		 * 	�հݿ��� : true
		 */
		
		// ����� ���� : F11
		// �ߴ��� ���� : Ctrl + Shift + b
		// ���� �ڵ� ���� : F5(Step into), F6(Step over)
		// ���(�ݺ���)���� ���� ��ȭ�� �����ϱ� ���ؼ� ����� �� ����
		
		// 1) ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, total;
		double avg;
		boolean pass;
		
		// 2) �Է�
		System.out.print("�̸� �Է� : ");
		name = sc.nextLine();
		
		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(sc.nextLine());
		
		System.out.print("���� ���� �Է� : ");
		mat = Integer.parseInt(sc.nextLine());
		
		// 3) ����
		total = kor + eng + mat;
		avg = total / 3.0;
		pass = avg >= 60;
		
		// 4) ���
		System.out.printf("%s�� �հ� : %d, ��� : %.2f\n", name, total, avg);
		System.out.println("�հ� ���� : " + pass);
		
		// 5) ������
		sc.close();
	}
}