
import java.util.*;
public class RevserveStack{
    public static void reversestack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }      
        int top = s.pop();
               reversestack(s);
               addatbottom(top , s);
                
    }
           public static void addatbottom(int data ,Stack<Integer> s){
            if(s.isEmpty()){
                s.push(data);
                return ;
            }
                 int top = s.pop();
                 addatbottom(data ,s);
                 s.push(top);   
           }
    
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
         s.push(2);
          s.push(3);
           s.push(4);
            s.push(5);
            reversestack(s);
            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
            
    }
}

