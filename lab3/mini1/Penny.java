public class Penny extends Company {
  private int valuation;

  public Penny(String name, int valuation) {
    super(name);
    this.valuation = valuation;
  }

  @Override
  public void oneYear() {
    if (this.valuation % 2 == 0) {
      this.valuation = this.valuation / 2;
    } else {
      this.valuation = 3 * this.valuation + 1;
    }
  }

  @Override
  public String toString() {
    return super.toString() + " [$$$]: $" + this.valuation;
  }
}