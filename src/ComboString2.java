public class ComboString2 {
  public String comboString(String a, String b) {
    int lena = a.length();
    int lenb = b.length();

    if (lena < lenb) {
      return (a + b + a);
    } else {
      return (b + a + b);
    }
  }
}
