package task3slack;

public class Starter {
    public static void main(String[] args) {


        Lottery lottery = new Lottery("Lotto", 3);

        Player player = new Player("Oslk", 24);
        Player player1 = new Player("Dam", 2423);
        Player player2 = new Player("asdasd", 2);

        lottery.addName(player);
        lottery.addName(player1);
        lottery.addName(player2);
        System.out.println(lottery.lottery().getName());
    }
}
