package Application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorPalavras {

    public String embaralharPalavras(String palavra) {

        List<String> letras = Arrays.asList(palavra.split(""));
        Collections.shuffle(letras);

        StringBuilder palavraEmbaralhada = new StringBuilder(palavra.length());

        for (String s : letras) {
            palavraEmbaralhada.append(s);
        }
        return palavraEmbaralhada.toString();
    }

}
