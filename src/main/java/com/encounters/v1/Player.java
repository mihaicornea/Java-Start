package main.java.com.encounters.v1;

import java.util.Scanner;

public class Player {
    int xPosition = 0;
    int yPosition = 0;
    String name;

    //constructorii
    public Player(int x , int y) {
        this.xPosition = x;
        this.yPosition = y;
    }
//metoda de input name din scanner
    public void inputName (Scanner scanner) {
        System.out.println("Enter player's name: ");
        this.name = scanner.nextLine();
    }
    public int getxPosition() { return xPosition; }
    public int getyPosition() {
        return yPosition;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(0, 0);
        player.inputName(scanner);
        System.out.println("Player name: " + player.getName());
        System.out.println("X Position: " + player.getxPosition());
        System.out.println("Y Position: " + player.getyPosition());

        scanner.close();
    }
}
