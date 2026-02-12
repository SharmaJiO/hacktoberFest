//used to refer parent class
//1. can be used to access the attr,methods of parent class in subclass
//2. can be used to call parent class constructor

public class SuperKeyword {
    static class Animal{
        Animal(){
            System.out.print("these are voices of Animmals");
        }
        String type = "mammals";
        public void animalsound(){
            System.out.println("Animal makes sound");
        }
    } 

    static class Dog extends Animal{
        Dog(){
            super();
            System.out.println();
        }
        public void animalsound(){
            super.animalsound(); //call the parent method
            System.out.println("Dogs are " +super.type +", Dogs says : bow bow"); // access parent atrribute
        }
    }

    public static void main(String args[]){
        // Animal animal = new Animal();
        // System.out.println();
        // System.out.println( animal.type);
        // animal.animalsound();

        Dog d = new Dog();
        d.animalsound();
    }
}
