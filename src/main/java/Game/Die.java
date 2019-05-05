package Game;

public class Die {

    private int faceValue;

    public Die(){
        faceValue = (int)Math.floor(Math.random()*5)+1;
    }

    public int faceValue(){
        return faceValue;
    }

    public void roll(){
        faceValue = (int)Math.floor(Math.random()*5)+1;
    }

}
