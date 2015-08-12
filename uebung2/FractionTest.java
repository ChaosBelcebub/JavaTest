/**
* Tests the fraction class
*
* @author Michael Kotzjan
* @version 1.0
*/
public class FractionTest
{
  
  /**
  * Main
  *
  * @param args parameter
  */
  public static void main(String[] args)
  {
    Fraction a = new Fraction(1, 2);
    System.out.println("Fraction(1, 2):");
    System.out.println(a.get());

    Fraction b = new Fraction(-1, 2);
    System.out.println("Fraction(-1, 2):");
    System.out.println(b.get());

    Fraction c = new Fraction(1, -2);
    System.out.println("Fraction(1, -2):");
    System.out.println(c.get());

    Fraction d = new Fraction(2, 4);
    System.out.println("Fraction(2, 4):");
    System.out.println(d.get());

    Fraction e = new Fraction(-2, -4);
    System.out.println("Fraction(-2, -4):");
    System.out.println(e.get());

    System.out.println("Fraction(4, 0):");
    Fraction f = new Fraction(4, 0);
    System.out.println(f.get());
    
    a.add(d);
    System.out.println("1/2 + 2/4 = " + a.get());
    
    b.add(new Fraction(2, 3));
    System.out.println("-1/2 + 2/3 = " + b.get());

    f.add(new Fraction(6, 8));
    System.out.println("4 + 6/8 = " + f.get());

    b.add(4);
    System.out.println("-1/2 + 4 = " + b.get());

    Fraction g = new Fraction(4, 1);
    g.mul(new Fraction(1, 2));
    System.out.println("4/1 * 1/2 = " + g.get());

    g.mul(5);;
    System.out.println("2/1 * 5 = " + g.get());
  }
}
