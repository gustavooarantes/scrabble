package scrabble;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Player one:");
		String  wordOne = scanner.nextLine();
		System.out.println("Player two:");
		String wordTwo = scanner.nextLine();
		
		int scoreOne = computeScore(wordOne);
		int scoreTwo = computeScore(wordTwo);
		
		if (scoreOne > scoreTwo) {
			System.out.println("Player one wins!");
		} else if (scoreTwo > scoreOne) {
			System.out.println("Player two wins!");
		} else {
			System.out.println("Tie!");
		}
		
	}
	
	public static int computeScore(String word) {
		int score = 0;
		int POINTS[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
		
		char[] ch = word.toCharArray();
		
		for (int i = 0, len = word.length(); i < len; i++) {
			if (Character.isUpperCase(ch[i])) {
				score += POINTS[ch[i] - 'A'];
			} else if (Character.isLowerCase(ch[i])) {
				score += POINTS[ch[i] - 'a'];
			}
		}
		
		return score;
	}

}
