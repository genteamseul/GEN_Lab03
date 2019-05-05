import Game.Die;
import org.junit.jupiter.api.RepeatedTest;
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

    @RepeatedTest(5)
    void theTwoDiceProduceAtLeastADifferentOutcome() {
        Die[] dice = new Die[]{new Die(), new Die()};

        for (int i = 0; i < 1000; i++) {
            for(int j = 0; j < 2; j++){
                dice[j].roll();
            }

            if (dice[0] != dice[1]) {
                return;
            }
        }
        fail();
    }

}
