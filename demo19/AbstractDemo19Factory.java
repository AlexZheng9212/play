public abstract class AbstractDemo19Factory extends AbstractDemoFactory {
  @Override
  public void get(int i) {
    System.out.println("override abstractdemofactory");
    System.out.println(i);
  }

  public abstract void getDemo(int j);
}