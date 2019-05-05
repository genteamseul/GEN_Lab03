package Square;

import Player.Player;

/**
 * Class representing the Go To Jail square on a monopoly board
 */
public class GoToJailSquare extends Square {
    public GoToJailSquare() {
        super("GO TO JAIL", 30);
    }


    @Override
    public void landedOn(Player player) {
        //actually go to jail
        player.getPiece().setLocation(JailSquare.getSquareInstance());
    }
}
