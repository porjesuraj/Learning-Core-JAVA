package test;

public class CustomerCreditInfo {
	private int accountNo;
	private double monthStartBalance;
	private double  chargedAmount;
	private double creditUsed; 
	private double creditLimit;
	
	public CustomerCreditInfo(int accountNo, double monthStartBalance, double chargedAmount, double creditUsed,
			double creditLimit) {
		super();
		this.accountNo = accountNo;
		this.monthStartBalance = monthStartBalance;
		this.chargedAmount = chargedAmount;
		this.creditUsed = creditUsed;
		this.creditLimit = creditLimit;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getMonthStartBalance() {
		return monthStartBalance;
	}

	public void setMonthStartBalance(double monthStartBalance) {
		this.monthStartBalance = monthStartBalance;
	}

	public double getChargedAmount() {
		return chargedAmount;
	}

	public void setChargedAmount(double chargedAmount) {
		this.chargedAmount = chargedAmount;
	}

	public double getCreditUsed() {
		return creditUsed;
	}

	public void setCreditUsed(double creditUsed) {
		this.creditUsed = creditUsed;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		return "CustomerCreditInfo [accountNo=" + accountNo + ", monthStartBalance=" + monthStartBalance
				+ ", chargedAmount=" + chargedAmount + ", creditUsed=" + creditUsed + ", creditLimit=" + creditLimit
				+ "]";
	}
	
	

}


/*
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this
month
e) allowed credit limit.
The program should input all these facts as integers, calculate
the new balance (= beginning balance+ charges – credits),
display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose
credit limit is exceeded, the program should display
the message "Credit limit exceeded".
*/