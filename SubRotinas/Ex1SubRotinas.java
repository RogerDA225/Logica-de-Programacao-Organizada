import java.util.Scanner;
public class Ex8SubRotinas {

  static double multiplicacao(double a, double b) {
    double p;
    p = a * b;
    return p;
  }

  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      double num1, num2, produto;
      System.out.println("Digite o primeiro numero: ");
      num1 = teclado.nextInt();
      System.out.println("Digite o segundo numero: ");
      num2 = teclado.nextInt();
      produto = multiplicacao(num1, num2);
      System.out.println("A multiplicacao eh: " + produto);
  }

}