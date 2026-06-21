  import java.util.*;
   public class Link {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        // ADD ELEMENT IN lINKED LIST  
        list.addFirst("is");
              list.addFirst("this");
              list.add("a");
              list.addLast("list");
              System.out.println(list);
        // ADD IN BETWEEN
           list.add(2,"inserted");
           System.out.println(list);
           //SET ELEMENT
           list.set(0,"that");
           System.out.println(list);
           //REMOVE ELEMNET FROM LINKED LIST
          list.remove(0);
            System.out.println(list);
            //SIZE OF LINKED LIST
            System.out.println(list.size());
            // ITERATIVE THE LINKED LIST
            for (int i = 0; i < list.size();i++) {
                System.out.print(list.get(i)+"-->");  
            }
            list.addFirst("this");
            // GET ELEMENT BY INDEX
            System.out.print("\n"+list.get(3));
            System.out.println(list);
            // some remove
            list.removeFirst();
             System.out.println(list);
            list.remove();
             System.out.println(list);
            list.removeLast();
             System.out.println(list);
            list.remove(1);
             System.out.println(list);

    }
   }

