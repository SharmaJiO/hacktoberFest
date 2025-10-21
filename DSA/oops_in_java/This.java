public class This {
    static class parent{
        int x = 5;
    }

    static class child extends parent{
        int x = 10;
        void print(){
            System.out.println(this.x);
            System.out.println(super.x);
        }
    }

    public static void main(String args[]){
        child c = new child();
        c.print();
    }
}



//uses of this -
//1. access instance varaibles when local variables shadow them 

// public class test{
//     int x ; 
//     Test(int x){
//         this.x = x;   //this.x = instance variable //x = local variable
//     }
// }

//2. call another constructor in same class

// class demo{
//     demo(){
//         this(10); //calls perimeterized constructor
//     }
//     demo(int x){
//         System.out.println(x);
//     }
// }

//3. pass curr obj as arg

// class A {
//     void show(B b) { }
//     void call() {
//         B b = new B();
//         b.display(this);  // pass current object
//     }
// }
// class B {
//     void display(A obj) { }
// }


//4. return curr obj from a method
class calc{
    clac add(){
        return this;
    }
}