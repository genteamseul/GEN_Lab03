public class Piece {

    private String name;
    private Square location;

    public Piece(int pieceNumber){
        this.name = "Piece " + pieceNumber;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }

    public String toString(){
        return name;
    }

}
