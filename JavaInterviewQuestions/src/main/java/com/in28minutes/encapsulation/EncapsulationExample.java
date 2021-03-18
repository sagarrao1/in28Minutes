package com.in28minutes.encapsulation;

class CricketScorer1 {
	private int score = 0;

	public int getScore() {
		return score;
	}

	public void addRuns(int score) {
		this.score = this.score + score;
	}

	public void six() {
		addRuns(6);
	}

	public void four() {
		addRuns(4);
	}

	public void single() {
		addRuns(1);
	}

	public void printScore() {
		System.out.println("Score : " + score);
	}

}

public class EncapsulationExample {
	public static void main(String[] args) {
		CricketScorer1 scorer = new CricketScorer1();
		scorer.four();
		scorer.four();
		scorer.single();
		scorer.six();
		scorer.six();
		scorer.six();
		scorer.printScore();
	}
}