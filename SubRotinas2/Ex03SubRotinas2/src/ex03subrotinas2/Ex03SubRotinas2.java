
package ex03subrotinas2;

import java.util.Scanner;

public class Ex03SubRotinas2 {
    
    static double maior(double[] vet) {
        double num_maior = vet[0];
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > num_maior) {
                num_maior = vet[i];
            }
        }
        return num_maior;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanho;
        double maior;
        System.out.println("Digite o tamanho do vetor: ");
        tamanho = teclado.nextInt();
        double vetor[] = new double [tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i+1) + "o termo: ");
            vetor[i] = teclado.nextDouble();
        }
        maior = maior(vetor);
        System.out.println("O maior eh: " + maior);
    }
    
}
