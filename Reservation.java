public abstract class Reservation {
	// field
	private String name;
	
	// constructor
	public Reservation(String name){
		this.name = name;}
	
	// to retrieve the name on this reservation
	public final String reservationName(){
		return this.name;}

	public abstract int getCost();
	public abstract boolean equals(Object object);
}
