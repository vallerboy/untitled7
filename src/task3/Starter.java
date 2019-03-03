package task3;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Game game = new Game("Lotto", 2);

        while (game.hasFreePlayerSlots()){
                String name = scanner.nextLine();
                String surname = scanner.nextLine();
                int point = Integer.parseInt(scanner.nextLine());

                Player player = new Player(name, surname, point);
                game.addPlayer(player);
        }

        System.out.println(game.getWinner().getNameAndSurname());
    }
}
