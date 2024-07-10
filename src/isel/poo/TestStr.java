package isel.poo;

public class TestStr {
  public static void main(String[] args) {
    Str s1 = new Str("abc"); // new Str();
    System.out.println(s1);     // -> abc
    s1.append('d');
    System.out.println(s1);     // -> abcd
    s1.append('x');
    System.out.println(s1);     // -> abcdx
    for (int i=0; i<30; ++i)
      s1.append((char) ('A'+i));
    System.out.println(s1);     // -> abcdxABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^

    Str s2 = new Str("xpto");
    System.out.println(s2);     // -> xpto
  }
}
