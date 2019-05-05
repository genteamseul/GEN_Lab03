import Game.*;
import Player.Player;

import java.util.Scanner;

/**
 * The main class representing a monopoly board, used to simulate a 20 round game
 */
public class MonopolyGame {
    private final int ROUND_TO_PLAY = 20;

    private Cup cup = new Cup();
    private Board board = new Board();

    private Player[] players;

    private int roundCnt;

    public MonopolyGame() throws IllegalArgumentException{
        System.out.println("Please enter the number of players (between 2 and 8): ");

        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = scanner.nextInt();

        // we must have between 2 and 8 players
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

    /**
     * play 20 round
     */
    public void playGame(){
        while (roundCnt < ROUND_TO_PLAY){
            playRound();
            roundCnt++;
        }
    }

    /**
     * each player takes a turn
     */
    private void playRound(){
        System.out.println("Turn number " + roundCnt + ":");
        for(Player p : players){
            p.takeTurn(cup, board);
        }
    }

    public static void main(String[] args){
        MonopolyGame monopoly = new MonopolyGame();
        monopoly.playGame();
    }

}
