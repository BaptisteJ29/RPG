package equipment;

/**
 * @author Baptiste JAMET
 *
 */
public class Inventory {
	
	private WeaponInventory weaponInventory;
	
	/**
	 * Construct the inventory and add the rustty's weapon.
	 */
	public Inventory() {
		weaponInventory = new WeaponInventory();
	}
	

	/**
	 * @return the weaponInventory
	 */
	public WeaponInventory getWeaponInventory() {
		return weaponInventory;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return weaponInventory.toString();
	}
	
	
}
