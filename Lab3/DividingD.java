package Lab3;

import java.util.*;

public class DividingD {
    public static void main(String[] args){
        int[] lista = {1,2,3,4,5,6,3,3,4,4};
        DividingD divide = new DividingD();
        System.out.println(divide.checkD(lista,7));
    }
    public boolean checkD(int[] array,int d){
        if(array.length%2 ==1)return false;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Integer tmpvalue = 0;
        Integer moduloresult = 0;
        for (int i = 0; i < array.length; i++) {
            moduloresult = array[i]%d;
            if(hashMap.get(moduloresult) != null) {
                tmpvalue = hashMap.get(moduloresult);
            }else{
                tmpvalue = 0;
            }
            hashMap.put( moduloresult ,tmpvalue +1);
        }

        if(hashMap.get(0) != null && hashMap.get(0)%2 ==1){
            return false;
        }else {
            hashMap.remove(0);
        }

        System.out.println(hashMap);

        int k = d-1;
        for (int i = 1; i < d/2+1; i++) {
            if(!hashMap.get(i).equals(hashMap.get(k))){
                return false;
            }else if(i == k && hashMap.get(i)%2 == 1) {
                return false;
            }else{

                k--;
            }
        }

        return true;
    }
}
