package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1) ������ �Է¹޾Ƽ� ���밪�� ����ϱ�
		int n1;
		System.out.print("���� �Է� : ");
		n1 = Integer.parseInt(sc.nextLine());
		
		if(n1 < 0) {
			n1 = -n1;
		}
		System.out.println("n1 : " + n1);
		System.out.println();
		
		// 2) �� ������ �Է¹޾Ƽ� ���� ���� ����ϱ�
		int n2, n3;
		System.out.print("����1 �Է� : ");
		n2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("����2 �Է� : ");
		n3 = Integer.parseInt(sc.nextLine());
		
		if(n2 < n3) {
			System.out.println("������ : " + n2);
		}
		else {
			System.out.println("������ : " + n3);
		}
		System.out.println();
		
		// 3) �� ������ �Է¹޾Ƽ� ���� ���� ���� ����ϱ�
		int n4, n5, n6, min;
		System.out.print("����3 �Է� : ");
		n4 = Integer.parseInt(sc.nextLine());
		
		System.out.print("����4 �Է� : ");
		n5 = Integer.parseInt(sc.nextLine());
		
		System.out.print("����5 �Է� : ");
		n6 = Integer.parseInt(sc.nextLine());
		
		min = n4;
		if(min > n5) {
			min = n5;
		}
		if(min > n6) {
			min = n6;
		}
		System.out.println("���� ���� �� : " + min);
		System.out.println();
		
		
		// 4) ������ ������ 1���� 20���̿� ���ԵǸ� true, �ƴϸ� false ����ϱ�
		int n7;
		System.out.print("���� �Է�  (1 ~ 20) : ");
		n7 = Integer.parseInt(sc.nextLine());
		
		boolean flag = 1 <= n7 && n7 <= 20;
		System.out.println(flag);
		
		sc.close();
	}
}