package quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 놀이기구 이용 시간에 따른 이용 요금을 계산하려고 한다
		// 기본 요금은 3000원 이며, 10분마다 500원의 추가요금이 발생한다
		// 요금표는 다음과 같다
		//  0 ~ 30	: 3000
		// 31 ~ 40	: 3500	1~10
		// 41 ~ 50	: 4000	11~20
		// 51 ~ 60	: 4500
		// ...
				
		// 반복문 사용 없이, if를 이용하여 시간을 분 단위로 입력받고, 요금을 계산하여 출력하세요
		int time, money = 0;
		int basic = 3000;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("놀이기구 이용 시간 : ");
		time = Integer.parseInt(sc.nextLine());
		int addtime = time - 30;
		if((addtime % 10) <= 9 ) {
			money = basic + 500; 
		}
		System.out.println("놀이기구 이용 요금 : " + money);
		sc.close();
	}
}
