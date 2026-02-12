//Abstract class - class which cannot be used to create obj and can be accessed by subclass which inherrits abstract class
//Abstract method - method which can de used in abstract class only and it does not have method body, body can be provided by subclass inheriting the abstract class

public class AbstractDemo {
    //abstract class
    static abstract class Animal{
        // abstract method(does not have body)
        public abstract void animalsound();
        //regular method 
        public void sleep(){
            System.out.println("Zzz..");
        }
    }

    //subclass(inherits abstract class - Animal)
    static class Pig extends Animal{
    public void animalsound(){
        // The body of animalSound() is provided here
        System.out.println("pig says weeeeee");
    }
    }

    public static void main(String args[]){
        Pig mypig = new Pig();
        mypig.animalsound();
        mypig.sleep(); 
    }
}
