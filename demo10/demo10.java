class Employee{
    String name;
}

interface ManagerInterface{
     static final String title = "MG";
}

class Manager extends Employee implements ManagerInterface{
    public class leadEmployee{
        String name;
    }
}

public class demo10{
    public static void main(String[] args) {
        Manager m = new Manager();
        Manager.leadEmployee le = m.new leadEmployee();
    }
}