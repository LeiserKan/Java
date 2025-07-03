public class Sanduhr {
  public static void main(String[] args) {

    int rows = 4;
    for (int i = rows-1; i > 0; i--) {
      // Leerzeichen
      for (int space = 0; space < rows - i - 1; space++) {
        System.out.print(" ");
      }
      // Raute-Zeichen
      for (int hash = 0; hash < 2 * i + 1; hash++) {
        System.out.print("#");
      }
      System.out.println();
    }
    for (int i = 0; i < rows; i++) {
      // Leerzeichen
      for (int space = 0; space < rows - i - 1; space++) {
        System.out.print(" ");
      }
      // Raute-Zeichen
      for (int hash = 0; hash < 2 * i + 1; hash++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }
}
