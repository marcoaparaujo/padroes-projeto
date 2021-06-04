package padroescomportamentais.state;

public class PadraoState {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Antonio");
        System.out.println("Aluno " + aluno.getNome()
                + " está no estado " + aluno.getNomeEstado()
                + " - " + aluno.trancar());
        System.out.println("Aluno " + aluno.getNome()
                + " está no estado " + aluno.getNomeEstado()
                + " - " + aluno.formar());
    }
}
