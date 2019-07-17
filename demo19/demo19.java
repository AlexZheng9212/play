public class demo19 extends AbstractDemo19Factory {
  @Override
  public void getDemo(int j) {
    System.out.println(j);
  }

  public static void main(String[] args) {
    demo19 d19 = new demo19();
    d19.get(12);
    d19.getDemo(14);
  }
}