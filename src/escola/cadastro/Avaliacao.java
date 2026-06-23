package escola.cadastro;

public class Avaliacao<T> {

    private T nota;
    private Aluno aluno;

    public Avaliacao(T nota, Aluno aluno) {
        this.nota = nota;
        this.aluno = aluno;
    }

    public T getNota() {
        return nota;
    }

    public void setNota(T nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
