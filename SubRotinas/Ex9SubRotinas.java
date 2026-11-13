public class Ex8SubRotinas {

    static String[] abreviado(String nome){
        String resp[] = nome.split(" ");
        for (int i=1; i < resp.length - 1; i++) {
            resp[i] = resp[i].charAt(0) + ".";
        }
        return resp;
    }

    public static void main(String[] args) {
        String[] nome_abreviado;
        nome_abreviado = abreviado("Pedrinho Moreira Pereira de Souza");
        for (int i=0; i < nome_abreviado.length; i++) {
            System.out.print(nome_abreviado[i] + " ");
        }
    }
}