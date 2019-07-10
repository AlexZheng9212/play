public class flower{
    private int petalCount = 0;
    private String s = new String("null");
    Flower(int petals){
        petalCount = petals;
        System.out.printLn(petalCount);
    }
    Flower(String ss){
        System.out.println(ss);
    }
    Flower(String s, int petals){
        this.s = s;
    }
    Flower(){
        this.s("hi", 12);
    }
}