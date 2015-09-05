import java.util.Arrays;
/**
* Java class for sorting algorithms
*
* @author Michael Kotzjan
* @version 1.0
*/
public class Sort
{

  public void mergesort(Integer[] x)
  {
    if (x.length == 1)
    {
      return;
    }

    int a = x.length / 2;
    Integer[] l = Arrays.copyOfRange(x, 0, a);
    Integer[] r = Arrays.copyOfRange(x, a, x.length);
    
    mergesort(l);
    mergesort(r);

    int lPos = 0;
    int rPos = 0;
    int i = 0;
    while (lPos < l.length && rPos < r.length) {
      if (l[lPos] < r[rPos])
      {
        x[i] = l[lPos];
        lPos++;
      } else {
        x[i] = r[rPos];
        rPos++;
      }
      i++;
    }
    while (lPos < l.length)
    {
      x[i++] = l[lPos++];
    }
    while (rPos < r.length)
    {
      x[i++] = r[rPos++];
    }
  }
}
