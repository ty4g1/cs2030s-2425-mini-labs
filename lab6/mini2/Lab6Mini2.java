import cs2030s.fp.Maybe;
import cs2030s.fp.Transformer;
import java.util.HashMap;
import java.util.Map;

public class Lab6Mini2 {
  public static void main(String[] args) {
    Account[] accounts = new Account[] {
      new Account(1, 100.0),
      new Account(2, 150.0),
      new Account(3, 90.0),
      new Account(4, 70.0, true)
    };

    Map<Integer, Account> map = new HashMap<>();
    for (Account a : accounts) {
      map.put(a.getAccountNumber(), 
          new Account(a.getAccountNumber(), a.getBalance(), a.isClosed()));
    }

    Bank NUSBank = new Bank(map);
    System.out.println(NUSBank);
    NUSBank.transfer(1, 2, 30); // transfer $30 from account 1 to 2.
    NUSBank.transfer(2, 1, 40); // transfer $40 from account 2 to 1.
    System.out.println(NUSBank);
    NUSBank.transfer(1, 4, 50); // transfer $50 from account 1 to 4. (Failed, acc 4 is closed).
    NUSBank.transfer(3, 2, 150); // transfer $150 from account 3 to 2. (Failed, balance is not enough).
    NUSBank.transfer(9, 10, 150); // transfer $150 from account 9 to 10. (Failed, no such account exist).
    System.out.println(NUSBank);
    NUSBank.transfer(2, 3, 150); // transfer $150 from account 2 to 3. 
    System.out.println(NUSBank);
  }
}