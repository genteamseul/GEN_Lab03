public class Board {

    private Square[] board = new Square[40];

    public Board(){
        board[0] = new Square("GO", 0);

        for(int i = 0; i < 40; i++){
            board[i] = new Square("Square " + i, i);
        }
    }

    public Square getSquare(Square oldLocation, int fvTotal){
        return board[(oldLocation.getIndex() + fvTotal)%40];
    }

    public Square start(){
        return board[0];
    }

}
