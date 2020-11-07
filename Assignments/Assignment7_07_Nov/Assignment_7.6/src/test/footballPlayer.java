package test;

public class footballPlayer extends Person {

	private int matchPlayed;
	private int goatsPerMatch;
	public footballPlayer(String name, double income, int matchPlayed, int goatsPerMatch) {
		super(name, income);
		this.matchPlayed = matchPlayed;
		this.goatsPerMatch = goatsPerMatch;
	}
	public int getMatchPlayed() {
		return matchPlayed;
	}
	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}
	public int getGoatsPerMatch() {
		return goatsPerMatch;
	}
	public void setGoatsPerMatch(int goatsPerMatch) {
		this.goatsPerMatch = goatsPerMatch;
	}
	@Override
	public String toString() {
		return "footballPlayer " + this.getName() +  " matchPlayed=" + matchPlayed + ", goatsPerMatch=" + goatsPerMatch + " income = " + this.getIncome();
	}
	@Override
	public void calculateIncome() {
		
		this.income = (8000 * this.getMatchPlayed()) + (3000 * this.goatsPerMatch);
		
		
		
	}
	
	
	
	
}
