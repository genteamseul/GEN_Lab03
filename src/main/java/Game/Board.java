package Game;

import Square.*;

public class Board {

    private Square[] board = new Square[40];

    public Board(){
        board[0] = new GoSquare();

        for(int i = 1; i < 40; i++){
            board[i] = new RegularSquare("Square " + i, i);
        }

        board[4] = new IncomeTaxSquare();

        JailSquare.setSquareInstance();
        board[10] = JailSquare.getSquareInstance();

        board[30] = new GoToJailSquare();
    }

    public Square getSquare(Square oldLocation, int fvTotal){
        return board[(oldLocation.getIndex() + fvTotal)%40];
    }

    public Square start(){
        return board[0];
    }

}
