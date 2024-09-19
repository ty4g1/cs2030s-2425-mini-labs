/**
 * This test only works for Task 1
 */
public class Task1 {
  public static void main(String[] args) {
    CS2030STest we = new CS2030STest();

    Point p = new Point(1, 1);
    we.expect("Point p = new Point(1, 1)", p.toString(), "(1,1)");
    
    p.moveTo(2, 2);
    we.expect("p.moveTo(2, 2); p;", p.toString(), "(2,2)");
  }  
}
