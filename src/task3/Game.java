package task3;

public class Game {
    private String gameName; //null, number type = 0, boolean = false
    private Player[] players;

    public Game(String gameName, int playerCount){
        this.gameName = gameName;
        this.players = new Player[playerCount]; //10
    }

    public void addPlayer(Player player){
        for (int i = 0; i < players.length; i++) {
            if(players[i] == null){
                players[i] = player;
                break;
            }
        }
    }

    //[Adam, Kamil, null, null, null]
    public Player getWinner(){
        Player winner = players[0];
        for (Player player : players) {
            if(player != null && winner.getPoints() < player.getPoints()){
                winner = player;
            }
        }

        return winner;
    }

    public boolean hasFreePlayerSlots() {
        for (Player player : players) {
            if(player == null){
                return true;
            }
        }
        return false;
    }
}