package Lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividingDTest {

    @Test
    void checkD() {
        int[] lista = {1,4,3,0};
        DividingD divide = new DividingD();
        assertTrue(divide.checkD(lista,4));
        lista = new int[]{3, 4, 5, 6};
        assertFalse(divide.checkD(lista,6));
        lista = new int[]{9,39,2,5,6,2};
        assertFalse(divide.checkD(lista,9));
        lista = new int[]{2,5,3,9,5,4,0,7};
        assertTrue(divide.checkD(lista,7));

    }
}