
package ex02subrotinas2;

public class Ex02SubRotinas2 {
    
    static boolean palindromo(String palavra, int cont) {
        if (palavra.charAt(cont) == palavra.charAt(palavra.length() - 1 - cont)) {
            cont++;
            if (cont == palavra.length() - 1) {
                return true;
            }
            return palindromo(palavra, cont);
        } else {
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        if (palindromo("Victor Boff", 0) == true) {
            System.out.println("Eh um palindromo");
        } else {
            System.out.println("Nao eh um palindromo");
        }
    }
    
}
