public abstract class StockService extends BaseService<Stock, StockDto> {
  @Override
  public Stock create(StockDto sd) {
    Stock stock = new Stock();
    stock.setAmount(sd.amount);
    stock.setStock_id(sd.stockId);
    System.out.println("create stock payment");
    return stock;
  }

  public abstract void init();
  // @Override
  // public Stock cancel(StockDto sd) {
  // Stock stock = new Stock();
  // stock.setAmount(sd.amount);
  // stock.setStock_id(sd.stockId);
  // System.out.println("cancel stock payment");
  // return stock;
  // }
}