import java.util.Scanner;

/**
 * The main class for CS2030S Lab 03 Mini 1.
 *
 * @author dcsaysp
 * @version CS2030 AY24/25 S1
 */
class Mini3 {
  /** 
   * The list of companies.
   */
  private Stack<Company> companies;
  
  private int numCompanies;

  /**
   * The number of year.
   */
  private int numYears;

  /**
   * Different types of companies.
   */
  private static final int MNC = 1;
  private static final int STARTUP = 2;
  private static final int SME = 3;
  private static final int PENNY = 4;

  public static void main(String[] args) {
    // Create a scanner to read from standard input.
    Scanner sc = new Scanner(System.in);

    Mini3 runner = new Mini3(sc);
    runner.run();
  }

  public Mini3(Scanner sc) {
    // Number of companies
    this.numCompanies = sc.nextInt();

    // Number of years
    this.numYears = sc.nextInt();

    // Initialize companies
    this.companies = new Stack<Company>(this.numCompanies);

    // Read the data for each company from stdin
    for (int i = 0; i < this.numCompanies; i++) {
      int industryTypes = sc.nextInt();
      Company company = null;
      if (industryTypes == Mini3.MNC) {
        company = new MNC(sc.next(), sc.nextInt());
      } else if (industryTypes == Mini3.STARTUP) {
        company = new Startup(sc.next(), sc.nextInt(), sc.nextInt());
      } else if (industryTypes == Mini3.SME) {
        company = new SME(sc.next(), sc.nextInt(), sc.nextInt());
      } else if (industryTypes == Mini3.PENNY) {
        company = new Penny(sc.next(), sc.nextInt());
      }
      this.companies.push(company);
    }

    // Close the scanner
    sc.close();
  }

  public void run() {
    Stack<Company> tmp = new Stack<Company>(this.numCompanies);
    for (int i = 0; i < this.numYears; i++) {
      while (!this.companies.isEmpty()) {
        Company company = this.companies.pop();
        company.oneYear();
        tmp.push(company);
      }
      // Copy back
      while (!tmp.isEmpty()) {
        this.companies.push(tmp.pop());
      }
    }

    while (!this.companies.isEmpty()) {
      Company company = this.companies.pop();
      System.out.println(company);
      tmp.push(company);
    }
    // Copy back
    while (!tmp.isEmpty()) {
      this.companies.push(tmp.pop());
    }
  }
}