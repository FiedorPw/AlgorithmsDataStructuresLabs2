package Lab3;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    @Test
    void get() {
        LRUCache cache = new LRUCache<String,Integer>(3);
        cache.put("klucz1",1);
        cache.put("klucz2",2);
        cache.put("klucz3",3);
        cache.put("klucz4",4);

        System.out.println("");
        cache.put("klucz5",5);
        System.out.println("");
    assertTrue(cache.get("klucz3").equals(3));
    assertTrue(cache.get("klucz5").equals(5));
    assertThrows(NoSuchElementException.class, () -> cache.get("klucz1"));

}

    @Test
    void put() {

        LRUCache cache = new LRUCache<String,Integer>(3);
        cache.put("klucz1",1);
        cache.put("klucz2",2);
        cache.put("klucz3",3);
        cache.put("klucz4",4);
        assertTrue(cache.get("klucz3").equals(3));
        assertTrue(cache.get("klucz4").equals(4));


    }
}