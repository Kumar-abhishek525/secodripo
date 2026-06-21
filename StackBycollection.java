import java.util.*;
public class StackBycollection{
    // PUSH AT BOTTOM FUNCATION     
    public static void addatbottom(int data ,Stack<Integer> s){
             if(s.isEmpty()){
                s.push(data);
                return;
             }     
            int top = s.pop();
            addatbottom(data,s);
            s.push(top);
           }
       public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(5);
        s.push(10);
        s.push(20);
          addatbottom(100 , s);
         while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
         }
    }
}