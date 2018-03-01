package personnel;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Employees e = new Employees();
        Person a = new Person("Steven", Education.D);
        
        e.add(a);
        e.print();
        e.print(Education.D);
    }
}
