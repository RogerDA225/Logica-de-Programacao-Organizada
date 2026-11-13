
package ex04subrotinas2;

public class Ex04SubRotinas2 {

    static double medio(double[] vet) {
        double soma = 0, media;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        media = soma / vet.length;
        return media;
    }
    
    public static void main(String[] args) {
        double[] temp = {1,2, 3, 4, 5};
        double media;
        media = medio(temp);
        System.out.println(media);
    }
    
}
