package asgn1;

public class Airport {
	// private fields
	private int xcor;// x-coordinate of airport in km
	private int ycor;// y-coordinate of airport in km
	private int fees; // fee in cents
			
	//constructor
	public Airport(int xcor, int ycor, int fees){
		this.xcor = xcor;
		this.ycor = ycor;
		this.fees = fees;
	}
	// get methods
	public int getFees() {
		return this.fees;
	}
	// Return distance between two airport as integer
	public static int getDistance(Airport ap1, Airport ap2){
		double xdiff = ap1.xcor - ap2.xcor;
		double ydiff = ap1.ycor - ap2.ycor;
		return (int) Math.ceil(Math.sqrt(xdiff*xdiff + ydiff*ydiff));	
	}

}