import java.util.*;

class Student implements Comparable<Student>{
    int age; String name;
    Student(int a, String n){
        this.age = a;
        this.name = n;
    }

    public int compareTo(Student s){
        return age - s.age;
    }

}

public class Advancedsorting {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>(Arrays.asList(
            new Student(27,"sai"), new Student(23,"yash")
        ));
        //sorting by comparator - custom order
        Collections.sort(list, Comparator.comparing(s -> s.name));
        //Collections.sort(list); //-  natural order
        for(Student s: list){
            System.out.println(s.age + " " + s.name);
        }


    }
}
