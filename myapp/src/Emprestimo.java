import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Funcionario func;
    private Estudante estudante;
    private LocalDate dtEmprestimo;
    private LocalDate dtDevolucao;

    public Emprestimo(Livro _livro, Funcionario _func, Estudante _estudante){
        this.livro = _livro;
        this.func = _func;
        this.estudante = _estudante;
        this.dtEmprestimo = LocalDate.now();
    }


    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Funcionario getFunc() {
        return this.func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public Estudante getEstudante() {
        return this.estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public LocalDate getDtEmprestimo() {
        return this.dtEmprestimo;
    }

    public void setDtEmprestimo(LocalDate dtEmprestimo) {
        this.dtEmprestimo = dtEmprestimo;
    }

    public LocalDate getDtDevolucao() {
        return this.dtDevolucao;
    }

    public void setDtDevolucao(LocalDate dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

}
