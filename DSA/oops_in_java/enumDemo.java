public class enumDemo {
    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String args[]){
        Day today = Day.MONDAY;
        System.out.println(today);
    }
}


// enum Level { LOW, MEDIUM, HIGH }

// class TestSwitch {
//     public static void main(String[] args) {
//         Level l = Level.HIGH;

//         switch (l) {
//             case LOW: System.out.println("Low level"); break;
//             case MEDIUM: System.out.println("Medium level"); break;
//             case HIGH: System.out.println("High level"); break;
//         }
//     }
// }
