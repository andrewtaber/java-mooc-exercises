
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        
        Scanner read = new Scanner(System.in);
        
        String name;
        String studentNumber;
        
        System.out.print("name: ");
        name = read.nextLine();
        
        while(!name.isEmpty()) {
            System.out.print("studentnumber: ");
            studentNumber = read.nextLine();
            
            list.add(new Student(name, studentNumber));
            
            System.out.print("name: ");
            name = read.nextLine();
        }
        
        for(Student student : list) {
            System.out.println(student);
        }
        
        String searchTerm;
        
        System.out.print("Give search term:");
        searchTerm = read.nextLine();
        System.out.println("Result:");
        
        
        for(Student student : list) {
            if(student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}