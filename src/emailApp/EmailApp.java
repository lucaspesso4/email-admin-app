package emailApp;

public class EmailApp {

	public static void main(String[] args) {

		Email em1 = new Email("Will", "Smith");
		Email em2 = new Email("James", "Bond");
		System.out.println(em1.showInfo());
		System.out.println(em2.showInfo());
		
	}

}
