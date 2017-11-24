import java.util.function.Supplier;

/**
 * Created by qiuzhanghua on 2017/2/7.
 */
//[1, 2, 4, 7, 13, 24, 44, 81, 149, 274]
public class FibonacciSupplier implements Supplier<Long> {
  private long a = 1;
  private long b = 2;
  private long c = 4;

  
  @Override
  public Long get() {
    long p = a;
    long next = c + b + a;
    a = b;
    b = c;
    c = next;
    return p;
  }
}
