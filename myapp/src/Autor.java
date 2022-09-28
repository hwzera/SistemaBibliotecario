import java.util.Scanner;

public class Autor extends Pessoa{
    private int qtoLivros;
    private String area;

    public int getQtoLivros() {
        return this.qtoLivros;
    }

    public void setQtoLivros(int qtoLivros) {
        this.qtoLivros = qtoLivros;
    }

    public String getArea(){
        return this.area;
    }

    public void setArea(String area){
        this.area = area;
    }

    public String toString(){
        return "Nome: \t\t\t" + this.nome + "\nData de Nascimento: \t" + this.dtNascimento + "\nQuantidade de Livros: \t" + this.qtoLivros + "\nArea de Atuação: \t" + this.area;
    }

    public static Autor leAutor(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o nome do autor: ");
        String nome = in.nextLine();

        System.out.print("Digite a area de atuação do autor: ");
        String area = in.nextLine();

        Autor objAutor = new Autor();

        return objAutor;
    }
}