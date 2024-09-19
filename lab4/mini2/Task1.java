/**
 * This test only works for Task 1
 */
public class Task1 {
  public static void main(String[] args) {
    CS2030STest we = new CS2030STest();

    Pair<String, Integer> p1 = new Pair<>("CS2030S", 100);
    we.expect("Pair<String, Integer> p1 = new Pair<>(\"CS2030S\", 100)", p1.toString(), "(CS2030S,100)");

    Pair<String, Number> p2 = new Pair<>("CS2030S", 100);
    we.expect("Pair<String, Number> p2 = new Pair<>(\"CS2030S\", 100)", p2.toString(), "(CS2030S,100)");
    we.expect("p1.equals(p2)", p1.equals(p2), true);
    
    we.expect("p1.equals(new Pair<>(\"CS2030S\", 100))", p1.equals(new Pair<>("CS2030S", 100)), true);
    we.expect("p1.equals(new Pair<>(\"CS2030S\", null))", p1.equals(new Pair<>("CS2030S", null)), false);
    we.expect("p1.equals(new Pair<>(null, null))", p1.equals(new Pair<>(null, null)), false);
    
    p2 = new Pair<>(null, null);
    we.expect("p2 = new Pair<>(null, null)", p2.toString(), "(null,null)");
    we.expect("p2.equals(new Pair<>(null, null))", p2.equals(new Pair<>(null, null)), false);
  }  
}
