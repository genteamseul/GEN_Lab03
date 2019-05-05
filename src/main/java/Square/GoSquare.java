package Square;

import Player.Player;

/**
 * Class representing the GO square on a monopoly board
 */
public class GoSquare extends Square{

    public GoSquare() {
        super("GO", 0);
    }

    @Override
    public void landedOn(Player player) {
        //we get paid if we land on it
        player.gainCash(200);
    }
}
