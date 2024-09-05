/open Payroll.java
/open Employee.java
/open Chief.java

Payroll payroll = new Payroll();
Employee chief = new Chief(100000, 5000);

payroll.register(chief);
payroll.getTotalSalary(); // 100000
payroll.getTotalSalary(); // 105000
payroll.getTotalSalary(); // 110000