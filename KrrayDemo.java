import java.util.ArrayList;
public class KrrayDemo{
    public static void main(String[] args){
      ArrayList<Integer> arr = new ArrayList<Integer>();
      //add a elemet in array
      arr.add(5);
      arr.add(10);
      arr.add(15);
      arr.add(20);
      System.out.println(arr);
      //add all
      // arr.addAll(1,3,5,6,7);
      // check empty
      System.out.println(arr.isEmpty());
     // calculate size
      System.out.println(arr.size());
      //remove element
     // System.out.println(arr.remove(3));
     //remove all
      // System.out.println(arr.removeAll());
      //clear
      // System.out.println(arr.clear());
      // clearAll
     // get element
       int a = arr.get(2);
      int b = arr.get(3);
      System.out.println(" " +a+b);
      // set element 
      arr.set(0,50);
      System.out.println(arr);
    }
}
