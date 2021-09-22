package padroesestruturais.facade;

public class Secretaria extends Setor {

    private static Secretaria secretaria = new Secretaria();

    private Secretaria() {};

    public static Secretaria getInstancia() {
        return secretaria;
    }

}
