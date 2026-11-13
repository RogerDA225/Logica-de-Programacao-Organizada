
package ex01subrotinas2;

public class Ex01SubRotinas2 {
    
    static int contagem(int cont) {
        if (cont <= 100) {
         System.out.println(cont);  
         return contagem(cont+1);
        } 
        return cont;
    }

    public static void main(String[] args) {
        contagem(0);
    }
    
}
