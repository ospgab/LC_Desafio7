import java.util.Locale;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class Frase {
    private String entrada;

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String tudoMaiusculo(){
        return "Maiúsculo: " + entrada.toUpperCase(Locale.ROOT);
    }

    public String tudoMinusculo(){
        return "Minúsculo: " + entrada.toLowerCase(Locale.ROOT);
    }

    public String camelCase(){
        String[] novaEntrada = entrada.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String palavra : novaEntrada){
            String alteracao = palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase() + " ";
            sb.append(alteracao);
        }

        char c = sb.toString().toLowerCase().charAt(0);


        sb.setCharAt(0,c);

       return "Camel Case: " + sb;
    }


    public String retiraAcentos(){
        String entradaNormalizada = Normalizer.normalize(this.entrada, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return "Sem acentos: " +pattern.matcher(entradaNormalizada).replaceAll("");
    }
}
