package asgn1;

public class FlightReservation extends Reservation {
	// fields
	private Airport depart;
	private Airport arrival;
	
	//constructor
	public FlightReservation(String name, Airport depart, Airport arrival) {
		super(name);
		if (depart.equals(arrival)) 
		{throw new IllegalArgumentException ("Input different airports");}
		else {this.depart = depart; this.arrival = arrival;}}
	
	/* returns the cost of the reservation (int) in cents. 
	 Cost = fuels cost + airport fees + 53.75$. Planes pay 1.24$ per gallon of fuel
	 Planes can fly 167.52 km per gallon of fuel. Cost is rounded up to nearest cent. */ 
	public int getCost() {
		int distance = Airport.getDistance(this.depart, this.arrival);
		double fuel = (distance/167.52)*124;
		return (int) Math.ceil(fuel + 5375 + 
				this.depart.getFees() + this.arrival.getFees());}
	
	/* Takes as input an Object and returns true if input matches this in type
	name and airports. Otherwise returns false. */
	public boolean equals (Object object){
	if (object instanceof FlightReservation) {
		FlightReservation ob = (FlightReservation) object;
		if (ob.depart == this.depart && ob.arrival == this.arrival && 
				ob.reservationName() == this.reservationName()) {return true;}
		else {return false;}}
	else {return false;}}
}

