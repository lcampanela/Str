package isel.poo;

public class Str { //extends Object {
  private static final int MAX_DIM = 64;      // static porque é geral para a classe, não para cada objecto
  char[] text = new char[MAX_DIM];
  private int dim = 0;

  //public Str() { System.out.println("Str()");}  // não é necessário declarar
  public Str(String txt) {
    for ( ; dim < txt.length(); ++dim)
      text[dim] = txt.charAt(dim);
  }

  // não estático:
  // Str o:   o.append('a');
  public void append (char c) {
    text[dim++] = c;
  }

  public void append(String s) {
    //TODO:
  }
  public String toString() {
    return new String(text, 0, dim );
  }


}
