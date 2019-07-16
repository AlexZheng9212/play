public class demo18 {
  public void test() {

    serviceImp s = serviceImp.getInstance();
    s.add1(1, 2);
  }

  public static void main(String[] args) {
    demo18 d18 = new demo18();
    d18.test();
    d18.test();
  }
}