import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;


public class demo14{
    public static void main(String[] args) {
        MeauBuilder.getInstance();
    }
}

interface item{
    public String name();
    public BigDecimal price();
    public Pack pack();
}

interface Pack{
    public String pack();
}

class Wrapper implements Pack{
    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottom implements Pack{
    @Override
    public String pack() {
        return "Button";
    }
}

abstract class Burger implements item{
    @Override
    public Pack pack() {
        return new Wrapper();
    }

    @Override
    public abstract BigDecimal price();

}

abstract class Coke implements item{
    @Override
    public Pack pack() {
        return new Bottom();
    }
    public abstract BigDecimal price();
}

class Veg extends Burger{
    @Override
    public String name() {
        return "Veg";
    }
    @Override
    public BigDecimal price() {
        return new BigDecimal("10.01");
    }
}

class NoVeg extends Burger{
    @Override
    public String name() {
        return "NoVeg";
    }
    @Override
    public BigDecimal price() {
        return new BigDecimal("6");
    }
}

class Pepsi extends Coke{
    @Override
    public String name() {
        return "Pepsi";
    }
    @Override
    public BigDecimal price() {
        return new BigDecimal("3");
    }
}

class Meau{
    
    private List<item> items = new ArrayList<item>();
    public void addItem(item it){
        items.add(it);
    }

    public BigDecimal getPrice(){
        BigDecimal cost = new BigDecimal("0");
        for(item it: items){
            cost = cost.add(it.price());
        }
        return cost;
    }

}

class MeauBuilder{
    private MeauBuilder (){
        Meau meau = new Meau();
        meau.addItem(new Veg());
        System.out.println(meau.getPrice());
    }
    private static MeauBuilder instance = new MeauBuilder();
    public static MeauBuilder getInstance(){
        return instance;
    }
}