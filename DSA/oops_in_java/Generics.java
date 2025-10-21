
    class Box<T>{
        T value;
        void set(T v){ value = v;}
        T get(){
            return value;
        }
    }

    public class Generics {
    public static void main(String args[]){
        Box<Integer> b = new Box<>();
        b.set(10);
        System.out.println(b.get());
    }
}
