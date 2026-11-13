public class Ex2SubRotinas {

    static int soma(int inicio, int fim) {
        int acum = 0;
        for (int i = inicio + 1; i < fim; i++) {
            acum += i;
        }
        return acum;
    }

    public static void main(String[] args) {
        int total;
        total = soma(10, 15);
        System.out.println(total);
    }

}