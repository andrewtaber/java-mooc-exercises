public class Main {
    public static void main(String[] args) {
        // Test your program here
        Changer thing = new Changer();
        thing.addChange(new Change('a', 'b'));
        thing.addChange(new Change('c', 'd'));
        System.out.println(thing.change("The quick brown fox jumped over the lazy dog"));
    }
}
