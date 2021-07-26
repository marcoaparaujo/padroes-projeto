package padroesestruturais.facade;

public class AlunoFacade {

    public static boolean verificarPendenciasFormatura(Aluno aluno) {
        if (Secretaria.getInstancia().verificarAlunoComPendencia(aluno)) {
            return false;
        }
        if (Biblioteca.getInstancia().verificarAlunoComPendencia(aluno)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarAlunoComPendencia(aluno)) {
            return false;
        }
        return true;
    }
}
