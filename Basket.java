package asgn1;

public class Basket {
	// field
	private Reservation[] reservations;
	
	// constructor, initializes the fields with an array with no reservations. 
	public Basket() {
		this.reservations = new Reservation[0];
	}
	// Takes no inputs, returns a shallow copy of the array of R. of the basket
	// Contains all the reservations in the basket in the same order in which
	// they were added. 
	public Reservation[] getProducts() {
		Reservation[] products = this.reservations;
		return products;}
	
	// takes as input a reservation, adds it at the end of the list of reserv.
	// of the basket and returns how many reservations are now there.
	public int add(Reservation reserv) {
		int num = this.reservations.length+1;
		Reservation[] temp = new Reservation[num];
		for (int i =0; i<this.reservations.length; i++) {
			temp[i] = this.reservations[i];}
		temp[num-1] = reserv;
		this.reservations = temp;
		return num;}
	
	/* removes the first occurrence of the specified element from the 
	 * array of reservation of the basket. if no such reservation exists, 
	 * then the method returns false, otherwise, after removing it, 
	 * the method returns true*/
	
	public boolean remove(Reservation reserv) {
		Reservation[] temp = new Reservation[this.reservations.length -1];
		for (int i =0; i<this.reservations.length; i++) {
			if (! reservations[i].equals(reserv)) {temp[i] = reservations[i];}
			else { for (int j = i; j<this.reservations.length-1; j++) 
					{temp[j] = this.reservations[j+1];}
					this.reservations = temp; return true;}}
		return false;}
	
	// Takes no input, returns no values, empties the array of reservations
	public void clear() { 
		this.reservations = new Reservation[0] ;}
	
	// takes no inputs, returns the number of reservations in basket
	public int getNumOfReservations() {
		return this.reservations.length;}
	
	// returns the cost in cents of all the reservations in the basket
	public int getTotalCost() {
		int total = 0;
		for (int i =0; i<this.reservations.length; i++) {
			total += reservations[i].getCost();}
		return total;}
	
}
