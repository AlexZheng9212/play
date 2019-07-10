import java.util.ArrayList;

public class demo17 {
    ArrayList<String> s1 = new ArrayList<String>();

    class ThreadToGo {
        int value = 1;
    }

    private final ThreadToGo ttg = new ThreadToGo();


    public Runnable newThreadTwo() {
        final String[] inputArr = helper.buildCharArr(26);
        return new Runnable() {
            private String[] arr = inputArr;
            @Override
            public void run() {
                try {
                    for (int i=0; i<arr.length; i++){
                        synchronized (ttg){
                            while (ttg.value == 1) 
                                ttg.wait();
                            s1.add(arr[i]);
                            ttg.value = 1;
                            ttg.notify();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("2556");
                }
            }
        };
    }

    public Runnable newThreadOne() {
        final String[] inputArr = helper.buildNoArr(52);
        return new Runnable() {
            private String[] arr = inputArr;
            @Override
            public void run() {
                try {
                    for (int i=0; i<arr.length; i=i+2){
                        synchronized (ttg){
                            while (ttg.value == 2) 
                                ttg.wait();
                            s1.add(arr[i]);
                            s1.add(arr[i+1]);
                            ttg.value = 2;
                            ttg.notify();
                        }
                    }
                } catch (Exception e) {
                    System.out.println("2556");
                }
            }
        };
    }

    public static void main(String[] args) {
        demo17 d17 = new demo17();
        // helper.instance.run(d17.newThreadOne());
        helper.instance.run(d17.newThreadTwo());
        helper.instance.run(d17.newThreadOne());
        helper.instance.stop();
        for(int j=0; j<d17.s1.size(); j++){
            System.out.println(d17.s1.get(j));
        }
    }
}
