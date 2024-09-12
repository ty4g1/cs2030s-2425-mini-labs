public class FullTime extends Employee {
  private int salary;
  private int overtimeHour;
  private int overtimeRate;

  public FullTime(int salary, int overtimeHour, int overtimeRate) {
    this.salary = salary;
    this.overtimeHour = overtimeHour;
    this.overtimeRate = overtimeRate;
  }

  @Override
  public int getMonthlySalary() {
    return this.salary + (this.overtimeHour * this.overtimeRate);
  }

  @Override
  public String toString() {
    return "FullTime" + super.toString();
  }
}