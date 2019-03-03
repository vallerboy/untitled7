package task2slack;

public class Starter {
    public static void main(String[] args) {


        Lottery lottery = new Lottery("Lotto", 3);
        lottery.addName("Oskar");
        lottery.addName("Wojtek");
        lottery.addName("Kamil");
        System.out.println(lottery.lottery());
    }
}
