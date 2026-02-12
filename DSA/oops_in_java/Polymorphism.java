//polymorphism - many forms,same methods behaves differently usually occurs during inheritance

public class Polymorphism {
    static class Animal{
        public void animalsound(){
            System.out.println("The animal makes a sound");
        }
    }

    static class Pig extends Animal{
        public void animalsound(){
            System.out.println("The pig says : wee wee");
        }
    }
    
    static class Dog extends Animal{
        public void animalsound(){
            System.out.println("The dog says : boww boww");
        }
    }

    public static void main(String args[]){
        Animal obj1 = new Animal();
        Pig pig = new Pig();
        Animal Dog = new Dog();
        obj1.animalsound();
        Dog.animalsound();
        pig.animalsound();

    }
}
