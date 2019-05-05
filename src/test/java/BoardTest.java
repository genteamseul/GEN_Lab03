import Game.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @BeforeEach
    void goodBoardCreation(){
        Board board = new Board();
        assertEquals("GO", board.start().toString());
        for(int i = 1; i < 40; i++){
            assertEquals(board.getSquare(board.start(),i).getIndex(), i);
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"1","9"})
    public void throwIfLessThanTwoPlayersOrMoreThanEight(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(IllegalArgumentException.class, () -> new MonopolyGame());

    }


}
