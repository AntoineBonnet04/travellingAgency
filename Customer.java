package asgn1;

public class Customer {
	// fields
	private String name;
	private int balance;
	private Basket basket;
	
	// constructor creates an empty basket
	public Customer(String name, int balance) {
		this.name = name;
		this.balance = balance;
		this.basket = new Basket();}
	
	// getter methods
	public String getName(){
		return this.name;}
	
	public int getBalance() {
		return this.balance;}
	
	// returns the reference to the basket of the customer
	public Basket getBasket() {
		return this.basket;}
	
	// Takes an int as input representing the amount to be added to the balance 
	// of the customer. If input negative, Illegal Argument exception. Else,
	// updates the balance and returns the new balance in cents. 
	public int addFunds(int amount) {
		if (amount < 0) {throw new IllegalArgumentException ("Only positive amounts "
				+ "can be added to a customer's balance.");}
		else {this.balance += amount; return this.balance;}}
	
	/* Takes a Res. as input and adds it to the basket of the customer if the name
	 * on the reservation matches the name of the customer. If the method is 
	 * successful it should return the number of reservations in the basket of this
	 * customer. Otherwise, the method throws an IllegalArgumentException*/
	
	public int addToBasket(Reservation reserv) {
		if (reserv.reservationName() == this.name) {
			this.basket.add(reserv);
			return this.basket.getNumOfReservations();
		}
		else {throw new IllegalArgumentException ("The name assigned to the reservation"
				+ " does not match the customer's");}}
	
	/* Takes as input a hotel, a string room type, an int num of nights, 
	 * a boolean representing whether or not the customer wants breakfast included, 
	 * Adds the corresponding reservation to the basket of the customer
	 * returns the number of res. now in the basket of the customer */
	public int addToBasket(Hotel hotel, String type, int nights, boolean breakfast) {
		if (breakfast == false) {
		this.basket.add(new HotelReservation(this.getName(), hotel, type, nights));}
		else {this.basket.add(new BnBReservation(this.getName(), hotel, type, nights));}
		return this.basket.getNumOfReservations();}
	
	/* Takes two Airports as input. The method adds the corresponding reservation 
	to the basket of the customer and returns the number of reservations that are now
	in their basket, whether are no the flight reservation was created successfully.*/
	public int addToBasket(Airport ap1, Airport ap2) {
		
		this.basket.add(new FlightReservation(this.getName(), ap1, ap2));
		return this.basket.getNumOfReservations();}
	/* takes a Res. as input, removes it from the basket of the customer.
	 * Returns a boolean indicating whether the operation was successful*/
	 
	public boolean removeFromBasket(Reservation reserv) {
		return this.basket.remove(reserv);}
	
	/* If the customer's balance is not enough to cover the total cost of their basket,
	 * then the method throws an IllegalStateException. Else, the customer is charged the 
	 * total cost of the basket, the basket is cleared and balance left is returned.*/
	 
	public int checkOut() {
		if (this.balance < this.basket.getTotalCost()){
			throw new IllegalStateException 
			("Customer's balance is lower than their basket cost.");}
		else {
			this.balance -= this.basket.getTotalCost();
			this.basket.clear();
			return this.balance;}}
	 
}
