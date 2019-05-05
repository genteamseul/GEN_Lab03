package Game;

public class Cup {

    private Die[] dice = new Die[]{new Die(), new Die()};

    public void roll(){
        for(Die d : dice){
            d.roll();
        }
    }

    public int getTotal() {
        int result = 0;
        for (Die d : dice) {
            result += d.faceValue();
        }
        return result;
    }

}
