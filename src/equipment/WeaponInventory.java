package equipment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Baptiste JAMET
 * @version 1.0
 *
 */
public class WeaponInventory {

	private List<Weapon> weaponList;

	/**
	 * Construct the inventory with the basics weapons.
	 */
	public WeaponInventory() {
		super();
		this.weaponList = new ArrayList<>();
		this.weaponList.add(Weapon.RUSTY_SWORD);
		this.weaponList.add(Weapon.RUSTY_HAMMER);
	}

	/**
	 * @return the weaponInventory
	 */
	public List<Weapon> getWeaponInventory() {
		return weaponList;
	}

	/**
	 * @param weaponInventory the weaponInventory to set
	 */
	public void setWeaponInventory(List<Weapon> weaponInventory) {
		this.weaponList = weaponInventory;
	}

	/* (non-Javadoc)
	 * Displays the elements stored into the weapon inventory.
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String descInventory = "";
		
		for (Weapon weapon : weaponList) {
			descInventory += "\t-> A " + weapon.getName() + " (damages : " + weapon.getDamage() + ")\n";
		}
		
		return descInventory;
	}	
}
