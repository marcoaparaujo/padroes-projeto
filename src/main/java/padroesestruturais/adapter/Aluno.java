package padroesestruturais.adapter;

public class Aluno {

    IAvaliacao avaliacao;
    AvaliacaoAdapter persistencia;

    public Aluno() {
        avaliacao = new AvaliacaoConceito();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setAvaliacao(conceito);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getNota() {
        return persistencia.getNota();
    }

}
