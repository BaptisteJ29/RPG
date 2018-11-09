package players;

import display.Display;
import throws_classes.HealthException;

/**
 * @author Baptiste JAMET
 *
 */
public abstract class Character implements CharacterAction, Display {

	private static final int DEFAULT_DAMAGE = 10;
	private static final int DEFAULT_POINT_OF_LIFE = 100;
	private static final int MIN_HEALTH_POINT = 0;
	private static final int MAX_HEALTH_POINT = 100;
	private static final int MIN_DAMAGE = 5;

	private String name;
	private int healthPoint;
	private int damages;

	/**
	 * Constructor from the character.
	 * 
	 * @param name The name of this.
	 */
	public Character(String name) {
		this(name, DEFAULT_POINT_OF_LIFE, DEFAULT_DAMAGE);
	}

	/**
	 * @param name        This name
	 * @param healthPoint This numbers of point of life.
	 * @param damages     This numbers of damage points.
	 */
	public Character(String name, int healthPoint, int damages) {
		super();
		this.name = name;
		this.healthPoint = healthPoint;

	}

	/**
	 * Check if an exception must be declared or not.
	 * 
	 * @throws HealthException
	 */
	private void checkHealthPoint() throws HealthException {
		if (this.healthPoint < 0) {
			throw new HealthException("The health point cannot be negative.");
		}
	}

	
	/* (non-Javadoc)
	 * @see players.CharacterAction#looseLife(int)
	 */
	@Override
	public void looseHealthPoints(int lifeLost) {
		try {
			this.damages -= lifeLost;
			checkHealthPoint();
		} catch (HealthException e) {
			e.toString();
		}
	}


	/* (non-Javadoc)
	 * @see players.CharacterAction#attackEnnemy(players.Character)
	 */
	@Override
	public void attackEnnemy(Character enemy) {
		enemy.looseHealthPoints(damages);
	}
	
	

	/* (non-Javadoc)
	 * @see players.Display#tell(java.lang.String)
	 */
	@Override
	public void tell(String message) {
		System.out.println(message);
	}

	/* (non-Javadoc)
	 * @see players.Display#talkWithName(players.Character, java.lang.String)
	 */
	@Override
	public void tellWithName(Character character, String message) {
		System.out.println(name + " - " + message);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the healthPoint
	 */
	public int getHealthPoint() {
		return healthPoint;
	}

	/**
	 * @param healthPoint the healthPoint to set
	 */
	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}

	/**
	 * @return the damages
	 */
	public int getDamages() {
		return damages;
	}

	/**
	 * @param damages the damages to set
	 */
	public void setDamages(int damages) {
		this.damages = damages;
	}
}
