import javafx.print.PrintColor;

class WS{
    private String s;
    WS(){
        s = new String("Constructed");
    }
    public String toString(){
        return s;
    }
}

public class demo12{
    WS ws = new WS();
    void print(){
        System.out.println(ws.getClass());
    }
    public static void main(String[] args) {
        demo12 d12 = new demo12();
        d12.print();
    }
}