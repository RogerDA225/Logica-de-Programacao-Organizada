
package ex05subrotinas;

public class Ex05SubRotinas {

    static void calculo(double nota1, double nota2, double nota3, char letra) {
        if (letra == 'A') {
            double media = (nota1 + nota2 + nota3) / 3.0;
            System.out.println("Media: " + media);
        } else if (letra == 'P') {
            double media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / 10.0;
            System.out.println("Media: " + media);
        }
    }
    public static void main(String[] args) {
        calculo(1, 2, 3, 'P');
    }
    
}
