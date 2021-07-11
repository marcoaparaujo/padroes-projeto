package padroescomportamentais.strategy;

public class OperacaoMedia implements Operacao {

    public float calcular(float valor1, float valor2) {
        return (valor1 + valor2) / 2;
    }
}
