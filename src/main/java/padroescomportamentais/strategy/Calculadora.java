package padroescomportamentais.strategy;

public class Calculadora {

    private float valor1;
    private float valor2;

    public Calculadora(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public float calcular(Operacao operacao) {
        return operacao.calcular(valor1, valor2);
    }
}
