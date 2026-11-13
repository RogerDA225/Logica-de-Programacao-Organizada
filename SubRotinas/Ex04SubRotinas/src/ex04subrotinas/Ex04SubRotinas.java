
package ex04subrotinas;

import java.util.Scanner;

public class Ex04SubRotinas {
    
    static String condicao(int a, int b, int c) {
        String tipo;
        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            if (a != b && a != c && a != b) {
                tipo = "Escaleno";
            }  else if (a == b && b == c && a == c) {
                tipo = "Equilatero";
                
            } else if (a == b || a == c || b == c) {
                tipo = "Isosceles";
            } else {
                tipo = "Eh um triangulo";
            }
        } else  {
            tipo = "Nao eh um triangulo";
        }
        return tipo;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ladoA, ladoB, ladoC;
        String tipo_triangulo;
        System.out.println("Digite o primeiro lado: ");
        ladoA = teclado.nextInt();
        System.out.println("Digite o segundo lado: ");
        ladoB = teclado.nextInt();
        System.out.println("Digite o terceiro lado: ");
        ladoC = teclado.nextInt();
        tipo_triangulo = condicao(ladoA, ladoB, ladoC);
        System.out.println(tipo_triangulo);
    }
    
}
