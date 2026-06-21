import java.util.*;
public class Hash{
    public static void main(String[] args){
        // Creating a Hash Map
          HashMap<String ,Integer> map = new HashMap<>();

        //Inserction
         map.put("India" , 120);
         map.put("USA" , 39);
         map.put("china" , 130);
         map.put("srilank" , 15);
         map.put("nepal" , 7);
         map.put("russia" , 50);
        
         // System.out.println(map);

         // search operation or look up operation
         // if(map.containsKey("china")){
         //    System.out.println("true or key is present in the map");
         // }else {
         //    System.out.println("key is not present in the map");
         // }
         // System.out.println(map.get("India"));// key exists
         // System.out.println(map.get("Indonesia"));// key does not exists

         // int[] arr = {1,2,3,4,5,6,7,8,9};
         // for(int val : arr){
         //    System.out.print(val+" ");
         // }
         // System.out.println();
         // Iteration
         // for(Map.Entry<String,Integer> e : map.entrySet()){
         //    System.out.println(e.getKey());
         //    System.out.println(e.getValue());
         // }
         // Iteration 2 method
         // Set<String> keys = map.keySet();
         // for(String key : keys){
         //    System.out.println(key+" "+map.get(key));
         // }
         // remove key value from map
         map.remove("china");
         System.out.println(map);
    }
}