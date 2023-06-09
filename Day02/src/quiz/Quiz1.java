package quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 지하철 한 구간 당 약 3분의 시간이 소요된다고 가정한다
		// 이동한 지하철 구간 수를 입력받아서
		// 걸린 시간을 출력하세요
		// 단, 시간이 60분을 초과하면, 시간과 분으로 나누어서 출력하고
		// 60분 이하이면, 분으로만 출력하세요
		// 문자열의 형식을 지정하기 위해서, String.format(format, args...) 함수를 사용
		
		int station;
		String result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이동한 지하철 구간 수  : ");
		station = Integer.parseInt(sc.nextLine());
		
		int time = station * 3;
		if(time >= 60) {
			result = String.format("소요시간 : %d시간 %d분 ", time / 60, time % 60);
		}
		else {
			result = String.format("소요시간 : %d분 ", time);
		}
		System.out.println(result);
		sc.close();
	}
}