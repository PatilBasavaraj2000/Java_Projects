package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email eml = new Email("John", "Smith");
		System.out.print(eml.showInfo());
		
		//eml.setAlternateEmail("js@gmail.com");
		//System.out.println(eml.getAlternateEmail());
		//eml.showInfo();
		
	

	}

}
