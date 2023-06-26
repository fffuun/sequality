package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
    expected = 55;
    assertEquals(expected, calculate.sumto(1, 10));
    expected = 1;
    assertEquals(expected, calculate.odd(1, 1));
    expected = 0;
    assertEquals(expected, calculate.odd(2, 2));
    expected = 0;
    assertEquals(expected, calculate.even(1, 1));
    expected = 2;
    assertEquals(expected, calculate.even(2, 2));
  }
}
