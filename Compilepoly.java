
import java.util.Scanner;

class Student{
    String name;
    int age;
    String course;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    // public void printInfo(String course){
    //     System.out.println(course);
    // }
    public void printInfo(String name, int age, String course){
        System.out.println(name + " " + age + " " + course);
    }
}
public class Compilepoly{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int age = sc.nextInt();
    String course = sc.next();
    Student st = new Student();
    st.name = name;
    st.age = age;
    st.course = course; 
    st.printInfo(st.name,st.age,st.course);
}
}