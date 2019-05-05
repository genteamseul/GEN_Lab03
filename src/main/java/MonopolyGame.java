import java.util.Scanner;

public class MonopolyGame {

    private Die[] dice = new Die[]{new Die(), new Die()};
    private Board board = new Board();

    private Player[] players;

    private int roundCnt;

    public MonopolyGame() throws IllegalArgumentException{
        System.out.println("Please enter the number of players (between 2 and 8): ");

        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = scanner.nextInt();

        if(numberOfPlayers < 2 || numberOfPlayers > 8){
            throw new IllegalArgumentException("Wrong number of players, must be between 2 and 8: ");
        }

        players = new Player[numberOfPlayers];

        for(int i = 0; i < numberOfPlayers; i++){
            players[i] = new Player(i);
            players[i].start(board);
        }
        roundCnt = 0;
    }

    public void playGame(){
        while (roundCnt < 20){
            playRound();
            roundCnt++;
        }
    }

    private void playRound(){
        System.out.println("Turn number " + roundCnt + ":");
        for(Player p : players){
            p.takeTurn(dice, board);
        }
    }

    public static void main(String[] args){
        MonopolyGame monopoly = new MonopolyGame();
        monopoly.playGame();
    }

}
