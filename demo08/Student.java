import java.util.ArrayList;
import java.util.List;

public class Student{
    public int sid;
    public String sname;
    public String smajor;
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
     * @return the sname
     */
    public String getSname() {
        return sname;
    }
    /**
     * @param sname the sname to set
     */
    public void setSname(String sname) {
        this.sname = sname;
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
    public Student(int id, String name, String major){
        sid = id;
        smajor = major;
        sname = name;
    }
    public String StudentDetail(){
        return getSmajor()+getSname();
    }
    public static void main(String[] args) {
        List<Student> s = new ArrayList<Student>();
        Student foo = new Student(10, "Alex", "CS");
        s.add(foo);
        System.out.println(s.get(0).getSname());
    }

}