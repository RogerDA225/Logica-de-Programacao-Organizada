

public class Ex7SubRotinas2 {

    static int[] unico(int[] vet) {
        int tamanho = vet.length;
        int[] temp = new int [tamanho];
        int quantidade_unicos = 0;
        for (int i=0;i < tamanho; i++) {
            boolean jaExiste = false;
            for (int j = 0; j < quantidade_unicos; j++) {
                if (vet[i] == temp[j]) {
                    jaExiste = true;
                } 
            }
            if (!jaExiste) {
                temp[quantidade_unicos] = vet[i];
                quantidade_unicos++;
            }
        }
        return temp; 
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 2, 4, 4, 5, 5, 6, 7, 7, 8, 9, 9};
        int[] correto = new int [vetor.length];
        correto = unico(vetor);
        for (int i = 0; i < vetor.length; i++) {
            if (correto[i] != 0) {
              System.out.println(correto[i]);
            }
        }

    }
}