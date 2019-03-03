package task1slack;

import java.util.Random;

public class Lottery {
    private String name;
    private String[] players;
    private Random random;


    public Lottery(String name, String[] players){
        this.name = name;
        this.players = players;
        this.random = new Random();
    }


    public String lottery(){
        return players[random.nextInt(players.length)];
    }
}
