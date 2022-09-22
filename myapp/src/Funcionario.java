public class Funcionario extends Pessoa{
    private String matricula;
    private boolean status = true;

    public Funcionario(String _nome, String _matricula){
        this.matricula = _matricula;
        this.nome = _nome;
    }
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public String toString(){
        return "Nome: \t\t\t" + this.nome + "\nData de Nascimento: \t" + this.dtNascimento + "\nMatricula: \t\t" + this.matricula + "\nStatus: \t\t" + isStatus();
    }
}