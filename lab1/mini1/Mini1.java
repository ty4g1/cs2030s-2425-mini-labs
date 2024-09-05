import java.util.Scanner;

/**
 * The main class for CS2030S Lab 01 Mini 1.
 *
 * @author dcsaysp
 * @version CS2030 AY24/25 S1
 */
class Mini1 {
  /** 
   * The list of companies.
   */
  private Company[] companies;

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

  public static void main(String[] args) {
    // Create a scanner to read from standard input.
    Scanner sc = new Scanner(System.in);

    Mini1 runner = new Mini1(sc);
    runner.run();
  }

  public Mini1(Scanner sc) {
    // Number of companies
    int numCompanies = sc.nextInt();

    // Number of years
    this.numYears = sc.nextInt();

    // Initialize companies
    this.companies = new Company[numCompanies];

    // Read the data for each company from stdin
    for (int i = 0; i < numCompanies; i++) {
      int industryTypes = sc.nextInt();
      if (industryTypes == Mini1.MNC) {
        this.companies[i] = new MNC(sc.next(), sc.nextInt());
      } else if (industryTypes == Mini1.STARTUP) {
        this.companies[i] = new Startup(sc.next(), sc.nextInt(), sc.nextInt());
      } else if (industryTypes == Mini1.SME) {
        this.companies[i] = new SME(sc.next(), sc.nextInt(), sc.nextInt());
      }
    }

    // Close the scanner
    sc.close();
  }

  public void run() {
    /**
     * TODO: Refactor this poorly written for loop
     */
    for (int i = 0; i < this.numYears; i++) {
      for (int j = 0; j < this.companies.length; j++) {
        this.companies[j].oneYear();
      }
    }

    /**
     * TODO: Refactor this poorly written for loop
     */
    for (int j = 0; j < this.companies.length; j++) {
      System.out.println(this.companies[j].toString());
    }
  }
}