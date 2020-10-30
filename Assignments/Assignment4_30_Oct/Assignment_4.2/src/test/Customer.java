package test;

public class Customer {

  private int seatNo;
  private String flightClass;
public Customer(int seatNo, String flightClass) {
	super();
	this.seatNo = seatNo;
	this.flightClass = flightClass;
}
public Customer() {
	
}
public int getSeatNo() {
	return seatNo;
}
public void setSeatNo(int seatNo) {
	this.seatNo = seatNo;
}
public String getFlightClass() {
	return flightClass;
}
public void setFlightClass(String flightClass) {
	this.flightClass = flightClass;
}
@Override
public String toString() {
	return "Customer [seatNo=" + seatNo + ", flightClass=" + flightClass + "]";
}
  

}
