package Square;

import Player.Player;

public class GoToJailSquare extends Square {
    public GoToJailSquare() {
        super("GO TO JAIL", 30);
    }

    @Override
    public void landedOn(Player player) {
        player.getPiece().setLocation(JailSquare.getSquareInstance());
    }
}
