
package ex06subrotinas;

import java.util.Scanner;

public class Ex06SubRotinas {
    
    static int duracao(int hi, int mi, int hf, int mf) {
        int d = 0;
        if (hi <= hf) {
             d = (hf * 60 + mf - hi * 60 - mi); 
        } 
        if (hi > hf) {
             d = (1440 - hi * 60 - mi + hf * 60 + mf);
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora_inicio, minuto_inicio, hora_fim, minuto_fim, duracao_jogo;
        System.out.println("Digite a hora do inicio do jogo: ");
        hora_inicio = teclado.nextInt();
        System.out.println("Digite o minuto do inicio do jogo: ");
        minuto_inicio = teclado.nextInt();
        System.out.println("Digite a hora do fim do jogo: ");
        hora_fim = teclado.nextInt();
        System.out.println("Digite o minuto do fim do jogo: ");
        minuto_fim = teclado.nextInt();
        duracao_jogo = duracao(hora_inicio, minuto_inicio, hora_fim, minuto_fim);
        System.out.println("Duracao: " + duracao_jogo + " minutos");
    }
    
}
