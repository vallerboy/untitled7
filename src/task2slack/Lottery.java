package task2slack;

import java.util.Random;

public class Lottery {
    private String name;
    private String[] players;
    private Random random;


    public Lottery(String name, int playerCount){
        this.name = name;
        this.players = new String[playerCount];
        this.random = new Random();
    }

    public void addName(String name){
        for (int i = 0; i < players.length; i++) {
            if(players[i] == null){
                players[i] = name;
                break;
            }
        }
    }

    public String lottery(){
        return players[random.nextInt(players.length)];
    }
}
