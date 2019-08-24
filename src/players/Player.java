package players;

import equipment.Inventory;
import equipment.WeaponInventory;

/**
 * @author Baptiste JAMET
 *
 */
public class Player extends Character {

	private Inventory inventory;
	private WeaponInventory weaponInventory;
	
	
	/**
	 * Constructor for the player.
	 * 
	 * @param name The name of the player.
	 */
	public Player(String name) {
		super(name);
		this.inventory = new Inventory();
		this.weaponInventory = inventory.getWeaponInventory();
	}
	
	/**
	 * Shows what is in the inventory of this player's object.
	 */
	public void lookAtInventory() {
		super.tellWithName(this, "In my inventory, I have :\n" + this.inventory.toString());
	}
	
	/**
	 * Shows how many points of life this player has left.
	 */
	public void showLife() {
		super.tellWithName(this, "I have got " + super.getHealthPoint() + " health points left.");
	}
}
