package main.java.com.encounters.v1;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(30, 30);
        //grid.display();
        grid.placeCharacter(14,14,"Johnny");
        grid.display();
    }
}

