public class wrapperClass {
    public static void main(String args[]){
        Integer myint = 10;  
        System.out.println(myint);
        System.out.println(myint.intValue());
        int a = 100;  //primitive
        Integer num = Integer.valueOf(a);
        System.out.println(num);
    }
}
