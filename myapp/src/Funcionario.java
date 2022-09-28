import java.util.Scanner;

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

    public String isStatus() {
        return this.status ? "Ativo" : "Inativo";
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public String toString(){
        return "Nome: \t\t\t" + this.nome + "\nData de Nascimento: \t" + this.dtNascimento + "\nMatricula: \t\t" + this.matricula + "\nStatus: \t\t" + isStatus();
    }

    public static Funcionario lerFuncionario(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = in.nextLine();

        System.out.print("Digite a matrícula do Funcionário: ");
        String matricula = in.nextLine();

        Funcionario objFuncionario = new Funcionario(matricula, nome);

        return objFuncionario;
    }
}