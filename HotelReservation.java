package asgn1;

public class HotelReservation extends Reservation {
	// fields
	private Hotel hotel;
	private String type;
	private int nights;
	// Price in cents for one night in a room of specified type and hotel
	private int price;
	
	// constructor
	public HotelReservation (String name, Hotel hotel, String type, int nights) {
		//use inputs to create a reservation and initialize the corresponding fields
		super(name);
		this.hotel = hotel;
		this.type = type;
		this.nights = nights;
		//reserve a room of the correct type in the specified hotel
		this.price = hotel.reserveRoom(type);}
	
	// retrieve the number of nights on the reservation
	public int getNumOfNights() {
		return this.nights;}
	
	//Takes no input, returns the cost of the reservation in cents. 
	// Represents the price to pay for specified type of room given num of nights
	public int getCost() {
		return this.price*this.nights;}
	
	// Takes as input an Object and returns true if input matches this
	// in type, name, hotel, type, number of nights, total cost. 
	public boolean equals(Object object) {
		if (object instanceof HotelReservation) {
			HotelReservation ob = (HotelReservation) object;
			if (this.type == ob.type && this.hotel == ob.hotel &&
			this.nights == ob.nights && ob.reservationName() == this.reservationName()
				&& this.price == ob.price) {return true;}
			else {return false;}}
		else {return false;}}
	
	
}
		
	
	

