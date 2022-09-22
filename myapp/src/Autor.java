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

}