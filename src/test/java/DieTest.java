import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DieTest {

    @Test
    void notOutOfBoundsDie(){
        boolean outOfBounds = false;
        Die die = new Die();
        for (int i = 0; i < 1000; i++){
            die.roll();
            if(die.faceValue() < 1 || die.faceValue() > 6){
                outOfBounds = true;
            }
        }
        assertFalse(outOfBounds);
    }
}
