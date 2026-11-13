import java.util.Scanner;

public class Ex8SubRotinas{

    static void maior_menor(int a, int b, int c, int d, int e) {
        int[] temp = {a, b, c, d, e};
        int maior = a, menor = b;
        for (int i = 0; i < 5 ; i++) {
            if (temp[i] > maior) {
                maior = temp[i];
            } 
            if (temp[i] < menor) {
                menor = temp[i];
            }
        } 
        System.out.println("O maior eh: " + maior);
        System.out.println("O menor eh: " + menor);
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int primeiro, segundo, terceiro, quarto, quinto;
        System.out.println("Digite o primeiro numero: ");
        primeiro = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        segundo = teclado.nextInt();
        System.out.println("Digite o terceiro numero: ");
        terceiro = teclado.nextInt();
        System.out.println("Digite o quarto numero: ");
        quarto = teclado.nextInt();
        System.out.println("Digite o quinto numero: ");
        quinto = teclado.nextInt();
        maior_menor(primeiro, segundo, terceiro, quarto, quinto);

    }
}