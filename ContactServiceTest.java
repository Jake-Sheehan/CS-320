import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	// Contacts have unique ID
	@Test
	@DisplayName("Contacts are added with unique ID")
	void UniqueIdTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Smith", "1234567890", "5 Main");
		contacts.addContact("Jake", "Sheehan", "5555555555", "10 Main");
		contacts.addContact("Allison", "Sheehan", "5555555556", "10 Main");
		assertNotEquals(contacts.contacts.get("1").getID(), contacts.contacts.get("2").getID());
		assertNotEquals(contacts.contacts.get("2").getID(), contacts.contacts.get("3").getID());
		assertNotEquals(contacts.contacts.get("1").getID(), contacts.contacts.get("3").getID());
	}
	
	// Contacts can be deleted
	@Test
	@DisplayName("Contacts can be deleted")
	void DeleteContactTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Smith", "1234567890", "5 Main");
		contacts.addContact("Jake", "Sheehan", "5555555555", "10 Main");
		contacts.addContact("Allison", "Sheehan", "5555555556", "10 Main");
		contacts.deleteContact("2");
		assertFalse(contacts.contacts.containsKey("2"));
	}
	
	// First name can be updated
	@Test
	@DisplayName("Fist name can be updated")
	void UpdateFirstNameTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Smith", "1234567890", "5 Main");
		contacts.updateFirstName("1", "Bob");
		assertEquals("Bob", contacts.contacts.get("1").getFirstName());
	}
	
	// Last name can be updated
	@Test
	@DisplayName("Last name can be updated")
	void UpdateLastNameTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Smith", "1234567890", "5 Main");
		contacts.updateLastName("1", "Doe");
		assertEquals("Doe", contacts.contacts.get("1").getLastName());
	}
	
	// Phone number can be updated
	@Test
	@DisplayName("Phone number can be updated")
	void UpdatePhoneTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Smith", "1234567890", "5 Main");
		contacts.updatePhone("1", "5555555555");
		assertEquals("5555555555", contacts.contacts.get("1").getPhone());
	}
	
	// Address can be updated
	@Test
	@DisplayName("Address can be updated")
	void UpdateAddressTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Smith", "1234567890", "5 Main");
		contacts.updateAddress("1", "10 Washington");
		assertEquals("10 Washington", contacts.contacts.get("1").getAddress());
	}
	
}
