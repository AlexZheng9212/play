import java.util.*;
class tree{
    private int height;
    public void setheight(int height){
        this.height = height;
    }
    public int getheight(){
        return height;
    }
}
public class demo02{
    public demo02(){
        tree t = new tree();
        t.setheight(2);
        System.out.println(t.getheight());
    }
    public static void main(String[] args){
        demo02 d2 = new demo02();
    }
}
