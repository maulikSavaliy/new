public class one {
    public static void main(String[] args) {
        cocatinationstring("maulik","savaliya");
        samesequance("maulik savaliya","savaliya");
    }
    //concatination
    static void cocatinationstring(String name, String surname){
        System.out.println("string 1 :" + name);
        System.out.println("string 2 :" + surname);
        System.out.println("concatinate string :" + name + surname);
    }
    // to find same sequance
    static void samesequance(String name,String surname){
        System.out.println("String 1 :" + name);
        System.out.println("String 2 :" + surname);
        System.out.println("to find same sequance :" + name.contains(surname));
    }
}
