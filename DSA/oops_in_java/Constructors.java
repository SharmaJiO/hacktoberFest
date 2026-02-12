class Constructors {

    //default const
    static class Animal{
        Animal(){
            System.out.println("This is a default constructor");
        }
    }

    //paremerized const
    static class mammals{
        String name;
        mammals(String name){   //this is a parameterized constructor
            this.name = name;
            System.out.println(this.name + " belongs to the mammals class");
        }
    }

    //copy const
    static class viviparous{
        String vivianimalname;
        viviparous(String vivi){
            this.vivianimalname = vivi;
            System.out.println(this.vivianimalname + " is a viviparous animal");
        }
        viviparous(viviparous v){
            this.vivianimalname = v.vivianimalname;
        }
    }
    public static void main(String args[]){
        Animal A = new Animal(); //calls a default constructor
        mammals m = new mammals("Monkey"); //calls const
        viviparous v = new viviparous("Monkey"); //calls const
    }
}
