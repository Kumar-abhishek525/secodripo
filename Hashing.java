import java.util.HashSet;
import java.util.Iterator;
public class Hashing{
    public static void main(String[] args){
        // creating a hashset
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        // // Search 
        // if(set.contains(1)){
        //     System.out.println("set contains 1");
        // }
        // if(!set.contains(4)){
        //     System.out.println("set does not contains ");
        // }
        // // Delete operation
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("set does not contains we deleting one ");
        // }
        // // size of hashset
        //  System.out.println("size of set is : "+set.size());
        //  print all element od set
        //  System.out.println(" "+set);

    // Iterator
       Iterator it = set.iterator();
       // Iterarot has two funcation i. next() ii. hashnext()
       while(it.hasNext()){
            System.out.println(" "+it.next());
       } 
    }
}