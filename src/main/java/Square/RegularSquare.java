package Square;

import Player.Player;

/**
 * Class representing a regular square on a monopoly board
 */
public class RegularSquare extends Square{

    public RegularSquare(String name, int index) {
        super(name, index);
    }

    @Override
    public void landedOn(Player player) {
        //Do Nothing
    }
}
