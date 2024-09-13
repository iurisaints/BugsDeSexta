package questao02;

public class AplicDepositoRegular {

    public double calcAplicDepositosReg(double numMeses, double taxaJurosMensal, double valorDepRegular) {

        double valorObtidoFinal;
        valorObtidoFinal = (1 + (taxaJurosMensal / 100)) * (Math.pow((1 + (taxaJurosMensal / 100)), numMeses)) - 1 / (taxaJurosMensal / 100) * valorDepRegular;
        return valorObtidoFinal;
    }

}
