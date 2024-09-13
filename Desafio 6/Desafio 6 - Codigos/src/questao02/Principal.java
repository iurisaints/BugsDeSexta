package questao02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner readKeyboard = new Scanner(System.in);
        Double numMeses;
        Double taxaJurosMensal;
        Double valorDepositoRegular;
        Double valorObtidoFinal;

        System.out.println("CALCULADORA :: DEPOSITOS REGULARES \n\n");

        System.out.println("Informe o número de meses da aplicação: ");
        numMeses = readKeyboard.nextDouble();
        System.out.println("Informe a taxa de juros mensal (%): ");
        taxaJurosMensal = readKeyboard.nextDouble();
        System.out.println("Informe o valor do deposito regular: R$ ");
        valorDepositoRegular = readKeyboard.nextDouble();

        AplicDepositoRegular op = new AplicDepositoRegular();
        valorObtidoFinal = op.calcAplicDepositosReg(numMeses, taxaJurosMensal, valorDepositoRegular);

        System.out.println("Valor obrido ao final da aplicação: R$ " + String.format("%.2f", valorObtidoFinal));

    }

}
