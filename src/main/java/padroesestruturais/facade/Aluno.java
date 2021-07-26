package padroesestruturais.facade;

import java.text.Normalizer;

public class Aluno {

    public boolean formar() {
        return AlunoFacade.verificarPendenciasFormatura(this);
    }
}
