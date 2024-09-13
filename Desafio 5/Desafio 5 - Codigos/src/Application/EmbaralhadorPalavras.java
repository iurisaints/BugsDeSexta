package Application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorPalavras {

    public String embaralharPalavras(String palavra) {

        //O erro se encontra no método trim!
        //List<String> letras = Arrays.asList(palavra.trim());
        // Este método retorna uma string com espaços em branco removidos.
        // O método correto é o split, que divide esta string em torno das 
        // correspondências da expressão regular fornecida, que neste caso é o "".     
        List<String> letras = Arrays.asList(palavra.split(""));
        Collections.shuffle(letras);

        StringBuilder palavraEmbaralhada = new StringBuilder(palavra.length());

        for (String s : letras) {
            palavraEmbaralhada.append(s);
        }
        return palavraEmbaralhada.toString();
    }

}
