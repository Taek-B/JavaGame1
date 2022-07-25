package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.*;

public class Game {
	// 가위, 바위, 보 객체를 objects 배열에 저장
	GameObject[] objects = { new Scissor(), new Rock(), new Paper() };
	Random random = new Random();
	Scanner scan = new Scanner(System.in);

	public void run() {
		System.out.println("삼세판 게임 시작");
		int wins = 0;

		// 삼세판
		for (int i = 1; i <= 3; i++) {
			// 유저 선택
			System.out.printf("%d번째 게임 \n", i);
			System.out.print("가위(0),바위(1),보(2) 중 숫자로 선택 : ");

			GameObject ob1 = objects[scan.nextInt()];
			GameObject ob2 = objects[random.nextInt(objects.length)];

			System.out.println("당신의 선택은 : " + ob1.getName());
			System.out.println("컴퓨터 선택은 : " + ob2.getName());
			
			int score = ob1.compareTo(ob2);
			wins += score;
			
			if (wins == 2) {
				System.out.println("당신의 승리!");
				break;
			} else if (wins == -2) {
				System.out.println("당신의 패배!");
				break;
			}

		}
		// 누가 이겼는지?
		
		if (wins > 0 && wins !=2) {
			System.out.println("당신의 승리!");
		} else if (wins < 0 && wins != -2) {
			System.out.println("당신의 패배!");
		} else if (wins == 0){
			System.out.println("비겼습니다.");
		}
		
		scan.close();

	}

}
