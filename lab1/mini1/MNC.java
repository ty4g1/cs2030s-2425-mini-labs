class MNC extends Company {
  private int valuation;

  public MNC(String name, int valuation) {
    super(name);
    this.valuation = valuation;
  }

  @Override
  public String toString() {
    return "[" + super.toString() + "]: $" + this.valuation;
  }
}