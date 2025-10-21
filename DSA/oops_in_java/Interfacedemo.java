interface Animal{
    void sound(); // bydefault abstract method + public 
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Dog says wooooow wufff..");
    }
}

public class Interfacedemo {
    public static void main(String args[]){
        Animal a = new Dog();
        a.sound();
    }
}
