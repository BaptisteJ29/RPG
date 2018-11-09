package throws_classes;

public class HealthException extends Exception {

	/**
	 * Default constructor from the superclass.
	 */
	public HealthException() {
		super();
	}

	/**
	 * Display a message to the screen.
	 * 
	 * @param message The message to display.
	 */
	public HealthException(String message) {
		super(message);
	}
}
