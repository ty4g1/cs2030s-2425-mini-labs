import cs2030s.fp.Maybe;
import java.util.Map;

class Bank {
  private Map<Integer, Account> accounts;

  /**
   * Constructs a new Bank with the given list of accounts and customers.
   *
   * @param accounts  a map of account numbers and their associated accounts
   * @param customers an list of customers
   */
  public Bank(Map<Integer, Account> accounts) {
    this.accounts = accounts;
  }

  /**
   * Returns the account with the specified account number.
   *
   * @param number the account number to search for
   * @return the Account with the specified account number, or null if not found
   */
  private Account findAccount(int number) {
    // Map::get returns null if the account does not exist
    return accounts.get(number);
  }

  /**
   * Transfers the specified amount of money between accounts.
   *
   * @param from   the account number to transfer money from
   * @param to     the account number to transfer money to
   * @param amount the amount of money to transfer
   */
  /*
  public void transfer(int from, int to, double amount) {
    Account fromAccount = findAccount(from);
    Account toAccount = findAccount(to);
    if (fromAccount != null && toAccount != null && fromAccount.getBalance() >= amount &&
        !fromAccount.isClosed() && !toAccount.isClosed()) {
      fromAccount.transferTo(toAccount, amount);
    }
  }
  */

  public void transfer(int from, int to, double amount) {
    Maybe<Account> fromAccount = Maybe.of(findAccount(from))
        .filter(x -> !x.isClosed() && x.getBalance() >= amount);
    Maybe<Account> toAccount = Maybe.of(findAccount(to))
        .filter(x -> !x.isClosed());
    fromAccount.flatMap(f -> toAccount.map(t -> f.transferTo(t, amount)));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Bank Status:\n");
    this.accounts.forEach((k, v) -> sb.append(v + "\n"));
    return sb.toString();
  }
}
