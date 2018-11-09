package equipment;

public enum Weapon {

	RUSTY_SWORD("rusty sword", 5),
	METALLIC_SWORD("metallic sword", 10),
	SILVER_SWORD("silver sword", 15),
	GOLD_SWORD("gold sword", 17),
	
	RUSTY_HAMMER("rusty hammer", 5),
	METALLIC_HAMMER("metallic hammer", 10),
	SILVER_HAMMER("silver hammer", 15),
	GOLD_HAMMER("gold hammer", 20);
	
	private String name;
	private int damage;
	
	Weapon(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		String description = "The '" + name + "' weapon has " + damage + " damages.";
		return description;
	}
}
