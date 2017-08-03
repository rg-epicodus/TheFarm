package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class FarmTest {

    @Test
    public void newGame_instantiatesCorrectly_true() {
        Farm testFarm = new Farm();
        assertEquals(true, testFarm instanceof Farm);
    }

}