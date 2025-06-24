public class Palindrom {

  public int anzahl_Stellen(int zahl){
    int count=0;
    while (zahl > 10) {
      zahl = zahl / 10;
      count = count + 1;
    }
    count = count + 1;
    System.out.println("Die Zahl hat: " + count + " Stellen");
    return count;
  }
  public int multiplikator(int zahl){
    int mult = 1;
    for (int i = 0; i< zahl-1; i++){
      mult = mult*10;
    }
    System.out.println(mult);

    return mult;
  }
  //Parameter zahl = die zu prüfende zahl, divident die zahl drch die geteilt wird, zahl2 sind anzahl stellen
  public boolean palindrom(int zahl,int divident, int zahl2){
    int erste_stelle=0;
    int letzte_stelle =0;
    boolean palin = true;
    int durchläufe = zahl2/2;
    int divident2 = 1;
    System.out.println("Anzahl Durchläufe"+durchläufe);
    for(int i = 0; i <= durchläufe; i++) {
      erste_stelle = zahl / divident;
      System.out.println("Erste Stelle, Durchlauf"+i+"die Stelle"+erste_stelle);
      divident=divident/10;
      divident2=divident2*10;
      System.out.println("Divident2"+divident2);
      letzte_stelle = zahl % divident2;
      String alstext = Integer.toString(letzte_stelle);
      StringBuilder res = new StringBuilder();
      res.append(alstext);
      String richtigrum= String.valueOf(res.reverse());
      letzte_stelle=Integer.parseInt(richtigrum);
      System.out.println("letzte Stelle, durchlauf"+i+"die Stelle"+letzte_stelle);
      if (erste_stelle == letzte_stelle) {
        palin = true;
      } else {
        palin = false;
      }


      }

    System.out.println(palin);
    return palin;
  }

//    int div2 = 1;
//    for (int i = 0; i < count - 1; i++) {
//      div2 = div2 * 10;
//    }
//    //System.out.println("div2"+div2);
//    int div3 = div2 / 10;
//    //System.out.print("count2"+count2);
//    while (div3 > 0) {
//      divis = zahl / div3;
//      System.out.print("divis"+divis+"zahl"+zahl+" div3"+div3);
//      modul = zahl % div2;
//      System.out.print("modul"+modul);
//      if (div2 == modul) {
//        palin = true;
//      }
//      else{
//        palin = false;
//      }
//      div2 = div2 / 10;
//      System.out.println(palin);
    }

