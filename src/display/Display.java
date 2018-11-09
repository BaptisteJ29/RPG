package display;

import players.Character;

public interface Display {

	/**
	 * Tell something without name before.
	 * 
	 * @param message The message tells.
	 */
	void tell(String message);
	
	/**
	 * Tell the message with the name of the character who talks.
	 * 
	 * @param character The character who talk.
	 * @param message The message tells.
	 */
	void tellWithName(Character character, String message);
}
