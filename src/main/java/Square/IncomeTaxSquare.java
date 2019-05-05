package Square;

import Player.Player;

public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare() {
        super("Income Tax", 4);
    }

    @Override
    public void landedOn(Player player) {
        player.payDay(Math.min(200, player.getNetWorth()*0.1));
    }
}
