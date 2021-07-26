package padroesestruturais.composite;

public class Topico extends Conteudo {

    private int cargaHoraria;

    public Topico(String descricao, int cargaHoraria) {
        super(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getConteudo() {
        return "Tópico: " + this.getDescricao() + " - carga horária: " + this.cargaHoraria + "\n";
    }

}
