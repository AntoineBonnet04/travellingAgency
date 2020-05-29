package asgn1;

public class Room {
	// fields
	private String type; // Type of the room
	private int price; //Price of the room in cents
	private boolean available; //Room availability
	
	// constructor
	public Room(String roomtype) {
		if (roomtype.equals("double")) {
			this.type = "double";
			this.price = 9000;
			this.available = true;
		}
		else if (roomtype.equals("queen")) {
			this.type = "queen";
			this.price = 11000;
			this.available = true;
		}
		
		else if (roomtype.equals("king")){
			this.type = "king";
			this.price = 15000;
			this.available = true;
		}
		else {
			throw new IllegalArgumentException ("No room of such type can be created");
		}
	}
	
	// constructor that takes a Room as input and creates a copy of the input
	// room, i.e. it initializes the fields using the values from the 
	// corresponding fields of the input
	public Room(Room room) {
		this.type = room.type;
		this.price = room.price;
		this.available = room.available;
	}
	
	//getter methods
	public String getType(){
		return this.type;
	}
	public int getPrice(){
		return this.price;}
	
	/* Takes no input, sets the value stored in the availability 
	field to be the opposite of the one currently there */
	public void changeAvailability() {
		this.available = ! this.available;}
	
	/* Static methods takes as input an array of Rooms, as well
	 * as a string indicating a room type. Returns the first available 
	 * room in the array of the indicated type. If no such room exists, 
	 * the method returns null. */
	public static Room findAvailableRoom(Room[] rooms, String roomtype) {
		for(int i = 0; i<rooms.length; i++) {
			if (rooms[i].type == roomtype && rooms[i].available == true) {
				return rooms[i];}}
		return null;}
	
	/* Takes as input an array of rooms, makes the first 
	 * unavailable room in the array of the indicated type available again.
	 * If successful, returns true. Else, returns false. */
	 
	public static boolean makeRoomAvailable (Room[] rooms, String roomtype) {
		 boolean condition = false;
		 for(int i = 0; i<rooms.length && condition == false; i++) {
				if (rooms[i].available == false) {
					rooms[i].available = true;
					condition = true;}}
				return condition;}
	
	}
	
