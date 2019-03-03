package task3slack;

import java.util.Random;

public class Lottery {
    private String name;
    private Player[] players;
    private Random random;


    public Lottery(String name, int playerCount){
        this.name = name;
        this.players = new Player[playerCount];
        this.random = new Random();
    }

    public void addName(Player player){
        for (int i = 0; i < players.length; i++) {
            if(players[i] == null){
                players[i] = player;
                break;
            }
        }
    }

    public Player lottery(){
        return players[random.nextInt(players.length)];
    }
}
