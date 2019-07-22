public class StockSeriveImp extends StockService {
  @Override
  public void init() {
    System.out.println("initing...");
  }

  @Override
  public Stock cancel(StockDto sd) {
    Stock s = new Stock();
    return s;
  }
}