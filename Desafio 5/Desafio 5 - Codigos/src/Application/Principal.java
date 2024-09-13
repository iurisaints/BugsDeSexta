package Application;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner readKeyboard = new Scanner(System.in);
        String palavraDigitada = null;
        String palavraEmbaralhada = null;

        System.out.println("Digite uma palavra:");
        palavraDigitada = readKeyboard.nextLine();

        EmbaralhadorPalavras op = new EmbaralhadorPalavras();
        palavraEmbaralhada = op.embaralharPalavras(palavraDigitada);

        System.out.println("Embaralhada: " + palavraEmbaralhada);

    }
}
