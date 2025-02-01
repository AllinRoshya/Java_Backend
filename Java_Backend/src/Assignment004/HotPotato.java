package Assignment004;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HotPotato {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Queue<Player> playerList = new LinkedList<Player>();
		boolean gameRunning = true;
		while (gameRunning) {
			System.out.println("--------------------Hot Potato Game Menu--------------------");
			System.out.println("1.Add Players");
			System.out.println("2.View Players");
			System.out.println("3.Start Game");
			System.out.println("4.Exit");
			System.out.println("Enter your choice: ");
			int choice = userInput.nextInt();
			userInput.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter the names of 5 players:");
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Enter Player " + i + " Name: ");
                    String playerName = userInput.nextLine();
                    playerList.add(new Player(playerName)); 
                }
				break;
			case 2:
				System.out.println("-------------------------Players View-------------------------");
				System.out.println("Current Players " + playerList);
				break;
			case 3:
				startGame(playerList);
				break;
			case 4:
				gameRunning = false;
				System.out.println("Exiting Game......");
				break;

			}
		}
	}

	static void startGame(Queue<Player> playerList) {
		System.out.println("**************Game Starts**************");

		while (playerList.size() > 1) {
			int passes = 4 + (int) (Math.random() * 10);

			System.out.println("\nPassing the potato " + passes + " times...");
			for (int i = 0; i <passes; i++) {
				Player currentPlayer = playerList.remove();
				playerList.add(currentPlayer);

			}
			Player eliminatedPlayer = playerList.remove();
			System.out.println(eliminatedPlayer + " is eliminated!");
			System.out.println("Remaining players: " + playerList);
		}
		System.out.println("\t\t*************************" + "\n\t\t*     Winner      *"+"\n\t\t* " + playerList.peek()+"*"+ "\n\t\t*************************");
		System.out.println("GAME OVER!");
		
	}
}

