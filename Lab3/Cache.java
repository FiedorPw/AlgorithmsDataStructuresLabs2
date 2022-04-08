package Lab3;

import java.util.HashMap;
import java.util.LinkedList;

public class Cache<T> {
  public static void main(String[] args){
      LRUCache cache = new LRUCache(3);
      cache.put("klucz1",1);
      cache.put("klucz2",2);
      cache.put("klucz3",3);
      cache.put("klucz4",4);
      System.out.println(cache.get("klucz2"));
      System.out.println(cache.get("klucz3"));
      System.out.println(cache.get("klucz4"));
      System.out.println("");
      cache.put("klucz5",5);
      System.out.println("");
      cache.printNodes();

  }
}
