import Game.*;
import Player.Player;

import java.util.Scanner;

public class MonopolyGame {

    private Cup cup = new Cup();
    private Board board = new Board();

    private Player[] players;

    private int roundCnt;

    public MonopolyGame(){
        System.out.println("Please enter the number of players (between 2 and 8): ");

        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = scanner.nextInt();

        while(numberOfPlayers < 2 || numberOfPlayers > 8){
            System.out.println("Wrong number of players, must be between 2 and 8: ");
            numberOfPlayers = scanner.nextInt();
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
            p.takeTurn(cup, board);
        }
    }

    public static void main(String[] args){
        MonopolyGame monopoly = new MonopolyGame();
        monopoly.playGame();
    }

}
