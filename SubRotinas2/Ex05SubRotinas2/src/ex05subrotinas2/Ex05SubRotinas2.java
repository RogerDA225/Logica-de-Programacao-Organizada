
package ex05subrotinas2;

public class Ex05SubRotinas2 {
    
    static boolean presenca(int[] vet, int num) {
        for (int i = 0; i < vet.length; i++) {
            if (num == vet[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int numero = 6;
        boolean presenca;
        presenca = presenca(vetor, numero);
        System.out.println(presenca);
        
    }
    
}
