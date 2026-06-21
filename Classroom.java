import java.util.*;
// hash map majority element problem
public class Classroom{
   public static void majorityElement(int nums[]){
    HashMap<Integer,Integer> map = new HashMap<>();
      int n = nums.length;
      for(int i=0; i<n; i++){
        if(map.containsKey(nums[i])){// key already exits
            map.put(nums[i],map.get(nums[i]) + 1);
        }else{ // key does not exits
           map.put(nums[i], 1);
        }
      }
      // advanced for loop
      for(int key: map.keySet()){
        if(map.get(key) > n/3){
            System.out.println(key);
        }
      }
   }

   public static void main(String[] args){
       int nums[] = {1,2};
    // int nums[] ={1,3,2,5,1,3,1,5,1};
     majorityElement(nums);
  }
}
