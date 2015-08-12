/**
* A simple class for fractions
*
* @author Michael Kotzjan
* @version 1.0
*/
public class Fraction
{
  // Numerator and denominator
  private int n;
  private int d;

  // Constructor
  public Fraction(int x, int y)
  {
    this.n = x;
    if (y != 0)
    {
      this.d = y;
    } else {
      System.out.println("Denominator can't be zero. Is set to one.");
      this.d = 1;
    }
    cancel();
  }

  // Returns the fraction as string
  public String get()
  {
    if (this.n == 0)
    {
      return "0";
    } else if (this.d == 1) {
      return String.valueOf(this.n);
    } else {
      return String.valueOf(this.n) + "/" + String.valueOf(this.d);
    }
  }

  // Returns the smallest number which can divide n and d
  private int ggt(int x, int y)
  {
    if (y > x)
    {
      return ggt(y, x);
    } else {
      return ((y == 0) ? x : ggt(y, x % y));
    }
  }

  // Cancels the fraction and handles negation
  private void cancel()
  {
    int t = ggt(((this.n >= 0) ? this.n : this.n * -1),
                ((this.d >= 0) ? this.d : this.d * -1));

    this.n /= t;
    this.d /= t;
    
    // -1/-2 == 1/2
    if (this.n < 0 && this.d < 0)
    {
      this.n *= -1;
      this.d *= -1;
    // 1/-2 == -1/2
    } else if (this.d < 0) {
      this.n *= -1;
      this.d *= -1;
    }
    // TODO: Add posibility for 2 1/2 - Mi 12 Aug 2015 19:11:52 CEST
    
  }

  // Add another fraction
  public void add(Fraction f)
  {
    int x = this.n * f.d;
    int y = f.n * this.d;
    int z = this.d * f.d;

    this.n = x + y;
    this.d = z;
    cancel();
  }
  
  // Add int
  public void add(int i)
  {
    this.add(new Fraction(i, 1));
  }

  // Multiply by fraction
  public void mul(Fraction f)
  {
    this.n *= f.n;
    this.d *= f.d;
    cancel();
  }

  // Multiply by integer
  public void mul(int i)
  {
    this.n *= i;
    cancel();
  }

  // Substract a fraction
  public void sub(Fraction f)
  {
    f.mul(-1);
    this.add(f);
  }

  // Substract a integer
  public void sub(int i)
  {
    this.add(new Fraction(i * -1, 1));
  }
}
