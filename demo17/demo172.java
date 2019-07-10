import java.util.concurrent.LinkedBlockingQueue;
public class demo172 {
  private final LinkedBlockingQueue<String> queue1 = new LinkedBlockingQueue<>();
  private final LinkedBlockingQueue<String> queue2 = new LinkedBlockingQueue<>();

  public Runnable newThreadTwo() {
    final String[] inputArr = helper.buildCharArr(26);
    return new Runnable() {
      String[] arr = inputArr;
      @Override
      public void run() {
        for(int i=0; i< arr.length; i++){
          try {
            queue2.take();
            System.out.println(arr[i]);
            queue1.put("2to1");
          } catch (Exception e) {
            //TODO: handle exception
          }

        }
    }
  };
  }

  public Runnable newThreadOne() {
    final String[] inputArr = helper.buildNoArr(52);
    return new Runnable() {
      String[] arr = inputArr;
      @Override
      public void run() {
        for(int i=0; i< arr.length; i=i+2){
          helper.print(arr[i], arr[i+1]);
          try {
            queue2.put("1to2");
            queue1.take();
          } catch (Exception e) {
            //TODO: handle exception
          }

        }
    }
  };
  }

  public static void main(String[] args) {
    demo172 d172 = new demo172();
    helper.instance.run(d172.newThreadOne());
    helper.instance.run(d172.newThreadTwo());
    helper.instance.stop();
  }
}