/*
Value is always false (b4)
  'b4' was assigned (b3)
    'b3' was assigned (b2)
      'b2' was assigned (b1)
        'b1' was assigned (b)
          'b == false' was established from condition (b)
 */
import org.jetbrains.annotations.NotNull;

class Test {
  void test(boolean b) {
    if (b) return;
    boolean b1 = b;
    boolean b2 = b1;
    boolean b3 = b2;
    boolean b4 = b3;
    if (<selection>b4</selection>) {}
  }
}