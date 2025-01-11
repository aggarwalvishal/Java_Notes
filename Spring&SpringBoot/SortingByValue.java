import java.util.*;
public class SortingByValue
{
     public static void main(String []args){
        HashMap<Integer,String> hmap = new HashMap<>();
        hmap.put(1,"Z");
        hmap.put(2,"a");
        hmap.put(4,"B");
        hmap.put(3,"A");
        hmap.put(5,"z");
        hmap.put(6,"b");
        System.out.println("Before Sort the map");
        System.out.println(hmap);
        Map<Integer,String> result = sortByValue(hmap);
        System.out.println("After Sort the map");
        System.out.println(result);
        
        
     }
     public static Map<Integer,String> sortByValue(HashMap<Integer,String> map)
     {
         List<Map.Entry<Integer,String>> list = new LinkedList<>(map.entrySet());
         
         Collections.sort(list, (o1,o2)-> o1.getValue().compareTo(o2.getValue()));
         
         LinkedHashMap<Integer,String> result = new LinkedHashMap<>();
         
         for(Map.Entry<Integer,String> e : list)
         {
             result.put(e.getKey(),e.getValue());
         }
         return result;
     }
}