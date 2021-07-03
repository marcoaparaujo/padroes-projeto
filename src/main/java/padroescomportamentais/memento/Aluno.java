package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private AlunoEstado estado;
    private List<AlunoEstado> memento = new ArrayList<AlunoEstado>();

    public AlunoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<AlunoEstado> getEstados() {
        return this.memento;
    }
}
