
package ex06subrotinas2;

public class Ex06SubRotinas2 {
    
    static int[] invertido(int[] vet) {
        int[] inverso = new int [vet.length];
        for (int i = 0; i < vet.length; i++) {
            inverso[i] = vet[vet.length - i - 1];
        }
        return inverso;
    }

    public static void main(String[] args) {
        int[] vetor = {2, 4, 6, 8, 10};
        int[] invertido;
        invertido = invertido(vetor);
        for (int i = 0; i < invertido.length; i++) {
            System.out.println(invertido[i]);
        }
    }
    
}
