package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// ���̱ⱸ �̿� �ð��� ���� �̿� ����� ����Ϸ��� �Ѵ�
		// �⺻ ����� 3000�� �̸�, 10�и��� 500���� �߰������ �߻��Ѵ�
		// ���ǥ�� ������ ����
		//  0 ~ 30	: 3000
		// 31 ~ 40	: 3500	1~10
		// 41 ~ 50	: 4000	11~20
		// 51 ~ 60	: 4500
		// ...
				
		// �ݺ��� ��� ����, if�� �̿��Ͽ� �ð��� �� ������ �Է¹ް�, ����� ����Ͽ� ����ϼ���
		int time, money = 0;
		int basic = 3000;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̱ⱸ �̿� �ð� : ");
		time = Integer.parseInt(sc.nextLine());
		int addtime = time - 30;
		if((addtime % 10) <= 9 ) {
			money = basic + 500; 
		}
		System.out.println("���̱ⱸ �̿� ��� : " + money);
		sc.close();
	}
}
