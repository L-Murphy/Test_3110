import java.util.LinkedList;

public class AddressBook {
	private LinkedList book;
	public AddressBook() {
		book = new LinkedList();
	}
	
	public void addBuddy(BuddyInfo Buddy){
		if(Buddy != null) {
			book.add(Buddy);	
		}
	}
	
	public void removeBuddy(BuddyInfo Buddy) {
		if(book.contains(Buddy)) {
			book.remove(Buddy);
		}
		else {
			System.out.print("Buddy does not exist");
		}
	}
}
