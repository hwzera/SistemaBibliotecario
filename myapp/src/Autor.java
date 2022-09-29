import java.util.Scanner;

public class Autor extends Pessoa{
    private int qtoLivros;
    private String area;

    public Autor(String _nome, String _area){
        this.nome = _nome;
        this.area =_area;
    }

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
        return "Autor: \t\t\t" + this.nome + "\nQuantidade de Livros: \t" + this.qtoLivros + "\nArea de Atuação: \t" + this.area;
    }

    public static Autor lerAutor(){
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o nome do autor: ");
        String nome = in.nextLine();

        System.out.print("Digite a area de atuação do autor: ");
        String area = in.nextLine();

        Autor objAutor = new Autor(nome, area);

        return objAutor;
    }
}