package padroescomportamentais.templatemethod;

public class AlunoEnsinoMedio extends Aluno {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 6.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}
