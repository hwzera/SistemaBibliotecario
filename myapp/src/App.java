import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) throws Exception {


     /*   Scanner scanner = new Scanner(System.in);

        Autor obj1 = new Autor();
        System.out.print("Digite o nome do autor: ");
        obj1.setNome(scanner.next()); 
       
        Estudante objMathews = new Estudante("123456789", "Mathews");
        objMathews.setCurso("Análise e Desenvolvimento de Sistemas");
        objMathews.setDtNascimento(LocalDate.of(1999, Month.MAY, 26));

        Estudante objCamila = new Estudante("987654321", "Camila");


        Funcionario objFunc1 = new Funcionario("Gatinho", "157");
        objFunc1.setDtNascimento(LocalDate.of(2012, Month.DECEMBER, 12));
        objFunc1.setStatus(true);

        Funcionario objFunc2 = new Funcionario("Gatinha", "155");

        Autor objAutor1 = new Autor("Assis", "N sei");

        objAutor1.setQtoLivros(100);

        Livro l = new Livro();
        l.setTitulo("Programando em JS");
        l.setAnoLancamento(2022);
        l.setEditora("Editora XYZ");
        l.setNpag(220);
        l.setAutor(objAutor1);

        Emprestimo novoEmprestimo = new Emprestimo(l, objFunc2, objCamila);

        System.out.println(objMathews);
        System.out.println("\n\n\n");
        System.out.println(objFunc1);
        System.out.println("\n\n\n");
        System.out.println(novoEmprestimo); */

        //Funcionario Camila = Funcionario.lerFuncionario();
        //System.out.println(Camila.getNome());

        //Autor nvAutor = Autor.lerAutor();

        Estudante objCamila = new Estudante("987654321", "Camila");
        objCamila.setCurso("Analise e Desenvolvimento de Sistemas");
        objCamila.setDtNascimento(LocalDate.of(2003, Month.JANUARY, 24));


        Funcionario objFunc2 = new Funcionario("Alguma funcionario", "155");


        Autor objAutor1 = new Autor("Algum Autor", "Alguma area");
        objAutor1.setDtNascimento(LocalDate.of(1970, Month.JULY, 12));
        objAutor1.setQtoLivros(10);

        Livro l = new Livro();
        l.setTitulo("Programando em JS");
        l.setAnoLancamento(2022);
        l.setEditora("Editora XYZ");
        l.setNpag(220);
        l.setAutor(objAutor1);

        Emprestimo novoEmprestimo = new Emprestimo(l, objFunc2, objCamila);

        System.out.println(novoEmprestimo);
    }
}
