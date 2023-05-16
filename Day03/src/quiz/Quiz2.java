package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int ea = ran.nextInt(15) + 1;
		int eb = ran.nextInt(15) + 1;
		int ec = ran.nextInt(15) + 1;
		int current;
		
		System.out.printf("ea : %d, eb : %d, ec : %d\n", ea, eb, ec);
		
		// ea : 1, eb : 8, ec : 3
		// �Է� : 7
		// ��� : eb ���������Ͱ� �̵��մϴ�
		
		System.out.print("���� �� �Է� : ");
		current = Integer.parseInt(sc.nextLine());
		
		// ���������Ϳ� �������� �Ÿ�(���밪)�� ���Ѵ�
		int distA = current - ea;
		int distB = current - eb;
		int distC = current - ec;
		
		if(distA < 0) {
			distA *= -1;
		}
		if(distB < 0) {
			distB *= -1;
		}
		if(distC < 0) {
			distC *= -1;
		}
		
		// �Ÿ��� �ּҰ��� ���Ѵ�
		// �Ÿ��� �ּҰ��� ���°�� ������ ã�´� (�ּҰ��� ã���� �� �̸��� ������ش�)
		int min = distA;
		String name = "ea";
		
		if(min > distB) {
			min = distB;
			name = "eb";
		}
		if(min > distC) {
			min = distC;
			name = "ec";
		}
		// �ּҰ��� ��ġ�ϴ� ������ ���������� �̸��� ����Ѵ�
		System.out.printf("%s ���������Ͱ� �̵��մϴ�\n", name);
		sc.close();
		
	}
}