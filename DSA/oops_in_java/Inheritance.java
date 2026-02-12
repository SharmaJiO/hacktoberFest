public class Inheritance {
    static class Animal{
        protected String Animaltype = "mammals";
        public void sound(){
            System.out.println("Animal makes sound");
        }
    }
    static class Dog extends Animal{
        public void sound(){
            System.out.println("Dog barks !");
        }
            
    }
    
    public static void main(String args[]){
        Dog obj = new Dog();
        System.out.println(obj.Animaltype);
        obj.sound();

    }
}
