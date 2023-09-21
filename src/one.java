import org.w3c.dom.ls.LSOutput;

public class one {
int a =200;
int b =25;
    static one onepractice = new one();
    public static void main(String[] args) {
        cocatinationstring("maulik","savaliya");
        samesequance("maulik savaliya","savaliya");
        onepractice.spacialchar("today £ rate is 104");
        onepractice.add(38,40);
        onepractice.equal();
        notequal(20,30);
        onepractice.logical(5);
        or(5);
        onepractice.not(5);
        onepractice.addition(12);
        onepractice.multipal(3);
        modulos(3);


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
        System.out.println("to find same sequance :" + name.lastIndexOf(1));
    }
    //remove spacial char
    void spacialchar(String santance){
        System.out.println("original santance :" + santance);
        System.out.println("new santance :" + santance.replaceAll("[^a-zA-Z0-9]"," "));
    }
// calculator
     void add(int a,int b){
        int answer=a+b;
         System.out.println(answer);

    }
// equal to
    void equal(){
        System.out.println(a==b);
    }
// not equal to !=
    static void notequal(int a,int b){
        System.out.println(a!=b);
    }
    //logical operator and
    void logical(int X){
        System.out.println(X==5 && X!=10);
    }
    //logical operator or
    static void or(int X){
        System.out.println(X<10 || X>10);
    }
    void not(int x){
        System.out.println(!(x<3 || x>10));
    }
    //assesment opertor
    //addition assesment
    void addition(int x){
        System.out.println(x+=10);
    }
    void multipal(int x){
        System.out.println(x*=3);
    }
    //modulos operator
    static void modulos(int x){
        System.out.println(x%=3);
    }
}
