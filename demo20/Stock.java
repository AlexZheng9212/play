public class Stock {
  public String payment_id;
  public String stock_id;
  public Double amount;
  public Double price;

  public Stock() {
  }

  /**
   * @param amount the amount to set
   */
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   * @param payment_id the payment_id to set
   */
  public void setPayment_id(String payment_id) {
    this.payment_id = payment_id;
  }

  /**
   * @param price the price to set
   */
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   * @param stock_id the stock_id to set
   */
  public void setStock_id(String stock_id) {
    this.stock_id = stock_id;
  }

  /**
   * @return the amount
   */
  public Double getAmount() {
    return amount;
  }

  /**
   * @return the payment_id
   */
  public String getPayment_id() {
    return payment_id;
  }

  /**
   * @return the price
   */
  public Double getPrice() {
    return price;
  }

  /**
   * @return the stock_id
   */
  public String getStock_id() {
    return stock_id;
  }
}