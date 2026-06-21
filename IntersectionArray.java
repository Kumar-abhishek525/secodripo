import java.util.*;
public class IntersectionArray{
    public static int interasectionarray(int nums1[], int nums2[]){
          HashSet<Integer> set = new HashSet<>();
          int count = 0;
          for(int i = 0 ; i<nums1.length; i++){
                  set.add(nums1[i]);
          }
          for(int j=0; j<nums2.length; j++){
            if(set.contains(nums2[j])){
                count++;
                set.remove(nums2[j]);
            }
          }
          return count;
    }

    public static void main(String[] args){
        int[] nums1  ={7,3,9};
        int[] nums2 = {6,3,9,2,9,4};
        System.out.println(interasectionarray(nums1, nums2));
    }
}