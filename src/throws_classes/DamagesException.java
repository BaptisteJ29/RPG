package throws_classes;

public class DamagesException extends Exception {

	
	
	/**
	 * Default constructor from this superclass.
	 */
	public DamagesException() {
		super();
	}

	/**
	 * Create an error exception.
	 * 
	 * @param errorMessage The message to display.
	 */
	public DamagesException(String errorMessage) {
		super(errorMessage);
	}
}
