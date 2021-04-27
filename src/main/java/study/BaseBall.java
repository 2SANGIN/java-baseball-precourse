package study;

import java.util.List;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		ScoreBoard scoreBoard = new ScoreBoard();
		Pitcher pitcher = new Pitcher();
		Batter batter = new Batter();

		Scanner sc = new Scanner(System.in);
		List<Integer> pitches = pitcher.pitch(3);

		System.out.println("Play Ball!!!");
		Score score = Score.nothing();
		int count = 1;
		while (!Score.threeStrike().equals(score)) {
			System.out.printf("[%d] 숫자를 입력해주세요: ", count++);
			List<Integer> swings = batter.swingBat(sc.next());
			score = scoreBoard.countScore(swings, pitches);
			System.out.println(score);
		}
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
	}
}
