package padroesestruturais.bridge;

public class Coordenador extends Cargo {

    public Coordenador(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.escolaridade.percentualAumento());
    }

}
