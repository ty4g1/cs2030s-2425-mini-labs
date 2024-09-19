/**
 * This test only works for Task 2
 */
public class Task2 {
  public static void main(String[] args) {
    CS2030STest we = new CS2030STest();

    Point p1 = Point.of(1, 1);
    we.expect("Point p1 = Point.of(1, 1)", p1.toString(), "(1,1)");

    Point p2 = Point.of(1, 1);
    we.expect("Point p2 = Point.of(1, 1)", p2.toString(), "(1,1)");
    
    we.expect("p1 == p2", p1 == p2, false);
    we.expect("p1.moveTo(2, 2);", p1.moveTo(2, 2).toString(), "(2,2)");

    Point p3 = p2.moveTo(1, 1);
    we.expect("Point p3 = p2.moveTo(1, 1); p3", p3.toString(), "(1,1)");
    we.expect("p3 == p2", p3 == p2, true);
    we.expect("p3 == p1", p3 == p1, false);
  }
}
