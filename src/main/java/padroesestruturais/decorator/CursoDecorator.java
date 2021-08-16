package padroesestruturais.decorator;

public abstract class CursoDecorator implements Curso {

    private Curso curso;
    public String estrutura;

    public CursoDecorator(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public abstract float getPercentualCargaHoraria();

    public float getCargaHoraria() {
        return this.curso.getCargaHoraria() * (1 + (this.getPercentualCargaHoraria() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.curso.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
