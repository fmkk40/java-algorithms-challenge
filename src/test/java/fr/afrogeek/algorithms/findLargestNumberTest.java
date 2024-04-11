package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;



public class findLargestNumberTest {

    @Test

    void testfintNumber(){
        findLargestNumber tab = new findLargestNumber();
        tab.tableau = new ArrayList<>(Arrays.asList(10, -9, 45, 15, 60));
        assertEquals(60, tab.fintNumber());

    }

   /* @Test
    public void testTrouverMaxAvecTableauVide() {

        TableauDynamique tab = new TableauDynamique();
        tab.tableau = new ArrayList<>();


        assertThrows(IllegalStateException.class, () -> {
            tableauDynamique.trouverMax();
        });
    }*/
}
