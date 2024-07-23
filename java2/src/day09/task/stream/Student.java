package day09.task.stream;

public class Student {
	String name;
	int[] scoreWritten;
	Integer scorePractical;

	public Student(String name, int[] scoreWritten, Integer scorePratical) {
		this.name = name;
		this.setScoreWritten(scoreWritten);
		this.scorePractical = scorePratical;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScoreWritten() {
		return scoreWritten;
	}

	public void setScoreWritten(int[] scoreWritten) {
		this.scoreWritten = new int[5];
		if (scoreWritten.length == 5) {
			this.scoreWritten = scoreWritten;
		}
	}

	public Integer getScorePractical() {
		return scorePractical;
	}

	public void setScorePractical(Integer scorePractical) {
		this.scorePractical = scorePractical;
	}

}
