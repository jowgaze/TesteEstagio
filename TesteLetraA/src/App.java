import java.text.Normalizer;

public class App {

    /**
     * <h1>Remover acentos</h1>
     * 
     * @param str palavra com acentuação
     * @return palavra formatada sem acentuação
     */
    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public static void main(String[] args) throws Exception {
        String palavra = "Pássaro";
        int count = 0;

        for (int i = 0; i < palavra.length(); i++) {
            if (removerAcentos(palavra).toUpperCase().charAt(i) == 'A')
                count++;
        }

        if (count == 0)
            System.out.println("Não existe a letra a na palavra " + palavra);
        else
            System.out.println(palavra + " tem " + count + " letra(s) a(s)");
    }
}
