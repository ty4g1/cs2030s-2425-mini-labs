/**
 * This test only works for Task 1
 */
public class Task1 {
  public static void main(String[] args) {
    CS2030STest we = new CS2030STest();

    we.expect("Bool.<Integer>test(true).doThen(1).doElse(2).getVal()", Bool.<Integer>test(true).doThen(1).doElse(2).getVal(), 1);

    we.expect("Bool.<Integer>test(false).doThen(1).doElse(2).getVal()", Bool.<Integer>test(false).doThen(1).doElse(2).getVal(), 2);

    we.expect("Bool.<Integer>test(true).getVal()", Bool.<Integer>test(false).getVal(), null);

    we.expect("Bool.<Integer>test(false).getVal()", Bool.<Integer>test(false).getVal(), null);

    we.expect("Bool.<Integer>test(true).doThen(1).doThen(2).getVal()", Bool.<Integer>test(true).doThen(1).doThen(2).getVal(), 2);

    we.expect("Bool.<Integer>test(false).doElse(2).doElse(1).getVal()", Bool.<Integer>test(false).doElse(2).doElse(1).getVal(), 1);

    we.expect("Bool.<Integer>test(true).doElse(1).doElse(2).getVal()", Bool.<Integer>test(true).doThen(1).doThen(2).getVal(), null);

    we.expect("Bool.<Integer>test(false).doThen(2).doThen(1).getVal()", Bool.<Integer>test(false).doElse(2).doElse(1).getVal(), null);
  }  
}
