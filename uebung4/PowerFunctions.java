/**
* Contains two ways to calculate the power of a number
*
* @author Michael Kotzjan
* @version 1.0
*/
public class PowerFunctions
{
  public static double power(double x, int n)
  {
    double result = 1;
    for (int i = 0; i < n; i++)
    {
      result *= x;
    }
    return result;
  }

  public static double fastPower(double x, int n)
  {
    double result = 1;
    String b = Integer.toBinaryString(n);
    for (int i = 0; i < b.length(); i++)
    {
      result = (result * result);
      if (b.charAt(i) == '1')
      {
        result = result * x;
      }
    }
    return result;
  }

  
  /**
  * Main
  *
  * @param args parameter
  */
  public static void main(String[] args)
  {
    System.out.println(Double.toString(power(4, 5)));
    System.out.println(Double.toString(fastPower(4, 5)));
  }
}
