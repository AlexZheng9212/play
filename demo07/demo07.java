class apple{
    public static int Price = 10;
    public boolean Sweet = false;
    public int Size = 20;
    /**
     * @param price the price to set
     */
    public static void setPrice(int price) {
        Price = price;
    }
    /**
     * @return the price
     */
    public static int getPrice() {
        return Price;
    }
    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        Size = size;
    }
    /**
     * @return the size
     */
    public int getSize() {
        return Size;
    }
}
public class demo07 extends apple{
    public boolean FX;
    public demo07(){
        setSize(90);
        System.out.println("extends apple");
    }
    public static void main(String[] args) {
        demo07 ao = new demo07();
        ao.Sweet = true;
        System.out.println(ao.Sweet+" "+ao.Size+" "+ao.Price+" "+ao.FX);
    }
}