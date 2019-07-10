import sun.print.resources.serviceui;

class Chair{
    static boolean gcrun = false;
    static boolean f = false;
    static int created = 0;
    static int finalized = 0;
    int i;
    Chair(){
        i = ++created;
        System.out.println("i : "+i);
        if(created == 47){
            System.out.println("Created 47");
        }
    }
    protected void finalize(){
        if(!gcrun){
            gcrun = true;
            System.out.println("Begining....");
        }
        if(i == 47){
            System.out.println("stop to create chair");
            f = true;
        }
        finalized++;
        if(finalized >= created){
            System.out.printfln(finalized);
        }
    }
}
public class demo04{
    public static void main(String[] args) {
        int j = 0;
        while(!Chair.f&&j<50){
            new Chair();
            new String();
            System.out.println(Chair.created+" "+Chair.f+" "+Chair.finalized);
            ++j;
        }
        System.gc();
    }
}