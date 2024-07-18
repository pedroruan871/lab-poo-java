public class Main {
  public static void main(String[] args) {
    var nota = Character.parseChar(args[0]);
    if (nota == 'A') {
      System.out.println("Entre 90 e 100");
    }
    if (nota == 'B') {
      System.out.println("Entre 80 e 89");
    }
    if (nota == 'C'){
      System.out.println("Entre 70 e 79");
    }
    if (nota == 'D'){
      System.out.println("Entre 60 e 69");
    }
    if (nota == 'F'){
      System.out.println("Abaixo de 60");
    }
  }
}