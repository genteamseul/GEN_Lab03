public class Player {

    private String name;
    private Piece piece;

    public Player(int playerNumber) {
        this.name = "Player " + playerNumber;
        this.piece = new Piece(playerNumber);
    }

    public void takeTurn(Die[] dice, Board board){
        int fvTotal = 0;

        for(Die d : dice){
            d.roll();
            fvTotal += d.faceValue();
        }

        piece.setLocation(board.getSquare(piece.getLocation(), fvTotal));

        displayTurn(fvTotal, board);

    }

    public void start(Board board){
        piece.setLocation(board.start());
    }

    private void displayTurn(int diceScore, Board board){
        System.out.println(name + " advances " + piece + " to " + piece.getLocation() + " while rolling a " + diceScore);
    }

}
