package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// ����ö �� ���� �� �� 3���� �ð��� �ҿ�ȴٰ� �����Ѵ�
		// �̵��� ����ö ���� ���� �Է¹޾Ƽ�
		// �ɸ� �ð��� ����ϼ���
		// ��, �ð��� 60���� �ʰ��ϸ�, �ð��� ������ ����� ����ϰ�
		// 60�� �����̸�, �����θ� ����ϼ���
		// ���ڿ��� ������ �����ϱ� ���ؼ�, String.format(format, args...) �Լ��� ���
		
		int station;
		String result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̵��� ����ö ���� ��  : ");
		station = Integer.parseInt(sc.nextLine());
		
		int time = station * 3;
		if(time >= 60) {
			result = String.format("�ҿ�ð� : %d�ð� %d�� ", time / 60, time % 60);
		}
		else {
			result = String.format("�ҿ�ð� : %d�� ", time);
		}
		System.out.println(result);
		sc.close();
	}
}