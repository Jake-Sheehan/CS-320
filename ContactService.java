import java.util.HashMap;

public class ContactService {
	int currentID = 0;
	HashMap<String, Contact> contacts = new HashMap<String, Contact>(); //hash map to hold contacts
	
	/**
	 * Adds a contact
	 * @param first
	 * @param last
	 * @param phoneNum
	 * @param anAddress
	 */
	public void addContact(String first, 
			String last,
			String phoneNum,
			String anAddress) {
		++currentID;
		String newID = Integer.toString(currentID);
		
		try {
			Contact newContact = new Contact(newID, first, last, phoneNum, anAddress);
			contacts.put(newContact.getID(), newContact);
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Deletes a contact by ID
	 * @param ID
	 */
	public void deleteContact(String ID) {
		if (contacts.containsKey(ID)) {
			contacts.remove(ID);
		}
	}
	
	/**
	 * Updates a first name
	 * @param ID
	 * @param newName
	 */
	public void updateFirstName(String ID, String newName) {
		if (contacts.containsKey(ID)) {
			try {
				contacts.get(ID).setFirstName(newName);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Updates a last name
	 * @param ID
	 * @param newName
	 */
	public void updateLastName(String ID, String newName) {
		if (contacts.containsKey(ID)) {
			try {
				contacts.get(ID).setLastName(newName);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Updates a phone number
	 * @param ID
	 * @param newPhone
	 */
	public void updatePhone(String ID, String newPhone) {
		if (contacts.containsKey(ID)) {
			try {
				contacts.get(ID).setPhone(newPhone);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Updates an address
	 * @param ID
	 * @param newAddress
	 */
	public void updateAddress(String ID, String newAddress) {
		if (contacts.containsKey(ID)) {
			try {
				contacts.get(ID).setAddress(newAddress);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}

}
