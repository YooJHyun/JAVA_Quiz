package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 *		�� ������ �Է¹޾Ƽ� �հ踦 ���ϰ�,
		 *		a + b = c �� �������� 
		 *		������ ������ ������ ȭ�鿡 ������ּ��� 		
		 */
		
		// 1) �ڵ带 �����ϱ� ���� �ʿ��� ������ �����̰�, ����� �ľ�
		Scanner sc = new Scanner(System.in);
		int n1, n2, answer;
		
		// 2) �������� ������ �ʱⰪ���� �ִ´� (���)
		//	    �Է°��� �޾Ƽ� ������ �����Ѵ�
		System.out.print("ù��° ���� �Է� : ");
		n1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("�ι�° ���� �Է� : ");
		n2 = Integer.parseInt(sc.nextLine());
		
		// 3) ������ �ʿ��� ���� �Է� ���� ó���Ѵ�
		answer = n1 + n2;
		
		// 4) �ʿ��� ���� ����Ѵ� (�߰��� ������ �����ص� �ȴ�)
		System.out.println(n1 + " + " + n2 + " = " + answer);
		
		// 5) �ڵ尡 ����Ǳ� �� ������ �۾��� �����Ѵ�
		sc.close();
	}
}