import javax.swing.*;

public class Schaltjahr {
  public static void main(String []args) {
    String jahr = JOptionPane.showInputDialog("Geben Sie die erste Zahl ein: ");
    int zahl = Integer.parseInt(jahr);
    boolean istSchaltjahr = false;

    if ((zahl % 4 == 0) && ((zahl % 100 != 0) || (zahl % 400 == 0))) {
      System.out.println(zahl + " ist ein Schaltjahr");
    } else {
      System.out.println(zahl + " ist kein Schaltjahr");
    }
  }}

