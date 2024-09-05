/open Payroll.java
/open Employee.java
/open Intern.java

Payroll payroll = new Payroll();
Employee intern = new Intern(40, 50, 160, 25);

payroll.register(intern);
payroll.getTotalSalary(); // previously 6000, now 8000