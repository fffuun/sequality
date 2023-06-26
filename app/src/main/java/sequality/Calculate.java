package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sumto(int x, int y) {
    int s = 0;
    for (int i = x; i <= y; i++) {
      s = s + i;
    }
    return s;
  }

  public int odd(int x, int y) {
    int s = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 != 0) {
        s = s + i;
      }
    }
    return s;
  }

  public int even(int x, int y) {
    int s = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        s = s + i;
      }
    }
    return s;
  }
}
