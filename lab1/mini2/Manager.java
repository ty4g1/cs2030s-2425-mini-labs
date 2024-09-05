class Manager extends Employee {
  private int salary;

  public Manager(int salary) {
    this.salary = salary;
  }

  @Override
  public int getMonthlySalary() {
    return this.salary;
  }

  @Override
  public String toString() {
    return "Manager" + super.toString();
  }
}