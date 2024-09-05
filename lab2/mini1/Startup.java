class Startup extends Company {
  private int valuation;
  private int year;
  private int curr;

  public Startup(String name, int valuation, int year) {
    super(name);
    this.valuation = valuation;
    this.year = year;
    this.curr = 0;
  }

  @Override
  public void oneYear() {
    this.curr++;

    if (this.curr == this.year) {
      this.valuation = this.valuation * 2;
      this.curr = 0;
    }
  }

  @Override
  public String toString() {
    return super.toString() + " [SUP]: $" + this.valuation;
  }
}