public class Main {
  public static void main(String []args){
  int anzahl;
  int zahl;
  int ist_or_not=7123217;
  boolean ergebnis=true;
  Palindrom check = new Palindrom();
  anzahl = check.anzahl_Stellen(ist_or_not);
  zahl = check.multiplikator(anzahl);
  ergebnis = check.palindrom(ist_or_not,zahl,anzahl);
  }
}
