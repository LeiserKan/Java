import javax.swing.*;
public class EndlichesProdukt {
  public static void main(String[] args) {
    //Startwert
    String eingabeStart = JOptionPane.showInputDialog("Geben Sie die Anfangszahl ein: ");
    int s = Integer.parseInt(eingabeStart);
    //Endwert
    String eingabeEnde = JOptionPane.showInputDialog("Geben Sie die Endzahl ein: ");
    int e = Integer.parseInt(eingabeEnde);
    //Ergebnis
    int ergebnis = 1;

    if (e <= 0 || s <= 0) {
      ergebnis = 0;
    } else if (e < s) {
      int z = e;
      e = s;
      s = z;
    }

    for (int i = s; i <= e; i++) {
      ergebnis = ergebnis * i;
    }
    System.out.println(ergebnis);
  }
}




