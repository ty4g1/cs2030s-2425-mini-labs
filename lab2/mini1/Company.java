class Company {
  private String name;

  public Company(String name) {
    this.name = name;
  }

  public void oneYear() {
    // Do nothing
  }

  @Override
  public String toString() {
    return this.name;
  }
}