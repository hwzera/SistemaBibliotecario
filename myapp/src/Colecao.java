import java.util.ArrayList;
import java.util.List;

public class Colecao {
    

    public static void main(String[] args) {
        
        List<Autor> lista = new ArrayList<Autor>();

        for(int i = 0; i < lista.size(); i++){
            System.out.println("Autor = " + lista.get(i).getNome());
        }
    }
}
