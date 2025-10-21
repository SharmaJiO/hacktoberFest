public class Static{
    static class counter{   //static class
        static int count = 0;   //static variable
        counter(){
            count++;
        }
    }

    public static void main(String args[]){
        counter c1 = new counter();
        counter c2 = new counter();
        System.out.println(counter.count);
    }
}