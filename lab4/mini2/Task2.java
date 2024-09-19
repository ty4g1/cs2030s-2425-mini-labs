/**
 * This test only works for Task 2
 */
public class Task2 {
  public static void main(String[] args) {
    CS2030STest we = new CS2030STest();

    class A {
      @Override
      public String toString() {
        return "A";
      }
    }
    class B extends A {
      @Override
      public String toString() {
        return "B";
      }
    }
    class C extends B {
      @Override
      public String toString() {
        return "C";
      }
    }

    Pair<B, B> p1 = new Pair<>(new B(), new B());
    we.expect("Pair<B, B> p1 = new Pair<>(new B(), new B())", p1.toString(), "(B,B)");

    Pair<C, A> p2 = new Pair<>(new C(), new A());
    we.expect("Pair<C, A> p2 = new Pair<>(new C(), new A())", p2.toString(), "(C,A)");
    
    we.expectCompile("p1.swap(p2)", 
        "class A {} class B extends A {} class C extends B {}" +
        "Pair<B, B> p1 = new Pair<>(new B(), new B());" +
        "Pair<C, A> p2 = new Pair<>(new C(), new A());" +
        "p1.swap(p2);", 
        true);
    we.expectCompile("p2.swap(p1)", 
        "class A {} class B extends A {} class C extends B {}" +
        "Pair<B, B> p1 = new Pair<>(new B(), new B());" +
        "Pair<C, A> p2 = new Pair<>(new C(), new A());" +
        "p2.swap(p1);", 
        false);
    we.expectCompile("p1.swap(p2)", 
        "class A {} class B extends A {} class C extends B {}" +
        "Pair<B, B> p1 = new Pair<>(new B(), new B());" +
        "p1.swap(p1);", 
        true);
    we.expectCompile("p1.swap(p2)", 
        "class A {} class B extends A {} class C extends B {}" +
        "Pair<C, A> p2 = new Pair<>(new C(), new A());" +
        "p2.swap(p2);", 
        true);
    we.expectCompile("p1.swap(p2)", 
        "class A {} class B extends A {} class C extends B {}" +
        "Pair<B, B> p1 = new Pair<>(new B(), new B());" +
        "Pair<C, A> p2 = new Pair<>(new C(), new A());" +
        "p1.<B, B>swap(p2);", 
        true);
    we.expectCompile("p1.swap(p2)", 
        "class A {} class B extends A {} class C extends B {}" +
        "Pair<B, B> p1 = new Pair<>(new B(), new B());" +
        "Pair<C, A> p2 = new Pair<>(new C(), new A());" +
        "p1.<B>swap(p2);", 
        true);
  }
}
