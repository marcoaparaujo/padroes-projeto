package padroescomportamentais.strategy;

public class Aluno {

    private float nota;

    public float getNota() {
        return nota;
    }

    public void somarNota(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.nota = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairNota(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.nota = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirNota(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.nota = calculadora.calcular(new OperacaoDividir());
    }

    public void multiplicarNota(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.nota = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaNotas(float nota1, float nota2) {
        Calculadora calculadora = new Calculadora(nota1, nota2);
        this.nota = calculadora.calcular(new OperacaoMedia());
    }

}
