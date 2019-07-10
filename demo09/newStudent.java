class Student {
    int sid;
    String smajor;

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * @return the smajor
     */
    public String getSmajor() {
        return smajor;
    }

    /**
     * @param smajor the smajor to set
     */
    public void setSmajor(String smajor) {
        this.smajor = smajor;
    }
}

class StudentInterface implements StudentApi {
    public boolean isCS(Student s) {
        if (s.smajor.equals("CS"))
            return true;
        return false;
    }
    public int isName(Student s){
        return s.getSid();
    }
}

class FruitInterface implements FruitApi{
    public void apple(){
        System.out.println("say hi");
    }
}

public class newStudent{
    public static void main(String[] args) {
        Student s = new Student();
        s.setSid(10);
        s.setSmajor("CS");
        StudentApi sapi = new StudentInterface();
        System.out.println(sapi.isCS(s));
        System.out.println(sapi.isName(s));
        FruitApi fapi = new FruitInterface();
        fapi.apple();
    }
}