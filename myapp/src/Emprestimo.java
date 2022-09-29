import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Funcionario func;
    private Estudante estudante;
    private LocalDate dtEmprestimo;
    private LocalDate dtDevolucao;

    private final int DIAS_EMPRESTIMO = 5;

    public Emprestimo(Livro _livro, Funcionario _func, Estudante _estudante){
        this.livro = _livro;
        this.func = _func;
        this.estudante = _estudante;
        this.dtEmprestimo = LocalDate.now();
        this.dtDevolucao = this.dtEmprestimo.plusDays(DIAS_EMPRESTIMO);
    }

    public void devolverLivro() {
        this.dtDevolucao = LocalDate.now();
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

    @Override
    public String toString(){
        return livro + "\nData de emprestimo: \t" + this.dtEmprestimo + "\nData de devolucao: \t" + this.dtDevolucao + "\n" + estudante + "\n" + func;
    }
}
