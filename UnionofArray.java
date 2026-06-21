import java.util.HashSet;
public class UnionofArray{
    public static  int unionarray(int nums1[], int nums2[]){
         HashSet<Integer> set = new HashSet<>();
         for(int i = 0; i<nums1.length; i++){
            set.add(nums1[i]);
         }
         for(int j = 0; j<nums2.length; j++){
            set.add(nums2[j]);
         }
         return set.size();
    }
    public static void main(String[] args){
       int[] nums1 = {7,3,9};
       int[] nums2 = {6,7,3,9,6,2,4};
       System.out.println(unionarray(nums1, nums2));
    }
}