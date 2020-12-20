import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContactTest {
	
	/**
	 * ID Requirements Test Suite
	 */
	
	// An ID with 1 char is valid
	@Test
	@DisplayName("Accepts ID with length of 1")
	void IdWithOneCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "Smith", "5555555555", "5 Main");
		assertEquals("1", contact.getID());
	}
	
	// An ID with 10 char is valid
	@Test
	@DisplayName("Accepts ID with length of 10")
	void IdWithTenCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1234567890", "John", "Smith", "5555555555", "5 Main");
		assertEquals("1234567890", contact.getID());
	}
	
	// An ID longer than 10 chars throw exception
	@Test
	@DisplayName("ID more than 10 characters throws exception")
	void IdWithMoreThanTenCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "John", "Smith", "5555555555", "5 Main");
		});
	}
	
	// A null ID throws an exception
	@Test
	@DisplayName("Null ID throws exception")
	void NullIDTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("", "John", "Smith", "5555555555", "5 Main");
		});
	}
	
	
	/**
	 * First Name Requirements Test Suite
	 */
	
	// A first name with 1 char is valid
	@Test
	@DisplayName("Accepts first name with length of 1")
	void FirstNameWithOneCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "A", "Smith", "5555555555", "5 Main");
		assertEquals("A", contact.getFirstName());
	}
	
	// A first name with 10 char is valid
	@Test
	@DisplayName("Accepts first name with length of 10")
	void FirstNameWithTenCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "ABCDEFGHIJ", "Smith", "5555555555", "5 Main");
		assertEquals("ABCDEFGHIJ", contact.getFirstName());
	}
	
	// A first name longer than 10 chars throw exception
	@Test
	@DisplayName("First name more than 10 characters throws exception")
	void FirstNameWithMoreThanTenCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "ABCDEFGHIJK", "Smith", "5555555555", "5 Main");
		});
	}
	
	// A null first name throws an exception
	@Test
	@DisplayName("Null first name throws exception")
	void NullFirstNameTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "", "Smith", "5555555555", "5 Main");
		});
	}
	
	/**
	 * Last Name Requirements Test Suite
	 */
	
	// A last name with 1 char is valid
	@Test
	@DisplayName("Accepts last name with length of 1")
	void LastNameWithOneCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "A", "5555555555", "5 Main");
		assertEquals("A", contact.getLastName());
	}
	
	// A last name with 10 char is valid
	@Test
	@DisplayName("Accepts last name with length of 10")
	void LastNameWithTenCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "ABCDEFGHIJ", "5555555555", "5 Main");
		assertEquals("ABCDEFGHIJ", contact.getLastName());
	}
	
	// A last name longer than 10 chars throw exception
	@Test
	@DisplayName("Last name more than 10 characters throws exception")
	void LastNameWithMoreThanTenCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "ABCDEFGHIJK", "5555555555", "5 Main");
		});
	}
	
	// A null last name throws an exception
	@Test
	@DisplayName("Null last name throws exception")
	void NullLastNameTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "", "5555555555", "5 Main");
		});
	}
	
	/**
	 * Phone Number Requirements Test Suite
	 */
	
	// A phone number with 10 chars is accepted
	@Test
	@DisplayName("Accepts phone number with 10 chars")
	void PhoneWithTenCharsTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "Smith", "1234567890", "5 Main");
		assertEquals("1234567890", contact.getPhone());
	}
	
	// A phone number with 9 chars throws an exception
	@Test
	@DisplayName("Phone number with 9 chars throws exception")
	void PhoneWithNineCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Smith", "123456789", "5 Main");
		});
	}
	
	// A phone number with 11 chars throws an exception
	@Test
	@DisplayName("Phone number with 11 chars throws exception")
	void PhoneWithElevenCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Smith", "12345678901", "5 Main");
		});
	}
	
	// A null phone number throws an exception
	@Test
	@DisplayName("Null phone number throws exception")
	void NullPhoneTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Smith", "", "5 Main");
		});
	}
	
	/**
	 * Address Requirements Test Suite
	 */
	
	// An address with 1 char is valid
	@Test
	@DisplayName("Accepts address with length of 1")
	void AddressWithOneCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "Smith", "5555555555", "5");
		assertEquals("5", contact.getAddress());
	}
	
	// An address with 30 char is valid
	@Test
	@DisplayName("Accepts address with length of 30")
	void AddressWithThirtyCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "Smith", "5555555555", 
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCD");
		assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCD", contact.getAddress());
	}
	
	// An address longer than 30 chars throw exception
	@Test
	@DisplayName("Address more than 30 characters throws exception")
	void AddressWithMoreThanThirtyCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Smith", "5555555555", 
					"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDE");
		});
	}
	
	// A null address throws an exception
	@Test
	@DisplayName("Null address throws exception")
	void NullAddressTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Smith", "5555555555", "");
		});
	}
	
}
