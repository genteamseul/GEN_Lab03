package Square;

import Player.Player;

public class JailSquare extends Square {

    private static JailSquare squareInstance;

    public JailSquare(){
        super("JAIL", 10);
    }

    @Override
    public void landedOn(Player player) {
        //Do Noting
    }

    public static void setSquareInstance(){
        squareInstance = new JailSquare();
    }

    public static JailSquare getSquareInstance(){
        return squareInstance;
    }


}
