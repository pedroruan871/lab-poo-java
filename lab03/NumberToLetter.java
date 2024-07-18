public class Main {
  public static void main(String[] args) {
    var nota = Integer.parseInt(args[0]);
    if (nota >= 90) {
      System.out.println("A");
    }
    if (nota >= 80 && nota < 90) {
      System.out.println("B");
    }
    if (nota >= 70 && nota < 80){
      System.out.println("C");
    }
    if (nota >= 60 && nota < 70){
      System.out.println("D");
    }
    if (nota < 60){
      System.out.println("F");
    }
  }
}