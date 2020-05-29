public class BnBReservation extends HotelReservation {
	//constructor: uses inputs to create an HotelReservation
	public BnBReservation(String name, Hotel hotel, String type, int nights) {
		super(name, hotel, type, nights);}
	
	// Takes no input, returns the cost of the reservation in cents. 
	// Since reservation includes breakfast, to the cost of reserving the 
	// room in the hotel add 10$ per night. 
	public int getCost() {
		return super.getCost() +1000*(this.getNumOfNights());}
}
