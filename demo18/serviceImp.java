public class serviceImp implements service {
  private static serviceImp s;

  public static serviceImp getInstance() {
    if (s == null) {
      System.out.println("first");
      s = new serviceImp();
    }
    return s;
  }

  @Override
  public void add1(int a, int b) {
    int c = a + b;
    System.out.println("c is " + c);
  }

  @Override
  public void minus1(int a, int b) {
    int c = a - b;
    System.out.println("c is " + c);
  }
}