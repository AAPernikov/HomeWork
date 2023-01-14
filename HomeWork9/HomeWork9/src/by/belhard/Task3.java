package by.belhard;

import by.belhard.model.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args){
        Integer[] array = new Integer[]{1,2,2,3,3,5,5,7};
        Map<Integer,Integer> mapInteger=arrayToMap(array);
     printEntries(mapInteger);
    }
    private static <T> void printEntries(Map<T, Integer> map) {// метод для печати
        Set<Map.Entry<T,Integer>> entries = map.entrySet();
        for (Map.Entry<T, Integer> entry : entries) {
            System.out.printf(entry.getKey()+":"+ entry.getValue()+", ");
        }
    }
    private static <T> Map<T,Integer> arrayToMap (T[] keys){
        Map<T,Integer> map = new HashMap<>();
       for (T key:keys){
           if (map.containsKey(key)){
               Integer oldValue= map.get(key);
               map.put(key,oldValue+1);
           }
           else {
               map.put(key,1); // 1 - так как в мар нет еще такого ключа
           }
       }


        return map;
    }
}
