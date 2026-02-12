public class ImmutObjString {
    public static void main(String args[]){
        String str = "sai";
        str.concat(" deshmane");
        System.out.println(str); // sai (not changed, new object created)
    }
    
}
