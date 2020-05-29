package asgn1;

public class Hotel {

	// fields
	private String name;
	private Room[] rooms;
		
	// constructor
	public Hotel(String name, Room[] rooms) {
		this.name = name;
		this.rooms = new Room[rooms.length];
		for (int i =0; i<rooms.length; i++) {
			this.rooms[i] = new Room(rooms[i].getType());}}
	
	/* Takes as input a String indicating the type of room
	 * to reserve. Changes the availability of the first 
	 * available room of the specified type in the hotel
	 * If successful, returns the price of the room. Else
	 * an IllegalArgumentException is thrown.*/
	
	public int reserveRoom(String type) {
		Room room = Room.findAvailableRoom(this.rooms, type);
		if (room == null) {throw new IllegalArgumentException 
			("No room of such type can be found");}
		else {room.changeAvailability();
			return room.getPrice();}
		}
	
	/* Takes as input a String indicating the type of room to cancel.
	 * The method makes a room of that type available again. It returns true
	 * if the operation was possible, false otherwise. */
	public boolean cancelRoom(String type) {
		return Room.makeRoomAvailable(this.rooms, type);}
}
	


