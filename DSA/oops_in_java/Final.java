public class Final {
    final class parent{
        // this class cannet be inheited , gives error if tried do so
    }
    final int x = 5;
    final void show(){
        System.out.println("This is a method declared as a final !");
    }

    // class child extends parent{
    //     super.x = 10;
    //     super.show(){
    //         System.out.println("This child class trying to override the final method");
    //     }
    // }

    public static void main(String args[]){
        Final obj = new Final();
        obj.show();
    }
}
