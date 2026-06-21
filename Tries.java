//import java.util.*;

public class Tries{
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];
            for(int i =0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
     static Node root = new Node();
     // inseerction in tries
     public static void insert(String word){
        Node curr = root;
         for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) -'a';
            if(curr.children[idx] == null){
                // add new node
                curr.children[idx] = new Node();
            }
            if(i == word.length() -1){
                curr.children[idx].eow = true;
            }
           curr = curr.children[idx];
         }    
     }
      public static boolean search(String key){// time complexcity o(L) = key length
        Node curr = root;
        for(int i = 0; i<key.length(); i++){
                 int idx = key.charAt(i) -'a';
        if(curr.children[idx] == null){
            return false;
        }
           if(i == key.length()-1 && curr.children[idx].eow == false){
              return false;
           }
          curr =curr.children[idx];
     }
     return true;
  }
// word  break
 public static boolean wordBreak(String key){
      if(key.length() == 0){
        return true;
        }

        for(int i = 1; i<=key.length(); i++){
            String firstPart = key.substring(0,i);
            String secPart = key.substring(i);
            if(search(firstPart) && wordBreak(secPart)){
                return true;
            }
        }

        return false;
 }

    public static void main(String[] args){
        // String  words [] = {"the", "a", "there", "their", "any"};
        // for(int i = 0; i<words.length; i++){
        //     insert(words[i]);
        // }
        // System.out.println(search("their"));
        // System.out.println(search("thor"));
        // System.out.println(search("an"));
  String words[] = {"i","like","sam","samsung","mobile"};
  String key = "ilikesamsung"; 

   for(int i=0; i<words.length; i++){
             insert(words[i]);
   }
    System.out.println(wordBreak(key));
    }
}