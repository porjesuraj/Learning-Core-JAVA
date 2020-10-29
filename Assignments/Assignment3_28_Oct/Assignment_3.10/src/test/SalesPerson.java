package test;

public class SalesPerson {
	
	int id;
	double earning;
	public SalesPerson(int id, double earning) {
		super();
		this.id = id;
		this.earning = earning;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getEarning() {
		return earning;
	}
	public void setEarning(double earning) {
		this.earning = earning;
	}
	@Override
	public String toString() {
		return "SalesPerson [id=" + id + ", earning=" + earning + "]";
	} 
	
	
	

}

/*
Q.10 (Sales Commission Calculator)
A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross
sales for that week.
For example, a salesperson who sells $5000 worth of merchandise
in a week receives $200 plus 9% of $5000, or a total of $650.
You’ve been supplied with a list of the items sold by each
salesperson. The values of these items are as follows:
Item
1
2
3
4
Value
239.99
129.75
99.95
350.89
Develop a Java application that inputs one salesperson’s items
sold
for
last
week
and
calculates
and
displays
that
salesperson’s earnings. There’s no limit to the number of items
that can be sold.
*/