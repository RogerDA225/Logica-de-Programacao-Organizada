
package ex07subrotinas;

import java.util.Scanner;

public class Ex07SubRotinas {

    static boolean caracteristica(int N) {
        boolean primo = true;
        for (int d = 2; d < N; d++) {
            if (N % d == 0) {
                primo = false;
            }
        }
        return primo;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String mensagem;
        boolean primo;
        System.out.println("Digite o numero: ");
        numero = teclado.nextInt();
        primo = caracteristica(numero);
        if (primo == true) {
            System.out.println("Primo");
        } else {
            System.out.println("Nao primo");
        }
        
    }
    
}
