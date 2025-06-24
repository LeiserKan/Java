public class Pin_Code {
  public static void main(String[] args) {
    int pin = 0;
    String formatierteZahl="0";
    for (int i = 0; i < 10000; i++) {
        pin = i;
        String test_pin=String.valueOf(pin);
        if (test_pin.length()==1){
           formatierteZahl = String.format("%0"+4+"d",pin);
        }else if(test_pin.length()==2){
           formatierteZahl = String.format("%0"+4+"d",pin);
        }else if(test_pin.length()==3){
           formatierteZahl = String.format("%0"+4+"d",pin);
        }
        else if(test_pin.length()==4){
          formatierteZahl =String.valueOf(pin);
      }
        System.out.println(formatierteZahl);
    }
  }
}
