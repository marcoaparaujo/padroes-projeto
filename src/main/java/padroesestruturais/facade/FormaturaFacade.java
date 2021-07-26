package padroesestruturais.facade;

public class FormaturaFacade {

    public static boolean verificarPendencias(Aluno aluno) {
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
