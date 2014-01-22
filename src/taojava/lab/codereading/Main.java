package taojava.lab.codereading;

/**
 * The puppetmaster for this lab.  Runs some of our sample programs.
 *
 */
public class Main 
{
  /**
   * Print some not-very-interesting output.
   */
  public static void 
    main (String[] args) 
  {
    java.io.PrintWriter pen = new java.io.PrintWriter (System.out, true);
    for (int i = 0; i < 5; i++) 
      {
        pen.println (i + " squared is " + MathUtils.square (i));
      } // for
    
    for (double j = 1; j < 10; j++)
      {
        double num = j / 10;
        pen.println (num + " squared is " + MathUtils.square(num));
      } // for
    
    pen.close ();
  } // main(String[])
} // class Main
