package Square;

import Player.Player;

/**
 * Class representing the Tax square on a monopoly board
 */
public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare() {
        super("Income Tax", 4);
    }

    @Override
    public void landedOn(Player player) {
        //youmust pay on this square
        player.payDay(Math.min(200, player.getNetWorth()*0.1));
    }
}
