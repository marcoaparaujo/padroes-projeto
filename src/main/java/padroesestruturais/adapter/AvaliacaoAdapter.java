package padroesestruturais.adapter;

public class AvaliacaoAdapter extends AvaliacaoNota {

    private IAvaliacao avaliacaoConceito;

    public AvaliacaoAdapter(IAvaliacao avaliacaoConceito) {
        this.avaliacaoConceito = avaliacaoConceito;
    }

    public String recuperarAvaliacao() {
        if (this.getNota() >= 9.0f)
            avaliacaoConceito.setAvaliacao("A");
        else
            if (this.getNota() >= 8.0f)
                avaliacaoConceito.setAvaliacao("B");
            else
                if (this.getNota() >= 7.0f)
                    avaliacaoConceito.setAvaliacao("C");
                else
                    avaliacaoConceito.setAvaliacao("D");
        return avaliacaoConceito.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoConceito.getAvaliacao().equals("A"))
            this.setNota(9.0f);
        else
            if (avaliacaoConceito.getAvaliacao().equals("B"))
                this.setNota(8.0f);
            else
                if (avaliacaoConceito.getAvaliacao().equals("C"))
                    this.setNota(7.0f);
                else
                    this.setNota(0.0f);
    }
}
