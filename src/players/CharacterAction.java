package players;

public interface CharacterAction {

	/**
	 * The character attacked will lost as health point as the weapon used has damages.
	 * 
	 * @param lifeLost The number of life lost by the character attacked.
	 */
	void looseHealthPoints(int lifeLost);
	
	/**
	 * Called when the character attack an other character. The enemy loose as health point as the weapon used has damages.
	 * This method call the looseLife method.
	 * 
	 * @see players.CharacterAction#looseHealthPoints(int)
	 * @param enemy The enemy to attack.
	 */
	void attackEnnemy(Character enemy);
}
