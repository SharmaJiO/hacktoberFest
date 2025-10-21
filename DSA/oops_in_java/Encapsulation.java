//Four pillars of oop


//1. Encapsulation - data hiding
public class Encapsulation {
    private String studentname;  // private->wil remain hidden 

    //getter
    public String getName(){
        return this.studentname;
    }

    //setter
    public void setName(String name){
        this.studentname = name; 
    }
    public static void main(String args[]){
        Encapsulation obj = new Encapsulation();
        obj.setName("vishwajeet");
        System.out.println(obj.getName());
    }
}

