//Abstraction using abstract class and interfaces

public class Abstraction {
    static abstract class vehicle{
        abstract void start(); //abstract method
    }

    static class car extends vehicle{
        void start(){
            System.out.println("car start with key");
        }
    }

    //interface
    interface payment{
        void pay(int amount);
    }

    static class upi implements payment{
        public void pay(int amount){
            System.out.println("paid " + amount + " via upi");
        }
    }

    public static void main(String args[]){
        vehicle v = new car();
        v.start();
        payment p = new upi();
        p.pay(100);
    }
}
