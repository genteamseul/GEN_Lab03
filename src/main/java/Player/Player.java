package Player;

import Game.*;
import Square.Square;

public class Player {

    private String name;
    private Piece piece;
    private double playerCash = 1500;

    public Player(int playerNumber) {
        this.name = "Player " + playerNumber;
        this.piece = new Piece(playerNumber);
    }

    public void takeTurn(Cup cup, Board board){

        cup.roll();

        Square newLocation = board.getSquare(piece.getLocation(), cup.getTotal());
        piece.setLocation(newLocation);

        newLocation.landedOn(this);

        displayTurn(cup.getTotal(), board);

    }

    public void start(Board board){
        piece.setLocation(board.start());
    }

    private void displayTurn(int diceScore, Board board){
        System.out.println(name + " advances " + piece + " to " + piece.getLocation() + " while rolling a " + diceScore);
    }

    public void gainCash(double cashEarned){
        playerCash += cashEarned;
    }

    public void payDay(double cashDue){
        playerCash -= cashDue;
    }

    public double getNetWorth(){
        return playerCash;
    }

    public Piece getPiece(){
        return piece;
    }

}
