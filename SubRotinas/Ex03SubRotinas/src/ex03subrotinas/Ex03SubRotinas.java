
package ex03subrotinas;


public class Ex03SubRotinas {
    
    static void conversao(int s) {
        int h = s / 3600;
        s = s % 3600;
        int m = s / 60;
        s = s % 60;
        System.out.println("Horas: " + h);
        System.out.println("Minutos: " + m);
        System.out.println("Segundos: " + s);
    }

    public static void main(String[] args) {
        conversao(4000);
    }
    
}
