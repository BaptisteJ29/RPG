package main;

import java.util.Scanner;

import players.Player;

public class RpgLauncher {

	public static void main(String[] args) {
		
		String name = getPlayerName();
		Player player = new Player(name);
		
		playerLifeState(player);
		playerInventory(player);
	}
	
	/**
	 * Ask a question to know how the user would name his player.
	 * 
	 * @return String the name of the player.
	 */
	private static final String getPlayerName() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How do you want to spell your hero ?");
		
		return scanner.nextLine();
	}
	
	/**
	 * This method is used to show mow many health points the player has left.
	 * @param player The player
	 */
	private static void playerLifeState(Player player) {
		player.showLife();
	}
	
	/**
	 * Shows the inventory of the player.
	 * 
	 * @param player The player that will shows its inventory.
	 */
	private static void playerInventory(Player player) {
		player.lookAtInventory();
	}
}