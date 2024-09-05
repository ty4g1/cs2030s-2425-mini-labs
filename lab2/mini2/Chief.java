class Chief extends Employee {
  private int salary;
  private int bonus;

  public Chief(int salary, int bonus) {
    this.salary = salary;
    this.bonus = bonus;
  }

  @Override
  public int getMonthlySalary() {
    int salary = this.salary;
    this.salary = this.salary + this.bonus;
    return salary;
  }

  @Override
  public String toString() {
    return "Chief" + super.toString();
  }
}