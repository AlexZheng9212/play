class Mug{
    Mug(int marker){
        System.out.println(marker);
    }
}
public class demo06{
    Mug c1;
    Mug c2;
    {
        c1 = new Mug(1);
        c2 = new Mug(2);
    }
    demo06(){
        System.out.println("Mugs");
    }
    public static void main(String[] args) {
        demo06 d = new demo06();
    }
}