package padroesestruturais.bridge;

public class Administrativo extends Cargo {

    public Administrativo(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
