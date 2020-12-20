
/**
 * Contact class
 * @author Jake Sheehan
 * @since 2020-12-7
 */

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	/**
	 * Validates a contact ID
	 * @param ID
	 * @return bool
	 */
	private final boolean validateID(String ID) {
		if (!(ID.isEmpty()) && ID.length() <= 10) {
			return true;
		}
		return false;
	}
	
	/**
	 * Validates a contact name
	 * @param name
	 * @return bool
	 */
	private final boolean validateName(String name) {
		if (!(name.isEmpty()) && name.length() <= 10) {
			return true;
		}
		return false;
	}
	
	/**
	 * Validates a phone number
	 * @param phoneNum
	 * @return bool
	 */
	private final boolean validatePhone(String phoneNum) {
		if (!(phoneNum.isEmpty()) && phoneNum.length() == 10) {
			return true;
		}
		return false;
	}
	
	/**
	 * Validates an address
	 * @param anAddress
	 * @return bool
	 */
	private final boolean validateAddress(String anAddress) {
		if (!(anAddress.isEmpty()) && anAddress.length() <= 30) {
			return true;
		}
		return false;
	}
	
	/**
	 * Contact constructor
	 * @param ID
	 * @param first
	 * @param last
	 * @param phoneNum
	 * @param anAddress
	 * @throws IllegalArgumentException
	 */
	public Contact(String ID, 
			String first, 
			String last, 
			String phoneNum, 
			String anAddress) throws IllegalArgumentException {
		
		// print error is ID is longer than 10, otherwise assign ID to contactID
		if (this.validateID(ID)) {
			this.contactID = ID;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid ID");
		}
		
		// print error if first is longer than 10 or null; otherwise assign first to firstName
		if (this.validateName(first)) {
			this.firstName = first;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid name");
		}
		
		// print error if last is longer than 10 or null; otherwise assign last to lastName
		if (this.validateName(last)) {
			this.lastName = last;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid name");
		}
		
		// print error if phoneNum is too long, too short, or null; otherwise assign to phone
		if (this.validatePhone(phoneNum)) {
			this.phone = phoneNum;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid phone number");
		}
		
		// print error is anAddress is longer than 30 or null; otherwise assign to address
		if (this.validateAddress(anAddress)) {
			this.address = anAddress;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid address");
		}
	}
	
	/**
	 * ID get method
	 * @return String ID
	 */
	public String getID() {
		return this.contactID;
	}
	
	/**
	 * First name get method
	 * @return String firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * Last name get method
	 * @return String lastName
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * Phone number get method
	 * @return String phone
	 */
	public String getPhone() {
		return this.phone;
	}
	
	/**
	 * Address get method
	 * @return String address
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * First name set method
	 * @param first
	 * @throws IllegalArgumentException
	 */
	public void setFirstName(String first) throws IllegalArgumentException {
		if (this.validateName(first)) {
			this.firstName = first;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid name");
		}
	}
	
	/**
	 * Last name set method
	 * @param last
	 * @throws IllegalArgumentException
	 */
	public void setLastName(String last) throws IllegalArgumentException {
		if (this.validateName(last)) {
			this.lastName = last;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid name");
		}
	}
	
	/**
	 * Phone number set method
	 * @param phoneNum
	 * @throws IllegalArgumentException
	 */
	public void setPhone(String phoneNum) throws IllegalArgumentException {
		if (this.validatePhone(phoneNum)) {
			this.phone = phoneNum;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid phone number");
		}
	}
	
	/**
	 * Address set method
	 * @param anAddress
	 * @throws IllegalArgumentException
	 */
	public void setAddress(String anAddress) throws IllegalArgumentException {
		if (this.validateAddress(anAddress)) {
			this.address = anAddress;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid address");
		}
	}
	
}








