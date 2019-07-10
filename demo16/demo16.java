class HasPrivate  {
    private int num = 0;
    synchronized public void addI(String username){
        try {
            if(username.equals("a")){
                num = 100;
                System.out.println("a ");
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println("b ");
            }
            System.out.println(username + num);
        } catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
class ThreadA extends Thread {
    private HasPrivate d16;
    public ThreadA(HasPrivate d16){
        super();
        this.d16 = d16;
    }

    @Override
    public void run(){
        super.run();
        d16.addI("a");
    }
}
class ThreadB extends Thread {
    private HasPrivate d16;
    public ThreadB(HasPrivate d16){
        super();
        this.d16 = d16;
    }

    @Override
    public void run(){
        super.run();
        d16.addI("b");
    }
}

public class demo16 {
    public static void main(String[] args) {
        HasPrivate d16 = new HasPrivate();
        HasPrivate d17= new HasPrivate();
        HasPrivate d18 = new HasPrivate();
        HasPrivate d19 = new HasPrivate();

        ThreadA ta = new ThreadA(d16);
        ta.start();
        ThreadB tb = new ThreadB(d17);
        tb.start();
        ThreadA tc = new ThreadA(d18);
        tc.start();
        ThreadB td = new ThreadB(d19);
        td.start();
    }
}