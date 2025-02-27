package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private	int mailBoxCapacity=500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";


	// Constructor to receive the first name and last name

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

		//Call a method asking for department - return the department

		this.department = setDepartment();
		System.out.println("Department: "  + this.department);



		// call a method that returns random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is:  " + this.password);


		// Combine elements to generate email


		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is:" + email);
	}

	//Ask for the department

	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Department\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in  = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "Sales";
		}
		else if(depChoice == 2) {
			return "dev";
		}else if(depChoice == 3) {
			return "act";
		}else {
			return " ";
		}
	}



	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i = 0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}











	// Set the mail capacity


	// set the alternative email
	public void setmailboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}


	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}




	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getmailBoxCapacity(){
		return mailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
	    return "DISPLAY NAME: " + firstName + " " + lastName + 
	           "\nCOMPANY EMAIL: " + email + 
	           "\nMAILBOX CAPACITY: " + mailBoxCapacity + " mb";
	}


}
