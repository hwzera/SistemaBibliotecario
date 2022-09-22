import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) throws Exception {


     /*   Scanner scanner = new Scanner(System.in);

        Autor obj1 = new Autor();
        System.out.print("Digite o nome do autor: ");
        obj1.setNome(scanner.next()); */
       
        Estudante objMathews = new Estudante("123456789", "Mathews");
        objMathews.setCurso("Análise e Desenvolvimento de Sistemas");
        objMathews.setDtNascimento(LocalDate.of(1999, Month.MAY, 26));

        Estudante objCamila = new Estudante("987654321", "Camila");


        Funcionario objFunc1 = new Funcionario("Gatinho", "157");
        objFunc1.setDtNascimento(LocalDate.of(2012, Month.DECEMBER, 12));
        objFunc1.setStatus(true);

        Funcionario objFunc2 = new Funcionario("Gatinha", "155");

        Autor objAutor1 = new Autor();
        objAutor1.setNome("Assis");
        objAutor1.setQtoLivros(100);
        objAutor1.setArea("Sei lá");

        Livro l = new Livro();
        l.setTitulo("Programando em JS");
        l.setAnoLancamento(2022);
        l.setEditora("Editora XYZ");
        l.setNpag(220);
        l.setAutor(objAutor1);


        System.out.println(objMathews);
        System.out.println("\n\n\n");
        System.out.println(objFunc1);
        System.out.println("\n\n\n");
        System.out.println();
    }
}
