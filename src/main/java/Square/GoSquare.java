package Square;

import Player.Player;

public class GoSquare extends Square{

    public GoSquare() {
        super("GO", 0);
    }

    @Override
    public void landedOn(Player player) {
        player.gainCash(200);
    }
}
