package test;

public class CricketPlayer extends Person {

    private int  matchPlayed;
    private int manOfTheMatch;
	public CricketPlayer(String name, double income, int matchPlayed, int manOfTheMatch) {
		super(name, income);
		this.matchPlayed = matchPlayed;
		this.manOfTheMatch = manOfTheMatch;
	}
	public int getMatchPlayed() {
		return matchPlayed;
	}
	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}
	public int getManOfTheMatch() {
		return manOfTheMatch;
	}
	public void setManOfTheMatch(int manOfTheMatch) {
		this.manOfTheMatch = manOfTheMatch;
	}
	@Override
	public String toString() {
		return "CricketPlayer " + this.getName()  + "  matchPlayed = " + matchPlayed + ", manOfTheMatch = " + manOfTheMatch + " "
				+ " income = " + this.getIncome();
	}
	@Override
	public void calculateIncome() {
		
		this.income = (this.getMatchPlayed() * 10000) + (this.getManOfTheMatch() * 20000); 
		
	}
    
    
	
    
    
}
