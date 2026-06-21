import java.util.*;
public class QueueByTwostack{
    static class Queue{
    static    Stack<Integer> s = new Stack<>();
     static   Stack<Integer> st = new Stack<>();

         public static boolean isEmpty(){
            return s.isEmpty();  
         }
         public static void add(int data){
           while(!s.isEmpty()){
              st.push(s.pop());
           }
           s.push(data);
           while(!st.isEmpty()){
             s.push(st.pop());
            
           }
         }
         public static int remove(){
                   if(isEmpty()){
                    System.out.print("empty queue");
                    return -1;
                   }
                //    if(s.isEmpty()){
                //  s.pop(st.pus()) ;
                //    }
                  return s.pop();
           }
           public static int peek(){
             if(isEmpty()){
                    System.out.print("empty queue");
                    return -1;
                   }
                 return s.peek();   
           }

         
        }
         public static void main(String[] args){
            // QueueByTwostack  q = new QueueByTwostack();
            Queue q = new Queue();
               q.add(1);
               q.add(2);
               q.add(3);
               q.add(4);
               while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
               }
         }
        }
