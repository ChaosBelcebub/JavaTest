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
    return 0;
  }
}
