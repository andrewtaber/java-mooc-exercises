public class Main {
  public static void main(String[] args) {
    // write test code here
    Person petteri = new Person("Petteri", 31, 12, 2009);
    Person jarmo = new Person("Jarmo", 1, 1, 2010);
    
    System.out.println(petteri.olderThan(jarmo));

      
  }
}