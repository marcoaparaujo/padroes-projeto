package padroescomportamentais.command;

public class Semestre {

    private int ano;
    private int semestre;
    private String situacao;

    public Semestre(int ano, int semestre) {
        this.ano = ano;
        this.semestre = semestre;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirSemestre() {
        this.situacao = "Semestre aberto";
    }

    public void fecharSemestre() {
        this.situacao = "Semestre fechado";
    }
}
