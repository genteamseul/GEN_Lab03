package Square;

import Player.Player;

public abstract class Square {

    private String name;
    private int index;

    public Square(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public int getIndex(){
        return index;
    }

    public String toString(){
        return name;
    }

    public abstract void landedOn(Player player);

}
