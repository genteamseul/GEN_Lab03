import Game.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    void goodBoardCreation(){
        Board board = new Board();
        assertEquals("GO", board.start().toString());
        for(int i = 1; i < 40; i++){
            //if()
        }
    }

}
