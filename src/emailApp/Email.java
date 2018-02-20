package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "company.com";

	// Contructor first and last
	public Email (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method asking for the department - return department
		this.department = setDepartment();
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("YOUR PASSWORD IS: " + this.password);
		
		//Combine element to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	// Ask department
	private String setDepartment() {
		System.out.print("Hello " + this.firstName + "\nPlease, select your department:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if (depChoice == 1 ) {return "sales"; }
		else if (depChoice == 2) {return "development";}
		else if (depChoice == 3) {return "accounting"; }
		else {return "none"; }
	}
	
	// Random password
	private String randomPassword(int length) {
		String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * setPassword.length());
			password[i] = setPassword.charAt(rand);
		}
		return new String(password);
	}
	
	// Set mailbox capacity
	public void setCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	// Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	// Change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Getters
	public int getMailboxCapacity() { return this.mailboxCapacity; }
	public String getAlternatePassword() { return this.alternateEmail; }
	public String getPassword() { return this.password; }
	
	public String showInfo() {
		return "DISPLAY NAME: " + this.firstName + " " + this.lastName +
				"\nCOMPANY EMAIL: " + this.email +
				"\nMAILBOX CAPACITY: " + this.mailboxCapacity + "mb";
				
	}
}
