package padroescomportamentais.interpreter;

public class Subtracao implements InterpretadorExpressao {
    private double x;
    private double y;

    public Subtracao (Numero elementoEsquerda, Numero elementoDireita) {
        x = elementoEsquerda.getNumero();
        y = elementoDireita.getNumero();
    }

    public double interpretar() {
        return x - y;
    }
}
