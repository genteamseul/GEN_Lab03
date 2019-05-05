package Square;

import Player.Player;

/**
 * Class representing the Jail square on a monopoly board
 */
public class JailSquare extends Square {

    private static JailSquare squareInstance;

    public JailSquare(){
        super("JAIL", 10);
    }

    @Override
    public void landedOn(Player player) {
        //Do Noting
    }

    //these are used for the go to jail

    public static void setSquareInstance(){
        squareInstance = new JailSquare();
    }

    public static JailSquare getSquareInstance(){
        return squareInstance;
    }


}
