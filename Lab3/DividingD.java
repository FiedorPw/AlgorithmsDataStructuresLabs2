package Lab3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class DividingD {
    public static void main(String[] args){
        Integer[] lista = {1,2,3,4,5,6};
        DividingD divide = new DividingD();
        divide.checkD(lista,3);
    }
    public boolean checkD(Integer[] array,int d){
        if(array.length%2 ==1)return false;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]%d;

        }
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Collections.addAll(linkedList, array);

        System.out.println(linkedList);


        return true;
    }
}
